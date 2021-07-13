package com.example.dhopa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dhopa.Fragments.PostcodeChooseYourOPotion;
import com.example.dhopa.Fragments.ProgressFragment;

public class SchedulePickupActivity3 extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_pickup3);
        button = findViewById(R.id.schedulePickup3);
        findViewById(R.id.frameSchedulePickup3).setVisibility(View.GONE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if( findViewById(R.id.frameSchedulePickup3).getVisibility() == View.GONE){
                   findViewById(R.id.frameSchedulePickup3).setVisibility(View.VISIBLE);
               }
              getSupportFragmentManager().beginTransaction().replace(R.id.frameSchedulePickup3,new ProgressFragment()).commit();
            }
        });
    }
}