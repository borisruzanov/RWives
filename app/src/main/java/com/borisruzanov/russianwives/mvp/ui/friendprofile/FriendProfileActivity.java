package com.borisruzanov.russianwives.mvp.ui.friendprofile;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.borisruzanov.russianwives.App;
import com.borisruzanov.russianwives.OnItemClickListener;
import com.borisruzanov.russianwives.R;
import com.borisruzanov.russianwives.models.Contract;
import com.borisruzanov.russianwives.models.UserDescriptionModel;
import com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs;
import com.borisruzanov.russianwives.mvp.model.repository.rating.RatingManager;
import com.borisruzanov.russianwives.mvp.ui.chatmessage.ChatMessageActivity;
import com.borisruzanov.russianwives.mvp.ui.confirm.ConfirmDialogFragment;
import com.borisruzanov.russianwives.mvp.ui.global.adapter.UserDescriptionListAdapter;
import com.borisruzanov.russianwives.mvp.ui.main.MainScreenActivity;
import com.borisruzanov.russianwives.mvp.ui.mustinfo.MustInfoDialogFragment;
import com.borisruzanov.russianwives.mvp.ui.slider.SliderActivity;
import com.borisruzanov.russianwives.utils.Consts;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import static com.borisruzanov.russianwives.models.Contract.RC_SIGN_IN;

