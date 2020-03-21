package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class covid19 extends AppCompatActivity {
    private VideoView anm;
    private Button webb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid19);


        anm = (VideoView) findViewById(R.id.animation);
        webb = (Button) findViewById(R.id.webbutton);

        Uri uri1 = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.animation);
        anm.setVideoURI(uri1);
        MediaController mediaController1 = new MediaController(this);
        anm.setMediaController(mediaController1);
        anm.start();



        webb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent5 = new Intent(covid19.this, webabc.class);
                startActivity(intent5);
            }
        });
    }
}
