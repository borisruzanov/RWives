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
import com.borisruzanov.russianwives.mvp.ui.main.MainScreenActivity;
import com.firebase.ui.auth.AuthUI;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewUserDisclaimerActivity extends AppCompatActivity {

    @BindView(R.id.disclaimer_title_text) TextView mTitle;
    @BindView(R.id.disclaimer_info_text) TextView mDisclaimerInfo;
    @BindView(R.id.disclaimer_agree_button) AppCompatButton mAgree;
    @BindView(R.id.disclaimer_cancel_button) AppCompatButton mCancel;
    AlertDialog mDialog;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);
        ButterKnife.bind(this);
        mDialog= (AlertDialog) createDialog();
    }

    @OnClick(R.id.disclaimer_agree_button)
    public void onAgree(View view){

    }

    @OnClick(R.id.disclaimer_cancel_button)
    public void onCancel(View view){
        mDialog.show();
    }

    private Dialog createDialog(){
        AlertDialog.Builder build =new AlertDialog.Builder(this);
        build.setMessage("Do you really want to cancel?");
        build.setPositiveButton("",(dialog1, which) -> {
            AuthUI.getInstance().signOut(getApplicationContext()).addOnCompleteListener(
                    task -> {
                        Intent mainScreen=new Intent(NewUserDisclaimerActivity.this, MainScreenActivity.class);
                            mainScreen.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            mainScreen.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(mainScreen);
                    }
            );
        });
        build.setNegativeButton("",(dialog1, which) -> {
            Intent next=new Intent(NewUserDisclaimerActivity.this,MainScreenActivity.class);
            startActivity(next);
            finish();
        });
        return build.create();
    }
}
