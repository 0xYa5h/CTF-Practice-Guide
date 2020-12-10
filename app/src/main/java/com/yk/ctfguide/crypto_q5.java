package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class crypto_q5 extends AppCompatActivity {
    private TextView head,point,chal;
    private EditText ans;
    Button sub;
    Score sb;
    int marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto_q5);
        head = (TextView) findViewById(R.id.head_q5);
        point = (TextView) findViewById(R.id.point_q5);
        chal = (TextView) findViewById(R.id.chal_5);
        ans = (EditText) findViewById(R.id.ans_q5);
        sub = (Button) findViewById(R.id.sub_q5);
        sb = new Score();
        marks = 0;

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = ans.getText().toString();
                if(answer.equals(""))
                    Toast.makeText(crypto_q5.this, "Please enter the flag", Toast.LENGTH_SHORT).show();
                else{
                    if(answer.equalsIgnoreCase("abctf{b3tter_up_y0ur_e}")) {
                        Toast.makeText(crypto_q5.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                        marks = 10;
                        sb.Calculate(marks);
                    }
                    else
                        Toast.makeText(crypto_q5.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}