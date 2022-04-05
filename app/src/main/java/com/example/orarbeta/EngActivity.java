package com.example.orarbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class EngActivity extends AppCompatActivity {

    LinearLayout marbtn;
    LinearLayout natbtn;
    LinearLayout angbtn;
    LinearLayout olgbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng);


        marbtn = (LinearLayout) findViewById(R.id.mar);
        marbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EngActivity.this, Eng01.class);
                startActivity(intent);
            }
        });

        natbtn = (LinearLayout) findViewById(R.id.nat);
        natbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EngActivity.this, Eng02.class);
                startActivity(intent);
            }
        });

        angbtn = (LinearLayout) findViewById(R.id.ang);
        angbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EngActivity.this, Eng03.class);
                startActivity(intent);
            }
        });

        olgbtn = (LinearLayout) findViewById(R.id.olg);
        olgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EngActivity.this, Eng04.class);
                startActivity(intent);
            }
        });
    }
}