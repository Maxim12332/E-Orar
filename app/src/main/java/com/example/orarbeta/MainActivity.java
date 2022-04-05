package com.example.orarbeta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;



public class MainActivity extends AppCompatActivity {

    LinearLayout mathbtn;
    LinearLayout phbtn;
    LinearLayout geobtn;
    LinearLayout chmbtn;
    LinearLayout biobtn;
    LinearLayout hsbtn;
    LinearLayout infbtn;
    LinearLayout engbtn;
    LinearLayout frbtn;
    LinearLayout lbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mathbtn = (LinearLayout) findViewById(R.id.math);
        mathbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MathActivity.class);
                startActivity(intent);
            }
        });

        phbtn = (LinearLayout) findViewById(R.id.phy);
        phbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PhysActivity.class);
                startActivity(intent);
            }
        });

        geobtn = (LinearLayout) findViewById(R.id.geo);
        geobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GeoActivity.class);
                startActivity(intent);
            }
        });


        chmbtn = (LinearLayout) findViewById(R.id.chm);
        chmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChimieActivity.class);
                startActivity(intent);
            }
        });


        biobtn = (LinearLayout) findViewById(R.id.bio);
        biobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BioActivity.class);
                startActivity(intent);
            }
        });

        hsbtn = (LinearLayout) findViewById(R.id.hs);
        hsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });

        infbtn = (LinearLayout) findViewById(R.id.info);
        infbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InfActivity.class);
                startActivity(intent);
            }
        });
        engbtn = (LinearLayout) findViewById(R.id.eng);
        engbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EngActivity.class);
                startActivity(intent);
            }
        });
        lbtn = (LinearLayout) findViewById(R.id.rom);
        lbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LromActivity.class);
                startActivity(intent);
            }
        });
        frbtn = (LinearLayout) findViewById(R.id.e);
        frbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FrenchActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        menu.add(0,0,0,"Orarul Sunetelor");
        menu.add(0,1,1,"AboutUs");






        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {

        if (item.getItemId() == 0)
        {
            Intent intentT = new Intent(MainActivity.this,OrarulSunetelor.class);
            startActivity(intentT);
        }
        if (item.getItemId() == 1)
        {

            Intent intentA = new Intent(MainActivity.this,AboutUsActiviti.class);
            startActivity(intentA);
        }



        return super.onOptionsItemSelected(item);
    }
}









