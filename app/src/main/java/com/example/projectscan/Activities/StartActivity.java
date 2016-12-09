package com.example.projectscan.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectscan.R;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        Button btn_checkpoint = (Button)findViewById(R.id.checkpoint_button);
        Button btn_ranking = (Button)findViewById(R.id.rankings_button);




        //code that connects MainActivity to MuseumActivity(activity_museum)


        btn_checkpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s_second_activity = new Intent(StartActivity.this,CheckpointActivity.class);
                startActivity(s_second_activity);
            }
        });


        //code that connects MainActivity to AttractionsActivity(activity_attractions)


        btn_ranking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s_third_activity = new Intent(StartActivity.this,RankingActivity.class);
                startActivity(s_third_activity);
            }
        });


    }
}
