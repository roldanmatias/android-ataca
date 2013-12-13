package com.example.acamica;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class VideoActivity extends Activity {

	String videoPath = "http://www.pocketjourney.com/downloads/pj/video/famous.3gp";
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_layout);
        
        VideoView video = (VideoView)findViewById(R.id.videoView1);
        video.setVideoURI(Uri.parse(videoPath));
        video.start();
    }
}
