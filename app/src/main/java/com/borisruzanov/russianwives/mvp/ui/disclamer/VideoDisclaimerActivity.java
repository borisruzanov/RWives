package com.borisruzanov.russianwives.mvp.ui.disclamer;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.borisruzanov.russianwives.R;
import com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs;
import com.borisruzanov.russianwives.mvp.ui.video.VideoRecordingActivity;
import com.borisruzanov.russianwives.utils.Consts;
import com.borisruzanov.russianwives.utils.LanguageConfig;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class VideoDisclaimerActivity extends AppCompatActivity {

    @BindView(R.id.video_disclaimer_title_text) TextView mTitle;
    @BindView(R.id.video_disclaimer_info_text) TextView mDisclaimerInfo;
    @BindView(R.id.video_disclaimer_back_button) AppCompatButton mBack;
    @BindView(R.id.video_disclaimer_start_button) AppCompatButton mStart;
    @BindView(R.id.video_disclaimer_toolbar) Toolbar mToolbar;

    Prefs mPrefs;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_disclaimer);
        ButterKnife.bind(this);
        mPrefs=new Prefs(this);

        //check Language & set value according it.
        if (LanguageConfig.isRussian()){
           mToolbar.setTitle(mPrefs.getValue(Consts.VIDEO_DISCLAIMER_TOOLBAR_TITLE_RUS));
           mTitle.setText(mPrefs.getValue(Consts.VIDEO_DISCLAIMER_TITLE_RUS));
           mDisclaimerInfo.setText(mPrefs.getValue(Consts.VIDEO_DISCLAIMER_DESCRIPTION_RUS));
        }
        else{

            mToolbar.setTitle(mPrefs.getValue(Consts.VIDEO_DISCLAIMER_TOOlBAR_TITLE_ENG));
            mTitle.setText(mPrefs.getValue(Consts.VIDEO_DISCLAIMER_TITLE_ENG));
            mDisclaimerInfo.setText(mPrefs.getValue(Consts.VIDEO_DISCLAIMER_DESCRIPTION_ENG));
        }


        setSupportActionBar(mToolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_black_24dp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //on back button click
    @OnClick(R.id.video_disclaimer_back_button)
    public void onBack(View view){
        onBackPressed();
    }

    //on start button click
    @OnClick(R.id.video_disclaimer_start_button)
    public void onStart(View view){
        startActivity(new Intent(VideoDisclaimerActivity.this, VideoRecordingActivity.class));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
