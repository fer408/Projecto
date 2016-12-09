package com.example.projectscan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectscan.Activities.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
         protected void onCreate(Bundle savedInstanceState) {
                 super.onCreate(savedInstanceState);
                 setContentView(R.layout.activity_main);




                 //Buttons that connect to my buttons are created here
                 Button btn1 = (Button)findViewById(R.id.login_button);


                 //code that connects MainActivity to LoginActivity(activity_login)


                 btn1.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                                 Intent i_second_activity = new Intent(MainActivity.this,LoginActivity.class);
                                 startActivity(i_second_activity);
                             }
                     });








             }
     }
