package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class guide extends AppCompatActivity {
    private ImageButton crypto,foren,misc,web,rev;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        crypto = (ImageButton) findViewById(R.id.crypto);
        foren = (ImageButton) findViewById(R.id.foren);
        misc = (ImageButton) findViewById(R.id.misc);
        web = (ImageButton) findViewById(R.id.web);
        rev = (ImageButton) findViewById(R.id.rev);


        crypto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(guide.this,Cryptography.class);
                startActivity(intent);
            }
        });

        foren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(guide.this,Forensic_guide.class);
                startActivity(intent);
            }
        });

        misc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(guide.this,MISC_guide.class);
                startActivity(intent);
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(guide.this, Web_guide.class);
                startActivity(intent);
            }
        });

        rev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(guide.this,Rev_guide.class);
                startActivity(intent);
            }
        });

    }
}