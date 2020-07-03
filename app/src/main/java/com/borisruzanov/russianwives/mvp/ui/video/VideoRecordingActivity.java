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
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

import com.borisruzanov.russianwives.R;
import com.borisruzanov.russianwives.mvp.ui.main.MainScreenActivity;
import com.borisruzanov.russianwives.utils.FirebaseUtils;
import com.borisruzanov.russianwives.utils.LanguageConfig;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.UploadTask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

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
        mRecordVideo.setOnClickListener(v -> {
            dispatchTakeVideoIntent();
        });
        mUploadVideo.setOnClickListener(v -> {
            if(mVideoUri==null){
                Toast.makeText(VideoRecordingActivity.this, "Please Record video first", Toast.LENGTH_SHORT).show();
                return;
            }
            uploadVideo();
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onResume() {
        super.onResume();
        if (LanguageConfig.isRussian()){
            mToolbar.setTitle(R.string.video_result_toolbar_title_rus);
        }else{
            mToolbar.setTitle(R.string.video_result_toolbar_title_eng);
        }
    }

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
        } else if (requestCode == REQUEST_VIDEO_CAPTURE && resultCode == RESULT_CANCELED) {
            Toast.makeText(getApplicationContext(), "An error occurred, please try again later.", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * This function uploads the video to Firebase Storage and creates a reference in the database.
     */
    private void uploadVideo() {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setIcon(R.mipmap.ic_launcher_round);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Uploading ...");
        progressDialog.show();
        if (mVideoUri != null) {
            final String videoID = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date());

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
                            videoInfo.put("uid", FirebaseUtils.getUid()); //adding user id
                            FirebaseDatabase.getInstance().getReference().child("videos").child(videoID).setValue(videoInfo).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    progressDialog.dismiss();
                                    Toast.makeText(getApplicationContext(), "VIDEO UPLOADED SUCCESSFULLY", Toast.LENGTH_LONG).show();
                                    mVideoUri = null;
                                    mVideoView.setVideoURI(null);
                                    Intent main=new Intent(VideoRecordingActivity.this, MainScreenActivity.class);
                                    main.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                                    startActivity(main);
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    progressDialog.dismiss();
                                    FirebaseStorage.getInstance().getReference().child("/videos/" + videoID).delete();
                                    Toast.makeText(getApplicationContext(), "ERROR,PLEASE UPLOAD AGAIN", Toast.LENGTH_LONG).show();
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
                    Toast.makeText(getApplicationContext(), "ERROR,PLEASE UPLOAD AGAIN", Toast.LENGTH_LONG).show();
                }
            });
        }
    }

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
}