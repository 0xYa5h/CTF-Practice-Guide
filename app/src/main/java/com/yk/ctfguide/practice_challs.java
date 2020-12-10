package com.yk.ctfguide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class practice_challs extends AppCompatActivity {
    private ImageButton pcrypto,pforen,pmisc,pweb,prev;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_challs);
        pcrypto = (ImageButton) findViewById(R.id.p_crypto);
        pforen = (ImageButton) findViewById(R.id.p_foren);
        pmisc = (ImageButton) findViewById(R.id.p_misc);
        pweb = (ImageButton) findViewById(R.id.p_web);
        prev = (ImageButton) findViewById(R.id.p_rev);

        pcrypto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(practice_challs.this,pr_crypto.class);
                startActivity(intent);
            }
        });

        pforen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(practice_challs.this,pr_foren.class);
                startActivity(intent);
            }
        });

        pmisc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(practice_challs.this,pr_misc.class);
                startActivity(intent);
            }
        });

        pweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(practice_challs.this, pr_web.class);
                startActivity(intent);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(practice_challs.this,pr_rev.class);
                startActivity(intent);
            }
        });




    }



}