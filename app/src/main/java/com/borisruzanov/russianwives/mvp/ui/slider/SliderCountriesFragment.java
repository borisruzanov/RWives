package com.borisruzanov.russianwives.mvp.ui.slider;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.borisruzanov.russianwives.CountriesList;
import com.borisruzanov.russianwives.R;
import com.borisruzanov.russianwives.eventbus.StringEvent;
import com.borisruzanov.russianwives.mvp.model.repository.slider.SliderRepository;
import com.borisruzanov.russianwives.mvp.ui.slider.adapter.CountriesAdapter;
import com.borisruzanov.russianwives.utils.Consts;

import org.greenrobot.eventbus.EventBus;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class SliderCountriesFragment extends Fragment {

    private boolean isCountry;
    private ListView countryCityList;
    private String mCountry =null;
    private CountriesAdapter countriesAdapter;
    private boolean isComplete=false;
    public SliderCountriesFragment() {
        // Required empty public constructor
    }

    public static SliderCountriesFragment newInstance() {
        SliderCountriesFragment fragment = new SliderCountriesFragment();
        Bundle args = new Bundle();
        args.putString(Consts.NEED_BACK, Consts.BACK);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slider_countries, container, false);
        isCountry=true;
        countryCityList = view.findViewById(R.id.country_list);
        TextView textView=view.findViewById(R.id.slider_countries_tv_question);
        new SliderRepository().getFieldFromCurrentUser(Consts.CITY,value -> {
            try {
                if (value != null && !value.equals(Consts.DEFAULT)) {
                    isComplete = true;
                }
            }catch (IllegalStateException e){
                e.printStackTrace();
                Log.e("SliderCountry","Got a Exception---->>>>"+e.getMessage());
            }
        });
        setCountry();
        countryCityList.setOnItemClickListener((parent, view1, position, id) -> {
            if (isCountry) {
                String country = CountriesList.initData().get(position).getCountryName();
                Log.d("SliderDebug","Country:-"+country);
                if (!country.equals("           ")) {
                    //country value is saved in member varaible country
                    this.mCountry =country;
                    /*textView.setText(R.string.choose_your_city);
                    isCountry=false;
                    setCity(country);*/
                    Map<String, Object> map = new HashMap<>();
                    map.put(Consts.COUNTRY, country);
                    new SliderRepository().updateFieldFromCurrentUser(map, () -> {
                        Toast.makeText(getActivity(), getString(R.string.country_updated), Toast.LENGTH_LONG).show();
                        textView.setText(R.string.choose_your_city);
                        isCountry=false;
                        setCity(country);
                    });
                }
            }
            else{
                String city= (String) countryCityList.getItemAtPosition(position);
                Log.d("SliderDebug","City:-"+city);
                Map<String, Object> map = new HashMap<>();
                map.put(Consts.CITY, city);
                //country and city add in firestore
                new SliderRepository().updateFieldFromCurrentUser(map, () -> {
                    if (getArguments() != null && getArguments().getString(Consts.NEED_BACK) != null) {
                        if (getActivity() != null) getActivity().onBackPressed();
                    }
                    Toast.makeText(getActivity(), getString(R.string.country_city_updated), Toast.LENGTH_LONG).show();
                    if(!isComplete) {
                        EventBus.getDefault().post(new StringEvent(Consts.COMPLETE));
                        EventBus.getDefault().post(new StringEvent(Consts.BUTTON_NEXT));
                        EventBus.getDefault().post(new StringEvent(Consts.PROGRESSBAR));
                        EventBus.getDefault().post(new StringEvent(Consts.LEFT_STEP));
                        isComplete=true;
                    }
                    setCountry();
                    isCountry=true;
                });
            }
        });
        return view;
    }

    private void setCity(String country){
        ArrayAdapter<CharSequence> cityAdapter;
        if (country.equals("USA")){
            cityAdapter = ArrayAdapter.createFromResource(getActivity(),R.array.us_city,android.R.layout.simple_list_item_1);
            countryCityList.setAdapter(cityAdapter);
        }
        else if (country.equals("Ukraine")){
            cityAdapter = ArrayAdapter.createFromResource(getActivity(),R.array.ukraine_city,android.R.layout.simple_list_item_1);
            countryCityList.setAdapter(cityAdapter);
        }
        else if (country.equals("Kazakhstan")){
            cityAdapter = ArrayAdapter.createFromResource(getActivity(),R.array.kazakhstan_city,android.R.layout.simple_list_item_1);
            countryCityList.setAdapter(cityAdapter);
        }
        else if (country.equals("Russia")){
            cityAdapter = ArrayAdapter.createFromResource(getActivity(),R.array.russia_city,android.R.layout.simple_list_item_1);
            countryCityList.setAdapter(cityAdapter);
        }
        else {
            cityAdapter = ArrayAdapter.createFromResource(getActivity(),R.array.default_city,android.R.layout.simple_list_item_1);
            countryCityList.setAdapter(cityAdapter);
        }
    }

    /***
     * set countries to list
     */
    private void setCountry(){
        countriesAdapter = new CountriesAdapter(getActivity(), CountriesList.initData());
        countryCityList.setAdapter(countriesAdapter);
    }


}
