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
import com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs;
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
    private static int baseProgress=8; //hold baseProgress
    private boolean isVideoAvailable=true; //indicate that video is uploaded or not
    private int completed=0;//indicate how much info completed

    private boolean[] arrCompleted=new boolean[12];//array to hold value for each fragment info completed or not

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
        mSliderTitle.setText(new Prefs(SliderActivity.this).getValue(LanguageConfig.isRussian()? Consts.SLIDER_TOOLBAR_TITLE_RUS:Consts.SLIDER_TOOLBAR_TITLE_ENG));
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
        Log.d("SliderDebug","progress:-"+progressValue);
        mProgressBar.setProgress(progressValue);

        //set a last added info fragment
        //start with a previous left fragment
        for (int i=0;i<12;i++){
            if (!arrCompleted[i]){ //check a sequence of fragment where it is completed or not
                //if not completed here set a fragment as a current item and left the loop
                viewPager.setCurrentItem(i);
                break;
            }
        }
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
            mProgressLeftText.setText(String.valueOf(12-completed)); //Subtract from total fragment to complete fragment
        }
        else if (event.getStringParameter().equals(Consts.COMPLETE)){
            //to increase value of completed info
            completed++;
            //new Prefs(SliderActivity.this).setValue(Consts.LAST_SLIDER_NO, String.valueOf(viewPager.getCurrentItem()));
            arrCompleted[viewPager.getCurrentItem()]=true; //set value true for each fragment info completed
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
        for (int i=0;i<12;i++){
            switch (i){
                /*case 0:
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
                    break;*/
                case 0:
                    fragmentList.add(new SliderImageFragment());
                    if (!list.contains(Consts.IMAGE)) {
                        completed++;
                        arrCompleted[0] = true;
                    }
                    break;
                case 1:
                    fragmentList.add(new SliderAgeFragment());
                    if (!list.contains(Consts.AGE)) {
                        completed++;
                        arrCompleted[1]=true;
                    }
                    break;
                case 2:
                    fragmentList.add(new SliderCountriesFragment());
                    if (!list.contains(Consts.COUNTRY)) {
                        completed++;
                        arrCompleted[2]=true;
                    }
                    break;
                case 3:
                    fragmentList.add(new SliderBodytypeFragment());
                    if (!list.contains(Consts.BODY_TYPE)) {
                        completed++;
                        arrCompleted[3]=true;
                    }
                    break;
                case 4:
                    fragmentList.add(new SliderEthnicityFragment());
                    if (!list.contains(Consts.ETHNICITY)) {
                        completed++;
                        arrCompleted[4]=true;
                    }
                    break;
                case 5:
                    fragmentList.add(new SliderFaithFragment());
                    if (!list.contains(Consts.FAITH)) {
                        completed++;
                        arrCompleted[5]=true;
                    }
                    break;
                case 6:
                    fragmentList.add(new SliderDrinkStatusFragment());
                    if (!list.contains(Consts.DRINK_STATUS)) {
                        completed++;
                        arrCompleted[6]=true;
                    }
                    break;
                case 7:
                    fragmentList.add(new SliderSmokingStatusFragment());
                    if (!list.contains(Consts.SMOKING_STATUS)) {
                        completed++;
                        arrCompleted[7]=true;
                    }
                    break;
                case 8:
                    fragmentList.add(new SliderRelationshipsStatusFragment());
                    if (!list.contains(Consts.RELATIONSHIP_STATUS)) {
                        completed++;
                        arrCompleted[8]=true;
                    }
                    break;
                case 9:
                    fragmentList.add(new SliderHaveKidsFragment());
                    if (!list.contains(Consts.NUMBER_OF_KIDS)) {
                        completed++;
                        arrCompleted[9]=true;
                    }
                    break;
                case 10:
                    fragmentList.add(new SliderWillingKidsFragment());
                    if (!list.contains(Consts.WANT_CHILDREN_OR_NOT)) {
                        completed++;
                        arrCompleted[10]=true;
                    }
                    break;
                case 11:
                    fragmentList.add(new SliderHobbyFragment());
                    if (!list.contains(Consts.HOBBY)) {
                        completed++;
                        arrCompleted[11]=true;
                    }
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
                finish();
            }
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
        }
        else{
            buttonNext.setText(R.string.next_text);
        }
        buttonNext.setBackgroundResource(R.color.darkColor);
        buttonNext.setClickable(false);

        if (arrCompleted[viewPager.getCurrentItem()]){
            //if fragment info completed then next button set to clickable
            buttonNext.setClickable(true);
            buttonNext.setBackgroundResource(R.color.colorAccent);
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
        /*String slider_no=new Prefs(SliderActivity.this).getLastInfoSliderNo();
        if(slider_no!=null && !slider_no.equals("11"))
            viewPager.setCurrentItem(Integer.parseInt(slider_no)+1);*/
        mProgressLeftText.setText(String.valueOf(12-completed));
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
