package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pr_rev extends AppCompatActivity {
    private Button q1,q2,q3,q4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr_rev);
        q1 = (Button) findViewById(R.id.adoni);
        q2 = (Button) findViewById(R.id.android);
        q3 = (Button) findViewById(R.id.rey);
        q4 = (Button) findViewById(R.id.riyadh);


        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_rev.this,rev_q1.class);
                startActivity(intent);
            }
        });

        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(pr_rev.this,rev_q2.class);
                startActivity(intent1);
            }
        });

        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_rev.this,rev_q3.class);
                startActivity(intent);
            }
        });

        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_rev.this,rev_q4.class);
                startActivity(intent);
            }
        });
    }
}