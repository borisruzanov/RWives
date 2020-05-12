package com.borisruzanov.russianwives.mvp.ui.timer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatDialogFragment;
import com.borisruzanov.russianwives.R;
import com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs;
import com.borisruzanov.russianwives.utils.Consts;
import com.borisruzanov.russianwives.utils.Timer;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimerDialogFragment extends MvpAppCompatDialogFragment {

    public static final String TAG = "TimerDialogFragment";
    private FirebaseAnalytics firebaseAnalytics;
    private Prefs mPrefs;

    //UI
    private TextView mHours;
    private TextView mMinutes;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        View view = inflater.inflate(R.layout.dialog_timer, container, false);
        mHours = view.findViewById(R.id.timer_counter_hours);
        mMinutes = view.findViewById(R.id.timer_counter_minutes);

        firebaseAnalytics = FirebaseAnalytics.getInstance(getActivity());
        firebaseAnalytics.logEvent("timer_appear", null);
        mPrefs = new Prefs(getContext());

        String string =  mPrefs.getValue(Consts.FREE_USER_TRIGGER_TIME);
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.ENGLISH);
        try {
            Date date = format.parse(string);
            String hours = String.valueOf(Timer.getInstance().getHour(date));
            String minutes = String.valueOf(Timer.getInstance().getMinutes(date));

            mHours.setText(hours);
            mMinutes.setText(minutes);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        return view;
    }

}