public class FriendProfileActivity extends MvpAppCompatActivity implements FriendProfileView,
        ConfirmDialogFragment.ConfirmListener{

    //TODO change view initializations to ButterKnife binds
    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayout;
    FloatingActionButton fab;

    TextView nameText, ageText, countryText;
    ImageView imageView, messageIv, likeIv;

    Button btnAddFriend, btnStartChat;

    RecyclerView recyclerView;
    UserDescriptionListAdapter userDescriptionListAdapter;

    private String friendUid;
    private boolean mIsUserExist;
    private Prefs mPrefs;


    private CardView mPhrasesContainer;
    private CardView mFirstPhraseContainer;
    private CardView mSecondPhraseContainer;
    private CardView mThirdPhraseContainer;
    private CardView mCustomPhraseContainer;
    private ImageView mPhrasesCloseBtn;
    private TextView mFirstPhrase;
    private TextView mSecondPhrase;
    private TextView mThirdPhrase;

    private String mFriendName;
    private String mFriendImage;
    //Need that to check if user got chats with that friend already


    // Object for video features
    private VideoView mVideoView;
    private AppCompatImageButton mPhotoicon,mVidoeicon;
    private AppCompatImageView mPlayimage;
    private FrameLayout mVideoFrame;
    private LinearLayout mSelectionLinear;
    private String mFriendVideoUrl;
    private ProgressBar mProgressbar;

    private Handler handler;
    @Inject
    @InjectPresenter
    FriendProfilePresenter mPresenter;

    @ProvidePresenter
    public FriendProfilePresenter provideFriendProfilePresenter() {
        return mPresenter;
    }

    private FirebaseAnalytics mFirebaseAnalytics;

    private AdView mAdView;

    private boolean mIsRussianLang =false; //for language is Russian or other
    private AlertDialog mBlockPopUpDialog; //a PopUpDialog for block user

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        App application = (App) getApplication();
        application.getComponent().inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        mPrefs = new Prefs(this);
        MobileAds.initialize(this, getString(R.string.mob_app_id));
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mIsUserExist = mPresenter.isUserExist();
        mIsRussianLang = Locale.getDefault().getLanguage().equals("ru"); //new line added
        RatingManager.getInstance().setUserMsgPts();
        setupPhrasesBlock();
        increaseUserActivity();
        //Transition
        //supportPostponeEnterTransition();
        imageView = findViewById(R.id.friend_activity_image);

       /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            String imageTransitionName = getIntent().getStringExtra("transitionName");
            imageView.setTransitionName(imageTransitionName);
        }*/

        collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar_layout);
        collapsingToolbarLayout.setCollapsedTitleTextColor(ContextCompat.getColor(getApplicationContext(), R.color.darkColor));
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_black_24dp);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        likeIv = findViewById(R.id.friend_activity_like_img);
        messageIv = findViewById(R.id.friend_activity_message_img);

        friendUid = getIntent().getStringExtra(Consts.UID);
        Log.d("CarouselDebug", "Uid in FPA is " + friendUid);
        mPresenter.setLikeHighlighted(friendUid);

        fab = findViewById(R.id.friend_activity_fab);

        // listeners for action buttons
        likeIv.setOnClickListener(v -> {
            mFirebaseAnalytics.logEvent("like_from_friend_activity", null);
            Log.d("ClickedImg", "Image Like was clicked");

            //check if user blocked then open dialog otherwise liked
            if (mPresenter.isFriendBlock()) mBlockPopUpDialog.show();
            else mPresenter.setFriendLiked(friendUid);
        });
        messageIv.setOnClickListener(v -> {
            mFirebaseAnalytics.logEvent("start_chat_from_friend_activity", null);
            Log.d("ClickedImg", "Image Message was clicked");
            mPresenter.openChatMessage(friendUid);
        });

        btnAddFriend = findViewById(R.id.friend_activity_btn_add_friend);
        btnAddFriend.setOnClickListener(v -> mPresenter.setFriendLiked(friendUid));
        btnStartChat = findViewById(R.id.friend_activity_btn_start_chat);

        recyclerView = findViewById(R.id.recycler_list_friendDescription);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        userDescriptionListAdapter = new UserDescriptionListAdapter(setOnItemClickCallback(), this);
        recyclerView.setAdapter(userDescriptionListAdapter);

        nameText = findViewById(R.id.friend_activity_tv_name);
        ageText = findViewById(R.id.friend_activity_tv_age);
        countryText = findViewById(R.id.friend_activity_tv_country);

        mVideoView=findViewById(R.id.friend_activity_videoview);
        mVideoFrame=findViewById(R.id.friend_activity_video_frameLayout);
        mPlayimage=findViewById(R.id.friend_activity_videoplay_button);
        mPhotoicon=findViewById(R.id.friend_activity_photobutton);
        mVidoeicon=findViewById(R.id.friend_activity_videobutton);
        mSelectionLinear=findViewById(R.id.friend_activity_selection_linear);
        mProgressbar=findViewById(R.id.friend_activity_video_pgbar);
        setListener();

        mPresenter.setAllInfo(friendUid);

        mFirebaseAnalytics.logEvent("friend_profile_viewed", null);

        mBlockPopUpDialog = createBlockPopUpDialog(); //initialize the alertDialog
    }


    /**
     * Phrases block logic
     */
    private void setupPhrasesBlock() {
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean showPhrases = true;

                //Checking if user already sent message to friend dont show him template messages
                if (!mPrefs.getValue(friendUid).equals(Consts.DEFAULT)){
                    showPhrases = false;
                }
                if (mIsUserExist && showPhrases) {
                    mFirebaseAnalytics.logEvent("template_message_preparation", null);
                    mPhrasesContainer = findViewById(R.id.friend_activity_phrase_main_container);
                    mFirstPhraseContainer = findViewById(R.id.friend_activity_phrase_one_container);
                    mSecondPhraseContainer = findViewById(R.id.friend_activity_phrase_two_container);
                    mThirdPhraseContainer = findViewById(R.id.friend_activity_phrase_three_container);
                    mCustomPhraseContainer = findViewById(R.id.friend_activity_phrase_custom_container);
                    mPhrasesCloseBtn = findViewById(R.id.friend_activity_phrases_close);
                    mFirstPhrase = findViewById(R.id.friend_activity_phrase_one);
                    mSecondPhrase = findViewById(R.id.friend_activity_phrase_two);
                    mThirdPhrase = findViewById(R.id.friend_activity_phrase_three);
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            mFirebaseAnalytics.logEvent("template_message_showed", null);
                            mPhrasesContainer.setVisibility(View.VISIBLE);
                            mFirstPhraseContainer.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    mFirebaseAnalytics.logEvent("template_message_phrase_one_clicked", null);
                                    saveUserInPrefs();
                                    Intent chatIntent = new Intent(FriendProfileActivity.this, ChatMessageActivity.class);
                                    chatIntent.putExtra(Consts.CHAT_EXTRA_TYPE, Consts.FRIEND_ACTIVITY_PHRASE);
                                    chatIntent.putExtra(Consts.CHAT_EXTRA_MSG, mFirstPhrase.getText());
                                    chatIntent.putExtra(Consts.UID, friendUid);
                                    chatIntent.putExtra(Consts.NAME, mFriendName);
                                    chatIntent.putExtra(Consts.PHOTO_URL, mFriendImage);
                                    startActivity(chatIntent);
                                }
                            });
                            mSecondPhraseContainer.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    mFirebaseAnalytics.logEvent("template_message_phrase_two_clicked", null);
                                    saveUserInPrefs();
                                    Intent chatIntent = new Intent(FriendProfileActivity.this, ChatMessageActivity.class);
                                    chatIntent.putExtra(Consts.CHAT_EXTRA_TYPE, Consts.FRIEND_ACTIVITY_PHRASE);
                                    chatIntent.putExtra(Consts.CHAT_EXTRA_MSG, mSecondPhrase.getText());
                                    chatIntent.putExtra(Consts.UID, friendUid);
                                    chatIntent.putExtra(Consts.NAME, mFriendName);
                                    chatIntent.putExtra(Consts.PHOTO_URL, mFriendImage);
                                    startActivity(chatIntent);
                                }
                            });
                            mThirdPhraseContainer.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    mFirebaseAnalytics.logEvent("template_message_phrase_three_clicked", null);
                                    saveUserInPrefs();
                                    Intent chatIntent = new Intent(FriendProfileActivity.this, ChatMessageActivity.class);
                                    chatIntent.putExtra(Consts.CHAT_EXTRA_TYPE, Consts.FRIEND_ACTIVITY_PHRASE);
                                    chatIntent.putExtra(Consts.CHAT_EXTRA_MSG, mThirdPhrase.getText());
                                    chatIntent.putExtra(Consts.UID, friendUid);
                                    chatIntent.putExtra(Consts.NAME, mFriendName);
                                    chatIntent.putExtra(Consts.PHOTO_URL, mFriendImage);
                                    startActivity(chatIntent);
                                }
                            });
                            mCustomPhraseContainer.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    mFirebaseAnalytics.logEvent("template_message_phrase_custom_clicked", null);
                                    saveUserInPrefs();
                                    Intent chatIntent = new Intent(FriendProfileActivity.this, ChatMessageActivity.class);
                                    chatIntent.putExtra(Consts.CHAT_EXTRA_TYPE, Consts.FRIEND_ACTIVITY_CUSTOM);
                                    chatIntent.putExtra(Consts.UID, friendUid);
                                    chatIntent.putExtra(Consts.NAME, mFriendName);
                                    chatIntent.putExtra(Consts.PHOTO_URL, mFriendImage);
                                    startActivity(chatIntent);
                                }
                            });

                            mPhrasesCloseBtn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    mPhrasesContainer.setVisibility(View.GONE);
                                }
                            });
                        }
                    }, Integer.parseInt(mPrefs.getValue(Consts.PHRASES_DELAY)));
                }
            }
        }, 1000);
    }

    /**
     * Increasing level of the activity of the user
     */
    private void increaseUserActivity() {
        if (!mPrefs.getValue(Consts.USER_ACTIVITY).isEmpty()) {
            if (!mPrefs.getValue(Consts.USER_ACTIVITY).equals(Consts.DEFAULT)) {
                int prefsValue = Integer.valueOf(mPrefs.getValue(Consts.USER_ACTIVITY));
                prefsValue++;
                mPrefs.setValue(Consts.USER_ACTIVITY, String.valueOf(prefsValue));
            } else {
                //Set user activity to zero if he dont have one
                mPrefs.setValue(Consts.USER_ACTIVITY, "0");
            }
        }
    }

    /**
     * Saving friend uid in prefs not to show him dialog if he already talked to user
     */
    private void saveUserInPrefs() {
        mPrefs.setValue(friendUid, Consts.CONFIRMED);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBack();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setFriendData(String name, String age, String country, String image,String friendVideoUrl) {
        mFriendImage = image;
        mFriendName = name;
        collapsingToolbarLayout.setTitle(name);
        nameText.setText(name);
        ageText.setText(age);
        countryText.setText(country);
        if(mPresenter.isFriendBlock()){
         ageText.setVisibility(View.INVISIBLE);
         countryText.setVisibility(View.INVISIBLE);
         loadImage(Consts.BLOCKED_FRIEND);
         mVideoFrame.setVisibility(View.GONE);
         mSelectionLinear.setVisibility(View.GONE);
        }else{
            loadImage(image);
            //check if video url available or not
            if (friendVideoUrl!=null && friendVideoUrl.length()>0 && !friendVideoUrl.equals(Consts.DEFAULT) && !friendVideoUrl.equals(Consts.WAIT_APPROVAL)){
                //if available show VideoView and hide PhotoView
                mFriendVideoUrl=friendVideoUrl;
                mVideoFrame.setVisibility(View.VISIBLE);
                mVideoView.setVisibility(View.VISIBLE);
                mVideoView.setVideoURI(Uri.parse(mFriendVideoUrl));
                mProgressbar.setVisibility(View.VISIBLE);
                mVideoView.setOnPreparedListener(mp -> {
                    mp.setLooping(true);
                    mProgressbar.setVisibility(View.GONE);
                    mPlayimage.setVisibility(View.VISIBLE);
                });
                imageView.setVisibility(View.INVISIBLE);
                mSelectionLinear.setVisibility(View.VISIBLE);
            }else{
                //not available then hideVideoView and SelectionView and show only Photo
                mVideoFrame.setVisibility(View.GONE);
                mSelectionLinear.setVisibility(View.GONE);
                imageView.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public void setList(List<UserDescriptionModel> userDescriptionList) {
        if (userDescriptionList.isEmpty()) {
            Log.d(Contract.TAG, "The list is empty");
        } else {
            Log.d(Contract.TAG, "The list is NOT empty");
        }
        //Setting data to the adapter
        userDescriptionListAdapter.setData(userDescriptionList);
    }

    @Override
    public void setLikeHighlighted() {
        likeIv.setImageResource(R.drawable.ic_favorite_48);
    }

    @Override
    public void openRegDialog() {
        getSupportFragmentManager().beginTransaction()
                .add(ConfirmDialogFragment.newInstance(Consts.REG_MODULE), ConfirmDialogFragment.TAG)
                .commit();
    }

    public void callAuthWindow() {
        Log.d("RegDebug", "In callAuthWindow()");
        startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailableProviders(Arrays.asList(
                                new AuthUI.IdpConfig.EmailBuilder().build(),
                                new AuthUI.IdpConfig.FacebookBuilder().build(),
                                new AuthUI.IdpConfig.GoogleBuilder().build()))
                        .build(),
                RC_SIGN_IN);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_SIGN_IN) {
            if (data != null) {
                //TODO HERE SUPPOSE TO BE FOR A NEW USER ONLY NOT EXISTING ONE
                if (resultCode == Activity.RESULT_OK) {
                    IdpResponse response = IdpResponse.fromResultIntent(data);
                    if (response.isNewUser()) {
                        mFirebaseAnalytics.logEvent("registration_completed", null);
                        mPresenter.saveUser();
                        reload();
                    } else {
                        reload();
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("registration_error_type", "registration failed");
                    mFirebaseAnalytics.logEvent("registration_failed", bundle);
                }
            }
        }
    }

    private void reload() {
        Intent mainScreenIntent = new Intent(this, MainScreenActivity.class);
        startActivity(mainScreenIntent);
    }

    private void loadImage(String image) {
        RequestBuilder<Bitmap> requestBuilder = Glide.with(this).asBitmap();

        if (image.equals(Consts.BLOCKED_FRIEND)) {
            Log.d("UserHideStatus","FriendProfileActivity block image set");
            requestBuilder=requestBuilder.load(mIsRussianLang ?R.drawable.block_avatar_ru:R.drawable.block_avatar_eng);}
        else if (!image.equals(Consts.DEFAULT)) requestBuilder = requestBuilder.load(image);
        else requestBuilder = requestBuilder.load(R.drawable.default_avatar);

        requestBuilder.listener(new RequestListener<Bitmap>() {
            @Override
            public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Bitmap> target, boolean isFirstResource) {
                supportPostponeEnterTransition();
                return false;
            }

            @Override
            public boolean onResourceReady(Bitmap resource, Object model, Target<Bitmap> target, DataSource dataSource, boolean isFirstResource) {
                supportPostponeEnterTransition();
                return false;
            }
        }).into(imageView);
    }

    private OnItemClickListener.OnItemClickCallback setOnItemClickCallback() {
        return (view, position) -> {
        };
    }

    @Override
    public void showMustInfoDialog() {
        getSupportFragmentManager().beginTransaction()
                .add(ConfirmDialogFragment.newInstance(Consts.FP_MODULE), ConfirmDialogFragment.TAG)
                .commit();
    }

    @Override
    public void openSlider(ArrayList<String> sliderList) {
        Intent intent = new Intent(this, SliderActivity.class);
        intent.putStringArrayListExtra(Consts.DEFAULT_LIST, sliderList);
        startActivity(intent);
    }

    @Override
    public void onConfirm() {
        getSupportFragmentManager().beginTransaction().add(new MustInfoDialogFragment(), MustInfoDialogFragment.TAG).commit();
    }

    @Override
    public void onUpdateDialog() {

    }

    @Override
    public void reviewDialogYes() {

    }

    @Override
    public void reviewDialogNo() {

    }

    @Override
    public void sendToPlayMarket() {

    }

    @Override
    public void sendComplain() {

    }

    @Override
    public void openChatMessage(String name, String image) {
        if (mPresenter.isFriendBlock()){

            mBlockPopUpDialog.show();
        }
        else{
            Intent chatMessageIntent = new Intent(this, ChatMessageActivity.class);
            chatMessageIntent.putExtra(Consts.UID, friendUid);
            chatMessageIntent.putExtra(Consts.NAME, name);
            chatMessageIntent.putExtra("photo_url", image);
            startActivity(chatMessageIntent);
        }
    }

    private void onBack() {
        super.onBackPressed();
    }

    @Override
    public void onBackPressed() {
        onBack();
        Intent mainActivityIntent = new Intent(FriendProfileActivity.this, MainScreenActivity.class);
        startActivity(mainActivityIntent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mBlockPopUpDialog.isShowing()) mBlockPopUpDialog.dismiss();
        if(mVideoView.isPlaying())mVideoView.stopPlayback();
    }

    /**
     * Create AlertDialog which show for BlockUser
     * @return AlertDialog
     */
    private AlertDialog createBlockPopUpDialog(){
        Log.d("cheking","dilog crete");
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage(mIsRussianLang ?getResources().getString(R.string.ru_user_block):getResources().getString(R.string.user_block));
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
         return builder.create();
    }

    /**
     * set Listener for mPhotoicon,mVideoicon,mPlayimage
     */
    private void setListener() {

        //set Listener on Video ImageButton
        mVidoeicon.setOnClickListener( v -> {
            //check for videoUrl available or not
            if (mFriendVideoUrl!=null && mFriendVideoUrl.length()>0 && !mFriendVideoUrl.equals(Consts.DEFAULT) && !mFriendVideoUrl.equals(Consts.WAIT_APPROVAL)){
                //show VideoView show and hide PhotoView
                mVideoFrame.setVisibility(View.VISIBLE);
                mVideoView.setVisibility(View.VISIBLE);
                mVideoView.setVideoURI(Uri.parse(mFriendVideoUrl));
                mProgressbar.setVisibility(View.VISIBLE);
                mVideoView.setOnPreparedListener(mp -> {
                    mp.setLooping(true);
                    mProgressbar.setVisibility(View.GONE);
                    mPlayimage.setVisibility(View.VISIBLE);
                });
                imageView.setVisibility(View.INVISIBLE);
            }
            else{
                // video not available then hide VideoView and toast a message
                mVideoFrame.setVisibility(View.GONE);
                imageView.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.video_not_available),Toast.LENGTH_SHORT).show();
            }
        });

        //set listener on photo ImageButton
        mPhotoicon.setOnClickListener(v -> {
            if (mVideoView.isPlaying()) mVideoView.stopPlayback(); //if video play then stop
            //hide videoView and show ImageView
            mVideoFrame.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);
            mPlayimage.setVisibility(View.GONE);
        });

        //set listener on play button
        mPlayimage.setOnClickListener(v -> {
            if (mVideoView.isPlaying()){
                mVideoView.pause();
                return;
            }
            mVideoView.start();
            mPlayimage.setVisibility(View.INVISIBLE);
        });
    }


    @Override
    protected void onStop() {
        super.onStop();
        //stop a thread which run by handler
        handler.removeCallbacksAndMessages(null);
    }
}
