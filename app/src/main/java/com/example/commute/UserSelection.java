package com.example.commute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class UserSelection extends AppCompatActivity {

    TextView user, admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_selection);
        user = (TextView) findViewById(R.id.user);
        admin = (TextView) findViewById(R.id.admin);

        final Intent activity = new Intent(UserSelection.this, LoginActivity.class);
        user.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                UserType.setUserType(1);
                startActivity(activity);
                return false;
            }
        });
        admin.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                UserType.setUserType(0);
                startActivity(activity);
                return false;
            }
        });

    }
}
