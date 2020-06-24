package com.borisruzanov.russianwives.mvp.ui.disclamer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.widget.TextView;

import com.borisruzanov.russianwives.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewUserDisclaimerActivity extends AppCompatActivity {

    @BindView(R.id.disclaimer_title_text) TextView mTitle;
    @BindView(R.id.disclaimer_info_text) TextView mDisclaimerInfo;
    @BindView(R.id.disclaimer_agree_button) AppCompatButton mAgree;
    @BindView(R.id.disclaimer_cancel_button) AppCompatButton mCancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);
        ButterKnife.bind(this);

    }


}
