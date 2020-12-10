package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pr_misc extends AppCompatActivity {
    private Button q1,q2,q3,q4,q5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr_misc);
        q1 = (Button) findViewById(R.id.robot);
        q2 = (Button) findViewById(R.id.qrcode);
        q3 = (Button) findViewById(R.id.wiki);
        q4 = (Button) findViewById(R.id.bity);
        q5 = (Button) findViewById(R.id.tracer);


        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_misc.this,misc_q1.class);
                startActivity(intent);
            }
        });

        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(pr_misc.this,misc_q2.class);
                startActivity(intent1);
            }
        });

        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_misc.this,misc_q3.class);
                startActivity(intent);
            }
        });

        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_misc.this,misc_q4.class);
                startActivity(intent);
            }
        });

        q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_misc.this,misc_q5.class);
                startActivity(intent);
            }
        });

    }
}