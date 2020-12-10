package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class foren_q5 extends AppCompatActivity {
    private TextView head,point,chal;
    private EditText ans;
    Button sub;
    Score sb;
    int marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foren_q5);
        head = (TextView) findViewById(R.id.head_fq5);
        point = (TextView) findViewById(R.id.point_fq5);
        chal = (TextView) findViewById(R.id.chal_f5);
        ans = (EditText) findViewById(R.id.ans_fq5);
        sub = (Button) findViewById(R.id.sub_fq5);
        sb =new Score();
        marks = 0;

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = ans.getText().toString();
                if(answer.equals("")){
                    Toast.makeText(foren_q5.this, "Please enter the flag", Toast.LENGTH_SHORT).show();
                }else{
                    if( answer.equals("flag{fl4ggyfl4g}")){
                        Toast.makeText(foren_q5.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                        marks = 10;
                        sb.Calculate(marks);
                    }
                    else
                        Toast.makeText(foren_q5.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}