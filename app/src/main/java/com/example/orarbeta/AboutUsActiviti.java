package com.example.orarbeta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AboutUsActiviti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_activiti);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        menu.add(0,1,1,"Principala pagina");






        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if (item.getItemId() == 1)
        {
            Intent intentReturn = new Intent(AboutUsActiviti.this, MainActivity.class);
            startActivity(intentReturn);
        }
        return super.onOptionsItemSelected(item);
    }
}