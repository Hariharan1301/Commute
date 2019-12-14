package com.example.commute;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button loginButton;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.passtext);
        loginButton = (Button) findViewById(R.id.login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String uID = username.getText().toString();
                String passKey = username.getText().toString();

                UserLogin userLogin = new UserLogin(uID, passKey);

                Intent activity = new Intent(LoginActivity.this, DetailsPane.class);
                //activity.putExtra("UserName", uID);

                if(true || userLogin.verifyUser()){
                    startActivity(activity);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Credentials Invalid", Toast.LENGTH_LONG).show();
                }

            }
        });

    }

}
