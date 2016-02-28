package com.adamant.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MyAppList extends AppCompatActivity {

    Button spotify;
    Button scores;
    Button library;
    Button buildit;
    Button xyz;
    Button myapp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        spotify= (Button) findViewById(R.id.button_spotify);
        scores= (Button) findViewById(R.id.button_scoresapp);
        library= (Button) findViewById(R.id.button_library);
        buildit= (Button) findViewById(R.id.button_buildbigger);
        xyz= (Button) findViewById(R.id.button_xyzreader);
        myapp= (Button) findViewById(R.id.button_myapp);


        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyAppList.this,"This button will launch my Spotify App!",Toast.LENGTH_SHORT).show();
            }
        });

        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyAppList.this,"This button will launch my Scores App!",Toast.LENGTH_SHORT).show();
            }
        });

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyAppList.this,"This button will launch my Library App!",Toast.LENGTH_SHORT).show();
            }
        });

        buildit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyAppList.this,"This button will launch my Build it biggger App!",Toast.LENGTH_SHORT).show();
            }
        });

        xyz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyAppList.this,"This button will launch my XYZ App!",Toast.LENGTH_SHORT).show();
            }
        });

        myapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyAppList.this,"This button will launch my Own App!",Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
