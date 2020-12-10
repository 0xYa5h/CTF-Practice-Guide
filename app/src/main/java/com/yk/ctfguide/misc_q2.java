package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class misc_q2 extends AppCompatActivity {
    private TextView head,point,chal;
    private EditText ans;
    Button sub;
    Score sb;
    int marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misc_q2);
        head = (TextView) findViewById(R.id.head_mq2);
        point = (TextView) findViewById(R.id.point_mq2);
        chal = (TextView) findViewById(R.id.chal_mq2);
        ans = (EditText) findViewById(R.id.ans_mq2);
        sub = (Button) findViewById(R.id.sub_mq2);
        sb = new Score();
        marks = 0;

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = ans.getText().toString();
                if(answer.equals("")){
                    Toast.makeText(misc_q2.this, "Please enter the flag", Toast.LENGTH_SHORT).show();
                }else{
                    if( answer.equals("flag{n0_body_f0rget_qr_code}")){
                        Toast.makeText(misc_q2.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                        marks = 10;
                        sb.Calculate(marks);
                    }
                    else
                        Toast.makeText(misc_q2.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}