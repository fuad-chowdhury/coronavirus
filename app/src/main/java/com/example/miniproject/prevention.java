package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class prevention extends AppCompatActivity {

    private VideoView videoView;
    private Button imagebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);

        imagebutton = (Button) findViewById(R.id.videoimage);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(prevention.this,previmage.class);
                startActivity(intent5);
            }
        });

        videoView = findViewById(R.id.protection);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.coronaprotection);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}
