package com.example.orarbeta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class OrarulSunetelor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orarul_sunetelor);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        menu.add(0,0,0,"Principala pagina");






        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if (item.getItemId() == 0)
        {
            Intent intentReturn = new Intent(OrarulSunetelor.this, MainActivity.class);
            startActivity(intentReturn);
        }
        return super.onOptionsItemSelected(item);
    }
}