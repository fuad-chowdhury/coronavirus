package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

   private Button buttonCovid,buttonStatistics,buttonGraph,buttonPrevention;
   //private ImageView chi,css,death;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //chi = findViewById(R.id.china);
       // css = findViewById(R.id.cases);
      //  death = findViewById(R.id.death);

        buttonGraph = (Button) findViewById(R.id.button3);
        buttonPrevention = (Button) findViewById(R.id.button4);
        buttonCovid = (Button) findViewById(R.id.button2);
        buttonStatistics = findViewById(R.id.button1);
        buttonCovid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,covid19.class);
                startActivity(intent1);
            }
        });

        buttonStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,statistics.class);
                startActivity(intent2);
            }
        });

        buttonGraph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this,graph.class);
                startActivity(intent3);
            }
        });

        buttonPrevention.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this,prevention.class);
                startActivity(intent4);
            }
        });
    }
}
