package com.example.orarbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HistoryActivity extends AppCompatActivity {
    LinearLayout andreibtn;
    LinearLayout rusubtn;
    LinearLayout carolinabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        andreibtn = (LinearLayout) findViewById(R.id.rusu);
        andreibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HistoryActivity.this, istoria01.class);
                startActivity(intent);
            }
        });
        rusubtn = (LinearLayout) findViewById(R.id.cos);
        rusubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HistoryActivity.this, istoria02.class);
                startActivity(intent);
            }
        });

        carolinabtn = (LinearLayout) findViewById(R.id.bos);
        carolinabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HistoryActivity.this, istoria03.class);
                startActivity(intent);
            }
        });
    }
}