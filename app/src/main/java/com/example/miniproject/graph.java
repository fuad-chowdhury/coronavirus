package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class graph extends AppCompatActivity implements View.OnClickListener {
    private ImageView chi,css,death1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        chi = findViewById(R.id.china);
        css = findViewById(R.id.cases);
        death1 = findViewById(R.id.death);

        chi.setOnClickListener(this);
        css.setOnClickListener(this);
        death1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()== R.id.china)
        {
            chi.setVisibility(v.GONE);
            css.setVisibility(v.VISIBLE);
        }

        if(v.getId()== R.id.cases)
        {
            css.setVisibility(v.GONE);
            death1.setVisibility(v.VISIBLE);
        }

        if(v.getId()== R.id.death)
        {
            death1.setVisibility(v.GONE);
            chi.setVisibility(v.VISIBLE);
        }

    }
}
