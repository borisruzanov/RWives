package com.borisruzanov.russianwives.mvp.ui.slider;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.borisruzanov.russianwives.R;
import com.borisruzanov.russianwives.eventbus.StringEvent;
import com.borisruzanov.russianwives.utils.Consts;

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
        EventBus.getDefault().post(new StringEvent(Consts.BUTTON_NEXT));
        EventBus.getDefault().post(new StringEvent(Consts.PROGRESSBAR));
        EventBus.getDefault().post(new StringEvent(Consts.LEFT_STEP));
        return inflater.inflate(R.layout.fragment_slider_languages, container, false);
    }

}
