package com.example.orarbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class PhysActivity extends AppCompatActivity {

    LinearLayout adelbtn;
    LinearLayout plescbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phys);

        adelbtn = (LinearLayout) findViewById(R.id.cirimp);
        adelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhysActivity.this, fizica01.class);
                startActivity(intent);
            }
        });

        plescbtn = (LinearLayout) findViewById(R.id.plesc);
        plescbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhysActivity.this, fizica02.class);
                startActivity(intent);
            }
        });
    }
}