package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class rev_q1 extends AppCompatActivity {
    private TextView head,point,chal;
    private EditText ans;
    private Button sub;
    Score sb;
    int marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rev_q1);
        head = (TextView) findViewById(R.id.head_rq1);
        point = (TextView) findViewById(R.id.point_rq1);
        chal = (TextView) findViewById(R.id.chal_rq1);
        ans = (EditText) findViewById(R.id.ans_rq1);
        sub = (Button) findViewById(R.id.sub_rq1);
        sb =new Score();
        marks = 0;

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = ans.getText().toString();
                if(answer.equals("")){
                    Toast.makeText(rev_q1.this, "Please enter the flag", Toast.LENGTH_SHORT).show();
                }else{
                    if( answer.equals("CTFlearn{Kurn00l_District}")){
                        Toast.makeText(rev_q1.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                        marks = 10;
                        sb.Calculate(marks);
                    }
                    else
                        Toast.makeText(rev_q1.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}