package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    EditText name, pas, cpass, fullname;
    Button sub, lg;
    Database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        fullname = (EditText) findViewById(R.id.fullname);
        name = (EditText) findViewById(R.id.name);
        pas = (EditText) findViewById(R.id.passwd);
        cpass = (EditText) findViewById(R.id.confirm);
        sub = (Button) findViewById(R.id.submit);
        lg = (Button) findViewById(R.id.lgback);
        db = new Database(this);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Fullnm = fullname.getText().toString();
                String usrnm = name.getText().toString();
                String usrpd = pas.getText().toString();
                String cuserpd = cpass.getText().toString();
                if ( usrnm.equals("") || usrpd.equals("") || cuserpd.equals(""))
                    Toast.makeText(Registration.this, "Enter all credentials", Toast.LENGTH_SHORT).show();
                else{
                    if(usrpd.equals(cuserpd)){
                        Boolean checkuser = db.checkusername(usrnm);
                        if( checkuser == false){
                            Boolean insert = db.insertData(Fullnm, usrnm, usrpd);
                            if( insert == true){
                                Toast.makeText(Registration.this, "Username Registered Successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), Homepage.class);
                                startActivity(intent);
                                finish();
                            } else{
                                Toast.makeText(Registration.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                            }

                        } else{
                            Toast.makeText(Registration.this, "Username already exists", Toast.LENGTH_SHORT).show();
                        }
                    } else{
                        Toast.makeText(Registration.this, "Passwords not matching", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
