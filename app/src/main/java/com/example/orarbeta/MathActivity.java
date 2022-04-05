package com.example.orarbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MathActivity extends AppCompatActivity {

    LinearLayout pisarubtn;
    LinearLayout pasatbtn;
    LinearLayout pripabtn;
    LinearLayout matienicibtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);


        pisarubtn = (LinearLayout) findViewById(R.id.anatol);
        pisarubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MathActivity.this, math01.class);
                startActivity(intent);
            }
        });

        pasatbtn = (LinearLayout) findViewById(R.id.lidia);
        pasatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MathActivity.this, math02.class);
                startActivity(intent);
            }
        });
        pripabtn = (LinearLayout) findViewById(R.id.liudmila);
        pripabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MathActivity.this, math03.class);
                startActivity(intent);
            }
        });
        matienicibtn = (LinearLayout) findViewById(R.id.matienici);
        matienicibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MathActivity.this, math04.class);
                startActivity(intent);
            }
        });
    }
}