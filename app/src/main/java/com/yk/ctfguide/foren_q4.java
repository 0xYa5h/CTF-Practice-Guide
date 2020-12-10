package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class foren_q4 extends AppCompatActivity {
    private TextView head,point,chal;
    private EditText ans;
    private Button sub;
    Score sb;
    int marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foren_q4);
        head = (TextView) findViewById(R.id.head_fq4);
        point = (TextView) findViewById(R.id.point_fq4);
        chal = (TextView) findViewById(R.id.chal_f4);
        ans = (EditText) findViewById(R.id.ans_fq4);
        sub = (Button) findViewById(R.id.sub_fq4);
        sb = new Score();
        marks = 0;

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = ans.getText().toString();
                if(answer.equals("")){
                    Toast.makeText(foren_q4.this, "Please enter the flag", Toast.LENGTH_SHORT).show();
                }else{
                    if( answer.equals("flag{3l1t3_3x1f_4uth0r1ty_dud3br0}")){
                        Toast.makeText(foren_q4.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                        marks = 10;
                        sb.Calculate(marks);
                    }
                    else
                        Toast.makeText(foren_q4.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}