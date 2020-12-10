package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Scoreboard extends AppCompatActivity {
    private TextView sc,pt;
    Score s;
    String new_score;
    ImageView ss;
    private Button hng;
    int sss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);
        sc = (TextView) findViewById(R.id.scrbrd);
        pt = (TextView) findViewById(R.id.pntscr);
        s = new Score();
        sss = 0;
        ss = (ImageView) findViewById(R.id.scoreim);
        hng = (Button) findViewById(R.id.changesc);


        hng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sss = s.updateScoreboard();
                new_score = Integer.toString(sss);
                pt.setText(new_score);

            }
        });




    }



}