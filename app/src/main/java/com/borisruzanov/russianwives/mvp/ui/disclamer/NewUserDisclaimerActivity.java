package com.borisruzanov.russianwives.mvp.ui.disclamer;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;

import com.borisruzanov.russianwives.R;
import com.borisruzanov.russianwives.eventbus.ListStringEvent;
import com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs;
import com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository;
import com.borisruzanov.russianwives.mvp.ui.main.MainScreenActivity;
import com.borisruzanov.russianwives.mvp.ui.slider.SliderActivity;
import com.borisruzanov.russianwives.utils.Consts;
import com.borisruzanov.russianwives.utils.LanguageConfig;
import com.firebase.ui.auth.AuthUI;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewUserDisclaimerActivity extends AppCompatActivity {

    @BindView(R.id.disclaimer_title_text) TextView mTitle;
    @BindView(R.id.disclaimer_info_text) TextView mDisclaimerInfo;
    @BindView(R.id.disclaimer_agree_button) AppCompatButton mAgree;
    @BindView(R.id.disclaimer_cancel_button) AppCompatButton mCancel;
    AlertDialog mDialog;
    Prefs mPrefs;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);
        ButterKnife.bind(this);
        mPrefs=new Prefs(this);
        if(LanguageConfig.isRussian()){

            mTitle.setText(mPrefs.getValue(Consts.DISCLAIMER_TITLE_RUS));
            mDisclaimerInfo.setText(mPrefs.getValue(Consts.DISCLAIMER_DESCRIPTION_RUS));
            mAgree.setText(getResources().getString(R.string.agree_text_rus));
            mCancel.setText(getResources().getString(R.string.cancel_text_rus));
        }else{
            mTitle.setText(mPrefs.getValue(Consts.DISCLAIMER_TITLE_ENG));
            mDisclaimerInfo.setText(mPrefs.getValue(Consts.DISCLAIMER_DESCRIPTION_ENG));
            mAgree.setText(getResources().getString(R.string.agree_text_eng));
            mCancel.setText(getResources().getString(R.string.cancel_text_eng));
        }
        //create dialog on the start
        mDialog= (AlertDialog) createDialog();
    }

    @OnClick(R.id.disclaimer_agree_button)
    public void onAgree(View view){
        onNext();
    }

    @OnClick(R.id.disclaimer_cancel_button)
    public void onCancel(View view){
        mDialog.show();
    }

    /***
     * it create a dialog which show when user click cancel button
     * @return Dialog
     */
    private Dialog createDialog()
    {
        AlertDialog.Builder build =new AlertDialog.Builder(this);
        build.setMessage(mPrefs.getValue(LanguageConfig.isRussian()?Consts.DISCLAIMER_DESCRIPTION_DIALOG_TITLE_RUS:Consts.DISCLAIMER_DESCRIPTION_DIALOG_TITLE_ENG));
        build.setPositiveButton(getResources().getString(R.string.yes),(dialog1, which) -> {
            new Prefs(NewUserDisclaimerActivity.this).setValue(Consts.NEWUSER_DISCLAIMER_ACCEPT,Consts.FALSE);
            AuthUI.getInstance().signOut(getApplicationContext()).addOnCompleteListener(
                    task -> {
                        Intent mainScreen=new Intent(NewUserDisclaimerActivity.this, MainScreenActivity.class);
                        mainScreen.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mainScreen.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(mainScreen);
                        finish();
                    }
            );
        });
        build.setNegativeButton(getResources().getString(R.string.no),(dialog1, which) -> {
            onNext();
        });
        return build.create();
    }

    /***
     * call to sliderIntent to complete registration
     * @param listStringEvent
     */
    @Subscribe
    public void callSlider(ListStringEvent listStringEvent){
        Intent sliderIntent = new Intent(NewUserDisclaimerActivity.this, SliderActivity.class);
        sliderIntent.putStringArrayListExtra(Consts.DEFAULT_LIST,listStringEvent.getList());
        startActivity(sliderIntent);
        finish();
    }

    /***
     * get field list from userRepository
     */
    public void onNext(){
        UserRepository userRepository= new UserRepository(new Prefs(getApplicationContext()));
        Map<String, Object> map=new HashMap<>();
        map.put(Consts.NEWUSER_DISCLAIMER_ACCEPT,Consts.TRUE);
        userRepository.updateField(map,() -> {
            new Prefs(this).setValue(Consts.NEWUSER_DISCLAIMER_ACCEPT,Consts.TRUE);
        });
        userRepository.getDefaultFieldsList();
    }

    @Override
    protected void onResume() {
        super.onResume();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (EventBus.getDefault().isRegistered(this))
            EventBus.getDefault().unregister(this);
    }


}
