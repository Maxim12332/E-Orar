package com.example.orarbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class FrenchActivity extends AppCompatActivity {

    LinearLayout bernicbtn;
    LinearLayout bucurosbtn;
    LinearLayout robubtn;
    LinearLayout ciocanbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french);

        bernicbtn = (LinearLayout) findViewById(R.id.bernic);
        bernicbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrenchActivity.this, fr01.class);
                startActivity(intent);
            }
        });
        bucurosbtn = (LinearLayout) findViewById(R.id.bucuros);
        bucurosbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrenchActivity.this, franc02.class);
                startActivity(intent);
            }
        });
        robubtn = (LinearLayout) findViewById(R.id.robu);
        robubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrenchActivity.this, fr03.class);
                startActivity(intent);
            }
        });
        ciocanbtn = (LinearLayout) findViewById(R.id.ciocan);
        ciocanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrenchActivity.this, fr04.class);
                startActivity(intent);
            }
        });

    }
}