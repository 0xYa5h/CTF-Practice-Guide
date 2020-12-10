package com.yk.ctfguide;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.appcompat.widget.Toolbar;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class pr_foren extends AppCompatActivity {
    private Button q1,q2,q3,q4,q5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final androidx.appcompat.widget.Toolbar toolbar = (Toolbar) findViewById(R.id.tbforen);
        setSupportActionBar(toolbar);

        setContentView(R.layout.activity_pr_foren);
        q1 = (Button) findViewById(R.id.for101);
        q2 = (Button) findViewById(R.id.takingls);
        q3 = (Button) findViewById(R.id.binw);
        q4 = (Button) findViewById(R.id.exif);
        q5 = (Button) findViewById(R.id.dump);


        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_foren.this,foren_q1.class);
                startActivity(intent);
            }
        });

        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(pr_foren.this,foren_q2.class);
                startActivity(intent1);
            }
        });

        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_foren.this,foren_q3.class);
                startActivity(intent);
            }
        });

        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_foren.this,foren_q4.class);
                startActivity(intent);
            }
        });

        q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pr_foren.this,foren_q5.class);
                startActivity(intent);
            }
        });
    }



}