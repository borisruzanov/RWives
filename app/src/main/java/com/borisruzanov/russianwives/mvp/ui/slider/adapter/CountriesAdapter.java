package com.borisruzanov.russianwives.mvp.ui.slider.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.borisruzanov.russianwives.R;
import com.borisruzanov.russianwives.models.Country;

import java.util.List;

public class CountriesAdapter extends BaseAdapter {


    private List<Country> countries;
    private LayoutInflater layoutInflater;
    private int mSelectedPos=-1;
    private Context context;

    public CountriesAdapter(Context context, List<Country> countries) {
        this.countries = countries;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context =context;
    }

    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Object getItem(int position) {
        return countries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item_country, viewGroup, false);
        }

        Country country = getCountry(position);
        TextView textView = view.findViewById(R.id.item_country_title);
        textView.setText(country.getCountryName());
        view.setBackgroundColor(Color.TRANSPARENT);
        if (position==mSelectedPos){
            //if current position is equal to selected Position then change color of itemView
            view.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
        }
        return view;
    }

    private Country getCountry(int position) {
        return (Country) getItem(position);
    }

    /***
     * change a color of specified position item
     * @param position a position of selected item
     */
    public void changeSelection(int position){
        mSelectedPos=position;
        notifyDataSetChanged();
    }

    /***
     * remove color filter from selected a item
     */
    public void removeSelection(){
        mSelectedPos=-1;
        notifyDataSetChanged();
    }
}
