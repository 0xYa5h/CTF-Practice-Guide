package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class rev_q4 extends AppCompatActivity {
    private TextView head,point,chal;
    private EditText ans;
    private Button sub;
    Score sb;
    int marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rev_q4);
        point = (TextView) findViewById(R.id.point_rq4);
        chal = (TextView) findViewById(R.id.chal_rq4);
        ans = (EditText) findViewById(R.id.ans_rq4);
        sub = (Button) findViewById(R.id.sub_rq4);
        sb =new Score();
        marks = 0;

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = ans.getText().toString();
                if(answer.equals("")){
                    Toast.makeText(rev_q4.this, "Please enter the flag", Toast.LENGTH_SHORT).show();
                }else{
                    if( answer.equals("CTFlearn{Masmak_Fortress_1865}")){
                        Toast.makeText(rev_q4.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                        marks = 10;
                        sb.Calculate(marks);
                    }
                    else
                        Toast.makeText(rev_q4.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}