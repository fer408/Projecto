package com.example.projectscan.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectscan.MainActivity;
import com.example.projectscan.Activities.PlayActivity;
import com.example.projectscan.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Buttons that connect to my buttons are created here
        Button play_btn = (Button)findViewById(R.id.play_button);


        //code that connects LoginActivity to PlayActivity(activity_login)

        play_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l_second_activity = new Intent(LoginActivity.this,PlayActivity.class);
                startActivity(l_second_activity);
            }
        });

    }



}
