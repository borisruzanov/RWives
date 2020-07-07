package com.borisruzanov.russianwives.mvp.ui.slider;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.borisruzanov.russianwives.R;
import com.borisruzanov.russianwives.eventbus.StringEvent;
import com.borisruzanov.russianwives.models.Contract;
import com.borisruzanov.russianwives.mvp.ui.disclamer.VideoDisclaimerActivity;
import com.borisruzanov.russianwives.mvp.ui.main.MainScreenActivity;
import com.borisruzanov.russianwives.mvp.ui.slider.adapter.UserInfoPagerAdapter;
import com.borisruzanov.russianwives.utils.Consts;
import com.borisruzanov.russianwives.utils.LanguageConfig;
import com.google.firebase.analytics.FirebaseAnalytics;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

public class SliderActivity extends MvpAppCompatActivity {
    //TODO Implement MVP
    //TODO make final logic with appearing buttons

    ViewPager viewPager;
    UserInfoPagerAdapter adapter;
    Toolbar toolbar;
    Button buttonNext;
    FirebaseAnalytics firebaseAnalytics;
    Button mBackButton;
    final List<Fragment> fragmentList = new ArrayList<>();

    ProgressBar mProgressBar;
    TextView mProgressLeftText,mSliderTitle;

    private int progressValue=0; //a value which set in progressbar
    private int pvPosition=0;// hold previous fragment position
    private static int baseProgress=7; //hold baseProgress
    private boolean isVideoAvailable=true; //indicate that video is uploaded or not
    private int completed=0;//indicate how much info completed

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        toolbar = findViewById(R.id.toolbar_slider);
        setSupportActionBar(toolbar);

