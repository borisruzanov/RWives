package com.borisruzanov.russianwives.mvp.ui.slider;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.borisruzanov.russianwives.CountriesList;
import com.borisruzanov.russianwives.R;
import com.borisruzanov.russianwives.eventbus.StringEvent;
import com.borisruzanov.russianwives.models.Country;
import com.borisruzanov.russianwives.mvp.model.repository.slider.SliderRepository;
import com.borisruzanov.russianwives.mvp.ui.slider.adapter.CountriesAdapter;
import com.borisruzanov.russianwives.utils.Consts;

import org.greenrobot.eventbus.EventBus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class SliderCountriesFragment extends Fragment {

    private boolean isCountry;
    private ListView countryCityList;
    private CountriesAdapter countriesAdapter;
    private boolean isComplete=false;
    private Button saveButton;
    private static int mSelectedPosition =-1;//a varaible to hold position of selected item from listView,-1 indicate that no item is selected
    private boolean isChangeAgain=false;

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
        Log.d("SliderDebug","onCreateView of CountryCity");
        View view = inflater.inflate(R.layout.fragment_slider_countries, container, false);
        isCountry=true;
        countryCityList = view.findViewById(R.id.country_list);
        countryCityList.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);
        TextView textView=view.findViewById(R.id.slider_countries_tv_question);
        saveButton=view.findViewById(R.id.fragment_slider_countries_btn_save);
        new SliderRepository().getFieldFromCurrentUser(Consts.CITY,value -> {
            try {
                if (value != null && !value.equals(Consts.DEFAULT)) {
                    isComplete=true;
                }
            }catch (IllegalStateException e){
                e.printStackTrace();
                Log.e("SliderCountry","Got a Exception---->>>>"+e.getMessage());
            }
        });
        setCountry();
        saveButton.setOnClickListener(v -> {
            //check for item selected or not
            if(mSelectedPosition == AdapterView.INVALID_POSITION){ //check for nothing selected
                //if not selected then Toast a message & return
                Toast.makeText(getActivity(),"Please select a "+(isCountry?Consts.COUNTRY:Consts.CITY),Toast.LENGTH_LONG).show();
                return;
            }
            if (isCountry) {
                //if it is for country
                    String country = CountriesList.initData().get(mSelectedPosition).getCountryName();
                    Log.d("SliderDebug","Country:-"+country);
                    if (!country.equals("           ")) {
                        //country value is saved in member varaible country
                        Map<String, Object> map = new HashMap<>();
                        map.put(Consts.COUNTRY, country);
                        new SliderRepository().updateFieldFromCurrentUser(map, () -> {
                            Toast.makeText(getActivity(), getString(R.string.country_updated), Toast.LENGTH_LONG).show();
                            textView.setText(R.string.choose_your_city);
                            isCountry=false;
                            setCity(country);
                            mSelectedPosition=-1;//reset to value
                            if (isComplete){
                                isChangeAgain=true;
                                Log.d("SliderDebug","isChangeAgain set true");
                                EventBus.getDefault().post(new StringEvent(Consts.DISABLE_NEXT_BUTTON));
                            }
                        });
                    }

                }
            else{
                //else for a city
                    Country cityObj= (Country) countryCityList.getItemAtPosition(mSelectedPosition); //get Country obj
                    String city=cityObj.getCountryName(); //get City name
                    Log.d("SliderDebug","City:-"+city);
                    Map<String, Object> map = new HashMap<>();
                    map.put(Consts.CITY, city);
                    //country and city add in fireStore
                    new SliderRepository().updateFieldFromCurrentUser(map, () -> {
                        if (getArguments() != null && getArguments().getString(Consts.NEED_BACK) != null) {
                            if (getActivity() != null) getActivity().onBackPressed();
                        }
                        Toast.makeText(getActivity(), getString(R.string.city_updated), Toast.LENGTH_LONG).show();
                        if(!isComplete) {
                            //if country and city not completed
                            EventBus.getDefault().post(new StringEvent(Consts.COMPLETE));
                            EventBus.getDefault().post(new StringEvent(Consts.BUTTON_NEXT));
                            EventBus.getDefault().post(new StringEvent(Consts.PROGRESSBAR));
                            EventBus.getDefault().post(new StringEvent(Consts.LEFT_STEP));
                            isComplete=true;
                        }else if (isChangeAgain){
                            //if after complete country is changed
                            EventBus.getDefault().post(new StringEvent(Consts.BUTTON_NEXT));
                        }
                        setCountry();
                        isCountry=true;
                        mSelectedPosition=-1;//reset to value
                    });
            }
        });
        countryCityList.setOnItemClickListener((parent, view1, position, id) -> {
            Log.d("selection","onclick pos:--->"+position);
            countriesAdapter.removeSelection();
            mSelectedPosition =position; //save a selected item position
            countriesAdapter.changeSelection(position);
            //countryCityList.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.colorAccent)); //change the selected item color
            /*if (isCountry) {
                String country = CountriesList.initData().get(position).getCountryName();
                Log.d("SliderDebug","Country:-"+country);
                if (!country.equals("           ")) {
                    //country value is saved in member varaible country
                    this.mCountry =country;
                    textView.setText(R.string.choose_your_city);
                    isCountry=false;
                    setCity(country);
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
            }*/
        });

        return view;
    }

    private void setCity(String country){
        List<Country> cityArrayList;
        switch (country) {
            case "USA":
                cityArrayList = CountriesList.initCity(getResources().getStringArray(R.array.us_city));
                cityArrayList.remove(0);
                countriesAdapter = new CountriesAdapter(getActivity(), cityArrayList);
                countryCityList.setAdapter(countriesAdapter);
                break;
            case "Ukraine":
                cityArrayList = CountriesList.initCity(getResources().getStringArray(R.array.ukraine_city));
                cityArrayList.remove(0);
                countriesAdapter = new CountriesAdapter(getActivity(), cityArrayList);
                countryCityList.setAdapter(countriesAdapter);
                break;
            case "Kazakhstan":
                cityArrayList = CountriesList.initCity(getResources().getStringArray(R.array.kazakhstan_city));
                cityArrayList.remove(0);
                countriesAdapter = new CountriesAdapter(getActivity(), cityArrayList);
                countryCityList.setAdapter(countriesAdapter);
                break;
            case "Russia":
                cityArrayList = CountriesList.initCity(getResources().getStringArray(R.array.russia_city));
                cityArrayList.remove(0);
                countriesAdapter = new CountriesAdapter(getActivity(), cityArrayList);
                countryCityList.setAdapter(countriesAdapter);
                break;
            default:
                cityArrayList = CountriesList.initCity(getResources().getStringArray(R.array.default_city));
                cityArrayList.remove(0);
                countriesAdapter = new CountriesAdapter(getActivity(), cityArrayList);
                countryCityList.setAdapter(countriesAdapter);
                break;
        }
    }

    /***
     * set countries to list
     */
    private void setCountry(){
        countriesAdapter = new CountriesAdapter(getActivity(), CountriesList.initData());
        countryCityList.setAdapter(countriesAdapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        if (isChangeAgain){
            EventBus.getDefault().post(new StringEvent(Consts.DISABLE_NEXT_BUTTON));
        }
    }


}
