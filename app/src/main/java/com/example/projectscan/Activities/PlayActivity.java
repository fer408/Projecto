package com.example.projectscan.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectscan.MainActivity;
import com.example.projectscan.R;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);




        //Buttons that connect to my buttons are created here
                 Button btn1 = (Button)findViewById(R.id.start_button);
                 Button btn2 = (Button)findViewById(R.id.account_button);
                 Button btn3 = (Button)findViewById(R.id.balance_button);
                 Button btn4 = (Button)findViewById(R.id.events_button);




                 //code that connects MainActivity to MuseumActivity(activity_museum)


                 btn1.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View v) {
                                 Intent p_second_activity = new Intent(PlayActivity.this,StartActivity.class);
                                 startActivity(p_second_activity);
                             }
                     });


         //code that connects MainActivity to AttractionsActivity(activity_attractions)


                 btn2.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View v) {
                                 Intent p_third_activity = new Intent(PlayActivity.this,AccountActivity.class);
                                 startActivity(p_third_activity);
                             }
                     });


         //code that connects MainActivity to RestaurantsActivity(activity_restaurants)


                 btn3.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View v) {
                                 Intent p_fourth_activity = new Intent(PlayActivity.this,BalanceActivity.class);
                                 startActivity(p_fourth_activity);
                             }
                     });


         //code that connects MainActivity to HotelsActivity(activity_hotels)


                 btn4.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View v) {
                                 Intent p_fifth_activity = new Intent(PlayActivity.this,EventActivity.class);
                                 startActivity(p_fifth_activity);
                             }
                     });







    }
}
