package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class About extends AppCompatActivity {
    private TextView text, version;
    private ImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final androidx.appcompat.widget.Toolbar toolbar = (Toolbar) findViewById(R.id.tbabout);
        setSupportActionBar(toolbar);

        setContentView(R.layout.activity_about);
        text = (TextView) findViewById(R.id.aboutext);
        version = (TextView) findViewById(R.id.versionabout);
        icon = (ImageView) findViewById(R.id.iconimage);
    }
}