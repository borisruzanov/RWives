package com.borisruzanov.russianwives.mvp.ui.slider;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.borisruzanov.russianwives.R;
import com.borisruzanov.russianwives.eventbus.StringEvent;

import org.greenrobot.eventbus.EventBus;

/**
 * A simple {@link Fragment} subclass.
 */
public class SliderLanguagesFragment extends Fragment {


    public SliderLanguagesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        EventBus.getDefault().post(new StringEvent("button_next","enable"));
        EventBus.getDefault().post(new StringEvent("progressbar",null));
        EventBus.getDefault().post(new StringEvent("steps_left",null));
        return inflater.inflate(R.layout.fragment_slider_languages, container, false);
    }

}
