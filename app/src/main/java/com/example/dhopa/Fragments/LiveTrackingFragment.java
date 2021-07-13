package com.example.dhopa.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dhopa.BottomNavActivity;
import com.example.dhopa.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LiveTrackingFragment extends Fragment {
FloatingActionButton floatingActionButton;
    public LiveTrackingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_live_tracking, container, false);
        floatingActionButton = view.findViewById(R.id.live);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BottomNavActivity.class);
                startActivity(intent);
            }
        });
            return view;
    }
}