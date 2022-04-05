package com.example.orarbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class BioActivity extends AppCompatActivity {

    LinearLayout arceabtn;
    LinearLayout condratiucbtn;
    LinearLayout chihaibtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        arceabtn = (LinearLayout) findViewById(R.id.arcea);
        arceabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BioActivity.this, bio01.class);
                startActivity(intent);
            }
        });

        condratiucbtn = (LinearLayout) findViewById(R.id.condratiuc);
        condratiucbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BioActivity.this, bio02.class);
                startActivity(intent);
            }
        });

        chihaibtn = (LinearLayout) findViewById(R.id.chihai);
        chihaibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BioActivity.this, bio03.class);
                startActivity(intent);
            }
        });
    }
}