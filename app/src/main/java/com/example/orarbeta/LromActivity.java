package com.example.orarbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class LromActivity extends AppCompatActivity {

    LinearLayout abordeniucbtn;
    LinearLayout cebtbtn;
    LinearLayout botnbtn;
    LinearLayout virgbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lrom);



        abordeniucbtn = (LinearLayout) findViewById(R.id.bord);
        abordeniucbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LromActivity.this, rom01.class);
                startActivity(intent);
            }
        });

        cebtbtn = (LinearLayout) findViewById(R.id.cebt);
        cebtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LromActivity.this, rom02.class);
                startActivity(intent);
            }
        });

        botnbtn = (LinearLayout) findViewById(R.id.botn);
        botnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LromActivity.this, rom03.class);
                startActivity(intent);
            }
        });

        virgbtn = (LinearLayout) findViewById(R.id.virg);
        virgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LromActivity.this, rom04.class);
                startActivity(intent);
            }
        });
    }
}