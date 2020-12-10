package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pr_web extends AppCompatActivity {
    private Button q1,q2,q3,q4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr_web);
        q1 = (Button) findViewById(R.id.basic);
        q2 = (Button) findViewById(R.id.blog);
        q3 = (Button) findViewById(R.id.post);
        q4 = (Button) findViewById(R.id.hash);


        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_web.this,web_q1.class);
                startActivity(intent);
            }
        });

        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(pr_web.this,web_q2.class);
                startActivity(intent1);
            }
        });

        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_web.this,web_q3.class);
                startActivity(intent);
            }
        });

        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_web.this,web_q4.class);
                startActivity(intent);
            }
        });


    }
}