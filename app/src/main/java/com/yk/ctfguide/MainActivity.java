package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Username, Password;
    private Button Login;
    private ImageButton Register;
    private TextView tv;
    Database DB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText) findViewById(R.id.etUsername);
        Password = (EditText) findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btLogin);
        Register = (ImageButton) findViewById(R.id.imRegister);
        tv = (TextView) findViewById(R.id.tvSignup);
        DB = new Database(this);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = Username.getText().toString();
                String pass = Password.getText().toString();

                if( name.equals("") || pass.equals("")){
                    Toast.makeText(MainActivity.this, "Enter all Credentials", Toast.LENGTH_SHORT).show();
                }else{
                    Boolean checkusernpass = DB.checkusernpass(name,pass);
                    if(checkusernpass == true){
                        Intent intent = new Intent(getApplicationContext(), Homepage.class);
                        startActivity(intent);
                        finish();

                    }else{
                        Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), Registration.class);
                startActivity(intent);
                finish();


            }
        });
    }

}
