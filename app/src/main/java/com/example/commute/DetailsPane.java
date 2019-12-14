package com.example.commute;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.arch.core.executor.TaskExecutor;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsPane extends AppCompatActivity {

    TextView uname, regNo, year, boardpoint, availability, dept, routeNo;
    Button changeAvailability;
    ImageView profileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_pane);
        matchObjects();

        UserDetails ud = new UserDetails();
        ud.getDetails();
        setValues(ud);
    }

    protected  void  setValues(UserDetails userDetails){
        String name = userDetails.name;
        uname.setText(name);

        String regnum = regNo.getText().toString();
        regnum += " "+userDetails.id;
        regNo.setText(regnum);

        String uYear = year.getText().toString();
        uYear += " "+userDetails.year;
        year.setText(uYear);

        String route = routeNo.getText().toString();
        route += " "+userDetails.routeno;
        year.setText(route);

        String boardingPoint = boardpoint.getText().toString();
        boardingPoint += " "+userDetails.bpt;
        year.setText(boardingPoint);

        String available = availability.getText().toString();
        if(userDetails.availability){
            available += " Yes";
        }
        else{
            available += " No";
        }
        availability.setText(available);
    }

    protected void matchObjects(){
        uname = findViewById(R.id.username);
        regNo = findViewById(R.id.userNumber);
        year = findViewById(R.id.year);
        boardpoint = findViewById(R.id.boardPoint);
        availability = findViewById(R.id.availability);
        dept = findViewById(R.id.deptName);
        routeNo = findViewById(R.id.routeNo);

        profileImage = findViewById(R.id.profileImg);
        changeAvailability = findViewById(R.id.availabilityChange);
    }

}
