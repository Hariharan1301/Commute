package com.example.commute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ImageView appIcon;
    TextView appname, proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appname = (TextView) findViewById(R.id.commute);
        proceed = (TextView) findViewById(R.id.proceed);
        appIcon = (ImageView) findViewById(R.id.commuteIcon);

        proceed.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent i = new Intent(MainActivity.this, UserSelection.class);
                startActivity(i);
                return false;
            }
        });
    }
}
