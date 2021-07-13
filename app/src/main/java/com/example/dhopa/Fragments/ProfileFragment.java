package com.example.dhopa.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dhopa.BottomNavActivity;
import com.example.dhopa.LogIn;
import com.example.dhopa.NotificationActivity;
import com.example.dhopa.R;


public class ProfileFragment extends Fragment {
TextView refer,notificaton,signout;
Toolbar toolbar;

    public ProfileFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        refer = view.findViewById(R.id.profileReferAndEran);
        notificaton = view.findViewById(R.id.profileNotification);
        signout = view.findViewById(R.id.tvSignOut);

        toolbar = view.findViewById(R.id.toolbarProfile);


        refer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Toast.makeText(getContext(), "refer", Toast.LENGTH_SHORT).show();

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameProfile,new ReferAndEarnFragment()).commit();
            }
        });
        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), LogIn.class);
                getContext().startActivity(intent);
            }
        });

        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_baseline_arrow_back_ios_24));
       toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //What to do on back clicked
                //Toast.makeText(getContext(), "back", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), BottomNavActivity.class);
                startActivity(intent);
            }
        });

       notificaton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getContext(), NotificationActivity.class);
               startActivity(intent);
           }
       });




        return  view;
    }
}