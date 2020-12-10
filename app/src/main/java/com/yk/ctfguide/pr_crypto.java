package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pr_crypto extends AppCompatActivity {
    private Button q1,q2,q3,q4,q5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final androidx.appcompat.widget.Toolbar toolbar = (Toolbar) findViewById(R.id.tbcrypto);
        setSupportActionBar(toolbar);

        setContentView(R.layout.activity_pr_crypto);
        q1 = (Button) findViewById(R.id.base64);
        q2 = (Button) findViewById(R.id.vig);
        q3 = (Button) findViewById(R.id.morse);
        q4 = (Button) findViewById(R.id.subs);
        q5 = (Button) findViewById(R.id.rsa);


        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_crypto.this,crypto_q1.class);
                startActivity(intent);
            }
        });

        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_crypto.this,crypto_q2.class);
                startActivity(intent);
            }
        });

        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_crypto.this,crypto_q3.class);
                startActivity(intent);
            }
        });

        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_crypto.this,crypto_q4.class);
                startActivity(intent);
            }
        });

        q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_crypto.this,crypto_q5.class);
                startActivity(intent);
            }
        });

    }


}