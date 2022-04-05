package com.example.orarbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class GeoActivity extends AppCompatActivity {

    LinearLayout dascalbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);

        dascalbtn = (LinearLayout) findViewById(R.id.dascal);
        dascalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GeoActivity.this, geografie01.class);
                startActivity(intent);
            }
        });
    }
}