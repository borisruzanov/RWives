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
import com.borisruzanov.russianwives.mvp.model.repository.rating.RatingRepository;
import com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository;
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

import static com.borisruzanov.russianwives.mvp.model.repository.rating.Achievements.FULL_PROFILE_ACH;

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

    private int progressValue=0;
    private int pvPosition=0;
    private int baseProgress=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        toolbar = findViewById(R.id.toolbar_slider);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_black_24dp);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

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
        } else if (getIntent().getExtras().getString("field_id") != null) {
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
        }

        adapter = new UserInfoPagerAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(adapter);

        buttonNext.setOnClickListener(view -> {
            Log.d(Contract.SLIDER, "Inside extras " + getIntent().getExtras().getString("field_id"));
            slideToNext(fragmentList, viewPager.getCurrentItem());
        });

        //if there is no fragment call VideoDisclaimerActivity
        if(fragmentList.size()==0) {
            startActivity(new Intent(SliderActivity.this,VideoDisclaimerActivity.class));
            finish();
        }
        viewPager.addOnPageChangeListener(onPageChangeListener);

        if (getIntent().getExtras().getString("intent") != null && getIntent().getExtras().getString("intent").equals("list")) {
        //    buttonNext.setVisibility(View.GONE);
        } else {
            //Show finish button
            if (fragmentList.size() == 1) {
                mBackButton.setVisibility(View.GONE);
                buttonNext.setVisibility(View.GONE);
                buttonNext.setText(R.string.finish);
            }
            Log.d("tag", "Inside extras " + getIntent().getExtras().getString("field_id"));
        }
        Log.d(Contract.SLIDER, "Inside extras " + getIntent().getExtras().getString("field_id"));


        mBackButton.setOnClickListener(v -> {
            slideToBack(fragmentList,viewPager.getCurrentItem());
        });
        //set a base progress for every steps
        baseProgress=100/fragmentList.size();
    }

    @Subscribe
    public void changeValues(StringEvent event) {
        //change next button
        if (event.getField().equals("button_next")){
            if (event.getStringParameter().equals("enable")){
                buttonNext.setClickable(true);
                buttonNext.setBackgroundResource(R.color.colorAccent);
            }
        }
        else if (event.getField().equals("progressbar")){ //to set a progressbar
            if (progressValue==0)
            {
                if(viewPager.getCurrentItem()==fragmentList.size()-1) progressValue=100-progressValue;
                else if (viewPager.getCurrentItem()>=pvPosition){
                    progressValue=progressValue+baseProgress;
                    pvPosition=viewPager.getCurrentItem();
                }
            }
            mProgressBar.setProgress(progressValue);
            Log.d("SliderDebug","progress:-"+progressValue);
        }
        else if (event.getField().equals("steps_left")){ //to set step left TextView
            mProgressLeftText.setText(String.valueOf(fragmentList.size()-(pvPosition+1)));
        }
        /*if (fragmentList.size() > 1) {
            slideToNext(fragmentList, viewPager.getCurrentItem());
        }*/
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Log.d("tag", "Back clicked");
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override
        public void onPageSelected(int position) {
            /*if (fragmentList.size() == position + 1) {
                buttonNext.setVisibility(View.VISIBLE);
                buttonNext.setText(R.string.finish);
            } else {
                buttonNext.setVisibility(View.GONE);
                buttonNext.setText(R.string.next_text);
            }*/

            setButton();
            if(position==fragmentList.size()-1) progressValue=100-progressValue;
            else if (position>=pvPosition){
                progressValue=progressValue+baseProgress;
                pvPosition=position;
            }
            Log.d("SliderDebug","current:-"+position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {
        }
    };

    private void addFragments() {
        for (String key : getIntent().getStringArrayListExtra(Consts.DEFAULT_LIST)) {
            switch (key) {
                case Consts.BODY_TYPE:
                    fragmentList.add(new SliderBodytypeFragment());
                    break;
                case Consts.AGE:
                    fragmentList.add(new SliderAgeFragment());
                    break;
                case Consts.DRINK_STATUS:
                    fragmentList.add(new SliderDrinkStatusFragment());
                    break;
                case Consts.COUNTRY:
                    fragmentList.add(new SliderCountriesFragment());
                    break;
                case Consts.ETHNICITY:
                    fragmentList.add(new SliderEthnicityFragment());
                    break;
                case Consts.GENDER:
                    fragmentList.add(new SliderGenderFragment());
                    break;
                case Consts.HOBBY:
                    fragmentList.add(new SliderHobbyFragment());
                    break;
                case Consts.FAITH:
                    fragmentList.add(new SliderFaithFragment());
                    break;
                case Consts.HOW_TALL:
                    // maybe soon implemented
                    break;
                case Consts.IMAGE:
                    fragmentList.add(new SliderImageFragment());
                    break;
                case Consts.LANGUAGES:
                    fragmentList.add(new SliderLanguagesFragment());
                    break;
                case Consts.SMOKING_STATUS:
                    fragmentList.add(new SliderSmokingStatusFragment());
                    break;
                case Consts.RELATIONSHIP_STATUS:
                    fragmentList.add(new SliderRelationshipsStatusFragment());
                    break;
                case Consts.WANT_CHILDREN_OR_NOT:
                    fragmentList.add(new SliderWillingKidsFragment());
                    break;
                case Consts.NUMBER_OF_KIDS:
                    fragmentList.add(new SliderHaveKidsFragment());
                    break;
            }
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
            Intent intent = new Intent(SliderActivity.this, VideoDisclaimerActivity.class);
            startActivity(intent);
            addFPAchieveIfNeeded();
            finish();
//            addFullProfileAchieve();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(SliderActivity.this, MainScreenActivity.class);
        startActivity(intent);
        addFPAchieveIfNeeded();
    }

    private void addFPAchieveIfNeeded() {
        new RatingRepository().isAchievementExist(FULL_PROFILE_ACH, flag -> {
            if (!flag) {
                Log.d("SliderDebug", "Add achievement");
                addFullProfileAchieve();
            } else Log.d("SliderDebug", "Already exist");
        });
    }

    private void addFullProfileAchieve() {
        UserRepository userRepository = new UserRepository(new Prefs(getApplicationContext()));
        userRepository.getDefaultList(stringList -> {
            Log.d("TimerDebug", "String list emptiness is " + stringList.isEmpty());
            if (stringList.isEmpty()) {
                userRepository.clearDialogOpenDate();
                userRepository.setFullProfile();
                new RatingRepository().addAchievement(FULL_PROFILE_ACH);
                userRepository.addRating(8);
                firebaseAnalytics.logEvent("achieve_full_profile", null);
            }
        });
    }

    /***
     * to set Previous and Next Button
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
            buttonNext.setClickable(false);
        }
        else{
            buttonNext.setText(R.string.next_text);
            buttonNext.setBackgroundResource(R.color.darkColor);
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
        mProgressBar.setProgress(0);
        mProgressLeftText.setText(String.valueOf(fragmentList.size()));
        setButton();
        Log.d("sliderDebug","fragment size:-"+fragmentList.size()+" current:-");
    }

    /***
     * to go back previous fragment
     * @param fragmentList a fragment list
     * @param position a current position
     */
    public void slideToBack(List<Fragment> fragmentList,int position){
        if (!fragmentList.isEmpty() && position!=0){
            viewPager.setCurrentItem(position-1);
        }
    }


}
