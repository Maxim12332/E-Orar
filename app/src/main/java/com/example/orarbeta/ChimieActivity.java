package com.example.orarbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ChimieActivity extends AppCompatActivity {

    LinearLayout postaribtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chimie);

        postaribtn = (LinearLayout) findViewById(R.id.postari);
        postaribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChimieActivity.this, chimie01.class);
                startActivity(intent);
            }
        });
    }
}