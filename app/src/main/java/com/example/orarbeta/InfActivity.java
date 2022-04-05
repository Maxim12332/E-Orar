package com.example.orarbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class InfActivity extends AppCompatActivity {

    LinearLayout crihanbtn;
    LinearLayout botezatbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf);

        crihanbtn = (LinearLayout) findViewById(R.id.crihan);
        crihanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfActivity.this, info01.class);
                startActivity(intent);
            }
        });
        botezatbtn = (LinearLayout) findViewById(R.id.botezat);
        botezatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfActivity.this, info02.class);
                startActivity(intent);
            }
        });
    }
}