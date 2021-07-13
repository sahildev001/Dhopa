package com.example.dhopa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.dhopa.Adapter.RecycleAdapter;
import com.example.dhopa.Adapter.RecycleNotification;
import com.example.dhopa.Model.ModelNotification;
import com.example.dhopa.Model.ModelRecycle;

import java.util.ArrayList;

public class NotificationActivity extends AppCompatActivity {
RecyclerView recyclerView;
Toolbar toolbar;
    ArrayList<ModelNotification> modelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        recyclerView =findViewById(R.id.notificationRecycle);
        listData();
        RecycleNotification adapter= new RecycleNotification(modelList);
        recyclerView.setAdapter(adapter);
        toolbar = findViewById(R.id.toolBarNotification);


        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_baseline_arrow_back_ios_24));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //What to do on back clicked
                //Toast.makeText(getContext(), "back", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(NotificationActivity.this, BottomNavActivity.class);
                startActivity(intent);
            }
        });

    }
    void listData(){
        ModelNotification modelNotification = new ModelNotification("Your order has been cancelled","Your order 2017112734 has been cancelled by you",
                "09 Nov",R.drawable.ic_baseline_cancel_24);
        modelList.add(modelNotification);
        modelNotification = new ModelNotification("Your order has been confirmed.","Be ready! with your clothing's baggage between " +
                "04:00PM to 06:00PM on 05 March 2021", "4hrs ago",R.drawable.ic_baseline_check_circle_24);
        modelList.add(modelNotification);
        modelNotification = new ModelNotification("Successfully delivered.","Your order 2017112734 has been successfully delivered to" +
                " you.", "12 Nov",R.drawable.ic_baseline_library_add_check_24);
        modelList.add(modelNotification);
        modelNotification = new ModelNotification("Your order is out for delivery.","Delivery boy will reach you between 12:00PM to 02:00PM " +
                "on Monday, 05 March 2021.", "12 Nov",R.drawable.ic_deliver);
        modelList.add(modelNotification);
        modelNotification = new ModelNotification("Your order is now in-process.","Your order is in process, it will be shipped within 48hrs" +
                " you.", "12 Nov",R.drawable.ic_process);
        modelList.add(modelNotification);
        modelNotification = new ModelNotification("Your baggage has been picked up.","Your baggage has been picked up successfully. It will be delivered" +
                " to you after 48hrs.", "12 Nov",R.drawable.ic_deliver);
        modelList.add(modelNotification);
        modelNotification = new ModelNotification("Laundry boy is now out for pickup.","Our staff member will reach to you between 10:00AM to 12:00" +
                "PM on Monday, 05 March 2021.", "12 Nov",R.drawable.ic_truck2);
        modelList.add(modelNotification);
        modelNotification = new ModelNotification("Your order has been confirmed.","Be ready! with your clothing's baggage between " +
                "04:00PM to 06:00PM on 05 March 2021", "4hrs ago",R.drawable.ic_baseline_check_circle_24);
        modelList.add(modelNotification);

    }
}