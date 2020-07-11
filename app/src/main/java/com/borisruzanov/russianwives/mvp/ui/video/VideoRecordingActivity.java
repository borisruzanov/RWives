package com.borisruzanov.russianwives.mvp.ui.video;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

import com.borisruzanov.russianwives.R;
import com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs;
import com.borisruzanov.russianwives.mvp.model.repository.rating.RatingRepository;
import com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository;
import com.borisruzanov.russianwives.mvp.ui.main.MainScreenActivity;
import com.borisruzanov.russianwives.utils.Consts;
import com.borisruzanov.russianwives.utils.FirebaseUtils;
import com.borisruzanov.russianwives.utils.LanguageConfig;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.UploadTask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.borisruzanov.russianwives.mvp.model.repository.rating.Achievements.FULL_PROFILE_ACH;

public class VideoRecordingActivity extends AppCompatActivity  {

    private static final int REQUEST_VIDEO_CAPTURE = 1;

    @BindView(R.id.recordVideoButton_videoActivity)
    Button mRecordVideo;
    @BindView(R.id.uploadVideoButton_videoActivity)
    Button mUploadVideo;
    @BindView(R.id.videoView_videoActivity)
    VideoView mVideoView;
    @BindView(R.id.toolbar_videoActivity)
    Toolbar mToolbar;
    Uri mVideoUri;
    private FirebaseAnalytics firebaseAnalytics;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_recording);
        ButterKnife.bind(this);
        checkPermission();
        setSupportActionBar(mToolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_black_24dp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        firebaseAnalytics=FirebaseAnalytics.getInstance(this);

        //set Listener on record button
        mRecordVideo.setOnClickListener(v -> {
            dispatchTakeVideoIntent();
        });
        //set Listener in upload button
        mUploadVideo.setOnClickListener(v -> {
            if(mVideoUri==null){
                Toast.makeText(VideoRecordingActivity.this, getResources().getString(R.string.record_video_first_text), Toast.LENGTH_SHORT).show();
                return;
            }
            uploadVideo();
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onResume() {
        super.onResume();
        mToolbar.setTitle(new Prefs(this).getValue(LanguageConfig.isRussian()?Consts.VIDEO_RESULT_TOOLBAR_TITLE_RUS:Consts.VIDEO_RESULT_TOOLBAR_TITLE_ENG));
    }

    /***
     * calling a camera intent to record video
     */
    private void dispatchTakeVideoIntent() {
        Intent takeVideoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE); // Prepare intent to open the camera in video mode.
        takeVideoIntent.putExtra(MediaStore.EXTRA_DURATION_LIMIT, 30); // Controls the camera record maximum time. The number reference to seconds.
        takeVideoIntent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 0); // Controls the video quality 0 = low quality 1 = high quality.
        startActivityForResult(takeVideoIntent, REQUEST_VIDEO_CAPTURE); // Launch the intent.
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == REQUEST_VIDEO_CAPTURE && resultCode == RESULT_OK) {
            /*
            If there is no problem in the video capture we get the videoView to show the recorded video
            in looping mode.
             */
            mVideoUri = intent.getData();
            mVideoView.setVideoURI(mVideoUri);

            mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.setLooping(true);
                }
            });
            mVideoView.start();
            mRecordVideo.setBackgroundResource(R.color.darkGrey);
            mUploadVideo.setBackgroundResource(R.color.colorAccent);
        } else if (requestCode == REQUEST_VIDEO_CAPTURE && resultCode == RESULT_CANCELED) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.video_record_error_text), Toast.LENGTH_LONG).show();
        }
    }

    /**
     * This function uploads the video to Firebase Storage and creates a reference in the database.
     */
    private void uploadVideo() {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setIcon(R.mipmap.ic_launcher_round);
        progressDialog.setCancelable(false);
        progressDialog.setTitle(getResources().getString(R.string.uploading_text));
        progressDialog.show();
        if (mVideoUri != null) {
            final String videoID = new SimpleDateFormat(Consts.VIDEO_DATE_FORMAT, Locale.getDefault()).format(new Date());

            UploadTask uploadTask = FirebaseStorage.getInstance().getReference().child("/videos/" + videoID).putFile(mVideoUri);
            uploadTask.addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    taskSnapshot.getStorage().getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                        @Override
                        public void onSuccess(Uri uri) {
                            HashMap<String, String> videoInfo = new HashMap<>();
                            videoInfo.put("videoID", videoID);
                            videoInfo.put("videoURL", String.valueOf(uri));
                            videoInfo.put("userID", FirebaseUtils.getUid()); //adding user id
                            FirebaseDatabase.getInstance().getReference().child("videos").child(videoID).setValue(videoInfo).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    progressDialog.dismiss();
                                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.video_upload_sucess_text), Toast.LENGTH_LONG).show();
                                    mVideoUri = null;
                                    mVideoView.setVideoURI(null);
                                    setVideoStatus();
                                    AfterVideoUpload();
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    progressDialog.dismiss();
                                    FirebaseStorage.getInstance().getReference().child("/videos/" + videoID).delete();
                                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.video_upload_error_text), Toast.LENGTH_LONG).show();
                                }
                            });
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            progressDialog.dismiss();
                            FirebaseStorage.getInstance().getReference().child("/videos/" + videoID).delete();
                            Toast.makeText(getApplicationContext(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    progressDialog.dismiss();
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.video_upload_error_text), Toast.LENGTH_LONG).show();
                }
            });
        }
    }



    /***
     * check permission for camera
     */
    private void checkPermission() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, 0);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mVideoView.isPlaying())mVideoView.pause();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 0 && grantResults[0] != PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(getApplicationContext(), "PERMISSION TO USE CAMERA DENIED,PLEASE GIVE PERMISSION TO RECORD VIDEO", Toast.LENGTH_LONG).show();
            VideoRecordingActivity.this.finish();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);


    }

    /***
     * this function call after video upload successfully
     * it add achievement and call next activity
     */
    private void AfterVideoUpload(){
        addFPAchieveIfNeeded();
        Intent main=new Intent(VideoRecordingActivity.this, MainScreenActivity.class);
        main.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(main);
    }

    /***
     *
     * check if full_profile achievement is received or not
     * if not received then add full_profile achievement
     */
    private void addFPAchieveIfNeeded() {
        new RatingRepository().isAchievementExist(FULL_PROFILE_ACH, flag -> {
            if (!flag) {
                Log.d("SliderDebug", "Add achievement");
                addFullProfileAchieve();
            } else Log.d("SliderDebug", "Already exist");
        });
    }

    /***
     * add full_profile achievement in firestore and also preferences
     */
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
                finish();
            }
        });
    }

    /***
     *call videoStatus method of userRepository
     */
    private void setVideoStatus() {
        new UserRepository(new Prefs(VideoRecordingActivity.this)).setVideoUploadStatus(FirebaseAuth.getInstance().getUid());
    }


}