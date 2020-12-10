package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class foren_q3 extends AppCompatActivity {
    private TextView head,point,chal;
    private EditText ans;
    Button sub;
    Score sb;
    int marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foren_q3);
        head = (TextView) findViewById(R.id.head_fq3);
        point = (TextView) findViewById(R.id.point_fq3);
        chal = (TextView) findViewById(R.id.chal_f3);
        ans = (EditText) findViewById(R.id.ans_fq3);
        sub = (Button) findViewById(R.id.sub_fq3);
        sb = new Score();
        marks = 0;

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = ans.getText().toString();
                if(answer.equals("")){
                    Toast.makeText(foren_q3.this, "Please enter the flag", Toast.LENGTH_SHORT).show();
                }else{
                    if( answer.equals("ABCTF{b1nw4lk_is_us3ful}")){
                        Toast.makeText(foren_q3.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                        marks = 10;
                        sb.Calculate(marks);
                    }
                    else
                        Toast.makeText(foren_q3.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}