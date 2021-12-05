package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.playBtn);


    }
    public void onButtonClick(View v){
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.sj);
        MediaController media = new MediaController(this);
        VideoView videoView = (VideoView) findViewById(R.id.video);
        videoView.setMediaController(media);
        media.setAnchorView(videoView);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void onButtonClickNxt(View v){
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.peak);
        MediaController media = new MediaController(this);
        VideoView videoView = (VideoView) findViewById(R.id.video);
        videoView.setMediaController(media);
        media.setAnchorView(videoView);
        videoView.setVideoURI(uri);
        videoView.start();
    }




}