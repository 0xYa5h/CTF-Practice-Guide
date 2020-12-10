package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class misc_q1 extends AppCompatActivity {
    private TextView head,point,chal;
    private EditText ans;
    Button sub;
    Score sb;
    int marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misc_q1);
        head = (TextView) findViewById(R.id.head_mq1);
        point = (TextView) findViewById(R.id.point_mq1);
        chal = (TextView) findViewById(R.id.chal_mq1);
        ans = (EditText) findViewById(R.id.ans_mq1);
        sub = (Button) findViewById(R.id.sub_mq1);
        sb = new Score();
        marks = 0;

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = ans.getText().toString();
                if(answer.equals("")){
                    Toast.makeText(misc_q1.this, "Please enter the flag", Toast.LENGTH_SHORT).show();
                }else{
                    if( answer.equals("flag{5uch_j4v4_5crip7_much_w0w}")){
                        Toast.makeText(misc_q1.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                        marks = 10;
                        sb.Calculate(marks);
                    }
                    else
                        Toast.makeText(misc_q1.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}