        firebaseAnalytics = FirebaseAnalytics.getInstance(this);

        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }

        viewPager = findViewById(R.id.view_pager_add_info);
        buttonNext = findViewById(R.id.slider_next_button);
        mBackButton=findViewById(R.id.slider_back_button);
        mProgressBar=findViewById(R.id.slider_progressbar);
        mProgressLeftText=findViewById(R.id.slider_progressleft_text);
        mProgressBar.setMax(100);
        mSliderTitle=findViewById(R.id.slider_title);
        mSliderTitle.setText(LanguageConfig.isRussian()?R.string.slider_toolbar_title_rus:R.string.slider_toolbar_title_eng);
        Log.d("SliderDebug", "In onCreate");

        if (getIntent().getStringArrayListExtra(Consts.DEFAULT_LIST) != null) {
            addFragments();
        }
        else if (getIntent().getExtras().getString("field_id") != null) {
            switch (getIntent().getExtras().getString("field_id")) {
                case "Image":
                    fragmentList.add(SliderImageFragment.newInstance());
                    break;
                case "Name":
                    fragmentList.add(SliderNameFragment.newInstance());
                    break;
                case "Age":
                    fragmentList.add(SliderAgeFragment.newInstance());
                    break;
                case "Country":
                    fragmentList.add(SliderCountriesFragment.newInstance());
                    break;
                case "Gender":
                    fragmentList.add(SliderGenderFragment.newInstance());
                    break;
                case "Relationship Status":
                    fragmentList.add(SliderRelationshipsStatusFragment.newInstance());
                    break;
                case "Body Type":
                    fragmentList.add(SliderBodytypeFragment.newInstance());
                    break;
                case "Ethnicity":
                    fragmentList.add(SliderEthnicityFragment.newInstance());
                    break;
                case "Faith":
                    fragmentList.add(SliderFaithFragment.newInstance());
                    break;
                case "Smoke Status":
                    fragmentList.add(SliderSmokingStatusFragment.newInstance());
                    break;
                case "How Often Do You Drink Alcohol":
                    fragmentList.add(SliderDrinkStatusFragment.newInstance());
                    break;
                case "Number Of Kids":
                    fragmentList.add(SliderHaveKidsFragment.newInstance());
                    break;
                case "Do You Want Kids":
                    fragmentList.add(SliderWillingKidsFragment.newInstance());
                    break;
                case "Looking for":
                    fragmentList.add(SliderHobbyFragment.newInstance());
                    break;
            }

            //hide progressbar,steps left if only edit fragment called
            mProgressBar.setVisibility(View.GONE);
            mProgressLeftText.setVisibility(View.GONE);
            findViewById(R.id.slider_step_left_text).setVisibility(View.GONE);
        }

        adapter = new UserInfoPagerAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(adapter);

        buttonNext.setOnClickListener(view -> {
            Log.d(Contract.SLIDER, "Inside extras " + getIntent().getExtras().getString("field_id"));
            slideToNext(fragmentList, viewPager.getCurrentItem());
        });
        Log.d("SliderDebug","size of fragment list:-"+fragmentList.size()+"value of isVideoAvailable "+String.valueOf(isVideoAvailable));
        //if there is no fragment call VideoDisclaimerActivity
        if(fragmentList.size()==0) {
            //calling videoDisclaimerActivity if video not uploaded
            if (!isVideoAvailable) {
                startActivity(new Intent(SliderActivity.this, VideoDisclaimerActivity.class));
                finish();
            }
            else{
                //if all done then finish
                finish();
            }
        }
        viewPager.addOnPageChangeListener(onPageChangeListener);

        if (getIntent().getExtras().getString("intent") != null && getIntent().getExtras().getString("intent").equals("list")) {
        //    buttonNext.setVisibility(View.GONE);
        } else {
            //Show finish button
            if (fragmentList.size() == 1) {
                mBackButton.setVisibility(View.GONE);
                buttonNext.setVisibility(View.VISIBLE);
                buttonNext.setText(R.string.finish);
                buttonNext.setClickable(false);
            }
            Log.d("tag", "Inside extras " + getIntent().getExtras().getString("field_id"));
        }
        Log.d(Contract.SLIDER, "Inside extras " + getIntent().getExtras().getString("field_id"));

        mBackButton.setOnClickListener(v -> {
            slideToBack(fragmentList,viewPager.getCurrentItem());
        });
        progressValue=baseProgress*completed;
        mProgressBar.setProgress(progressValue);
    }

    @Subscribe
    public void changeValues(StringEvent event) {
        //check value for which event is triggered
        if (event.getStringParameter().equals(Consts.BUTTON_NEXT)){
            //if for next button
                buttonNext.setClickable(true);
                buttonNext.setBackgroundResource(R.color.colorAccent);
        }
        else if (event.getStringParameter().equals(Consts.PROGRESSBAR)){
            //if  a progressbar
            //to set a progressbar
            if (viewPager.getCurrentItem()==fragmentList.size()-1) progressValue=100;
            else{
                progressValue=baseProgress*completed;
            }
            mProgressBar.setProgress(progressValue); //set a Progressbar progress Value
            Log.d("SliderDebug","progress:-"+progressValue);
        }
        else if (event.getStringParameter().equals(Consts.LEFT_STEP)){
            //if step left
            //to set step left TextView
            mProgressLeftText.setText(String.valueOf(15-completed)); //Subtract from total fragment to complete fragment
        }
        else if (event.getStringParameter().equals(Consts.COMPLETE)){
            //to increase value of completed info
            completed++;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    private ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override
        public void onPageSelected(int position) {
            setButton();
            Log.d("SliderDebug","current:-"+position+"ProgressValue:-"+progressValue);
        }

        @Override
        public void onPageScrollStateChanged(int state) {
        }
    };

    private void addFragments() {
        ArrayList<String> list=getIntent().getStringArrayListExtra(Consts.DEFAULT_LIST);
        Log.d("sliderDebug","list size:-"+list.size());
        for (int i=0;i<15;i++){
            switch (i){
                case 0:
                    if (list.contains(Consts.NAME))
                        fragmentList.add(new SliderNameFragment());
                    else
                        completed++;
                    break;
                case 1:
                    if (list.contains(Consts.GENDER))
                        fragmentList.add(new SliderGenderFragment());
                    else
                        completed++;
                    break;
                case 2:
                    if (list.contains(Consts.IMAGE))
                        fragmentList.add(new SliderImageFragment());
                    else
                        completed++;
                    break;
                case 3:
                    if (list.contains(Consts.AGE))
                        fragmentList.add(new SliderAgeFragment());
                    else
                        completed++;
                    break;
                case 4:
                    if (list.contains(Consts.COUNTRY))
                        fragmentList.add(new SliderCountriesFragment());
                    else
                        completed++;
                    break;
                case 5:
                    if (list.contains(Consts.LANGUAGES))
                        fragmentList.add(new SliderLanguagesFragment());
                    else
                        completed++;
                    break;
                case 6:
                    if (list.contains(Consts.BODY_TYPE))
                        fragmentList.add(new SliderBodytypeFragment());
                    else
                        completed++;
                    break;
                case 7:
                    if (list.contains(Consts.ETHNICITY))
                        fragmentList.add(new SliderEthnicityFragment());
                    else
                        completed++;
                    break;
                case 8:
                    if (list.contains(Consts.FAITH))
                        fragmentList.add(new SliderFaithFragment());
                    else
                        completed++;
                    break;
                case 9:
                    if (list.contains(Consts.DRINK_STATUS))
                        fragmentList.add(new SliderDrinkStatusFragment());
                    else
                        completed++;
                    break;
                case 10:
                    if (list.contains(Consts.SMOKING_STATUS))
                        fragmentList.add(new SliderSmokingStatusFragment());
                    else
                        completed++;
                    break;
                case 11:
                    if (list.contains(Consts.RELATIONSHIP_STATUS))
                        fragmentList.add(new SliderRelationshipsStatusFragment());
                    else
                        completed++;
                    break;
                case 12:
                    if (list.contains(Consts.NUMBER_OF_KIDS))
                        fragmentList.add(new SliderHaveKidsFragment());
                    else
                        completed++;
                    break;
                case 13:
                    if (list.contains(Consts.WANT_CHILDREN_OR_NOT))
                        fragmentList.add(new SliderWillingKidsFragment());
                    else
                        completed++;
                    break;
                case 14:
                    if (list.contains(Consts.HOBBY))
                        fragmentList.add(new SliderHobbyFragment());
                    else
                        completed++;
                    break;
            }
        }

        if (list.contains(Consts.VIDEO)){
            isVideoAvailable=false;
        }
    }

    public void slideToNext(List<Fragment> fragmentList, int position) {
        if (!fragmentList.isEmpty() && position != fragmentList.size()) {
            viewPager.setCurrentItem(position + 1);
        }
        if (position + 1 == fragmentList.size()) {
            //close the survey
            //onBackPressed();

            //calling VideoDisclaimerActivity
            if (!isVideoAvailable){
                Intent intent = new Intent(SliderActivity.this, VideoDisclaimerActivity.class);
                startActivity(intent);
            }
            finish();
//            addFullProfileAchieve();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(SliderActivity.this, MainScreenActivity.class);
        startActivity(intent);
    }


    /***
     * to set Previous and Next Button
     */

    /***
     * set Next and previous value according a current ViewPager
     */
    private void setButton() {
        if (viewPager.getCurrentItem()==0){
            mBackButton.setVisibility(View.GONE);
        }
        else
        {
            mBackButton.setVisibility(View.VISIBLE);
        }
        if (viewPager.getCurrentItem()==fragmentList.size()-1){
            buttonNext.setText(R.string.finish);
            buttonNext.setBackgroundResource(R.color.darkColor);
            buttonNext.setClickable(false);
        }
        else{
            buttonNext.setText(R.string.next_text);
            buttonNext.setBackgroundResource(R.color.darkColor);
            buttonNext.setClickable(false);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        EventBus.getDefault().unregister(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!EventBus.getDefault().isRegistered(this))
            EventBus.getDefault().register(this);
        mProgressLeftText.setText(String.valueOf(15-completed));
        setButton();
        Log.d("sliderDebug","fragment size:-"+fragmentList.size()+" current:-"+viewPager.getCurrentItem()+
                "\nProgressValue:-"+progressValue
                +"\ncompleted:-"+completed);
    }

    /***
     * to go back previous fragment
     * @param fragmentList a fragment list
     * @param position a current fragment position
     */
    public void slideToBack(List<Fragment> fragmentList,int position){
        if (!fragmentList.isEmpty() && position!=0){
            viewPager.setCurrentItem(position-1);
        }
    }

}
