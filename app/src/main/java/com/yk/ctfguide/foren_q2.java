package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class foren_q2 extends AppCompatActivity {
    private TextView head,point,chal;
    private EditText ans;
    private Button sub;
    Score sb;
    int marks;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foren_q2);
        head = (TextView) findViewById(R.id.head_fq2);
        point = (TextView) findViewById(R.id.point_fq2);
        chal = (TextView) findViewById(R.id.chal_f2);
        ans = (EditText) findViewById(R.id.ans_fq2);
        sub = (Button) findViewById(R.id.sub_fq2);
        sb = new Score();
        marks = 10;

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = ans.getText().toString();
                if(answer.equals(""))
                    Toast.makeText(foren_q2.this, "Please enter something", Toast.LENGTH_SHORT).show();
                else{
                    if(answer.equals("ABCTF{T3Rm1n4l_is_C00l}")) {
                        Toast.makeText(foren_q2.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                        marks = 10;
                        sb.Calculate(marks);
                    }
                    else
                        Toast.makeText(foren_q2.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}