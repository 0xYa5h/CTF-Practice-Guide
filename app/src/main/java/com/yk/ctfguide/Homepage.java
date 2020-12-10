package com.yk.ctfguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {
    DrawerLayout dLayout;
    ImageButton btguide,btpractice;



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.profile:
                Intent intent = new Intent(Homepage.this,Scoreboard.class);
                startActivity(intent);
                break;
            case R.id.logout:
                Intent intent2 = new Intent(Homepage.this,MainActivity.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.about:
                Intent intent3 = new Intent(Homepage.this, About.class);
                startActivity(intent3);
                break;


        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.tbmenu);
        setSupportActionBar(toolbar);

        btguide = (ImageButton) findViewById(R.id.btguide);
        btpractice = (ImageButton) findViewById(R.id.btpractice);

        btguide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this,guide.class);
                startActivity(intent);

            }
        });

        btpractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this,practice_challs.class);
                startActivity(intent);
            }
        });

    }




}
