package com.example.dhopa.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.dhopa.BottomNavActivity;
import com.example.dhopa.R;
import com.google.android.material.card.MaterialCardView;

import java.util.Objects;


public class Postcode2 extends Fragment {
MaterialCardView cvGo;


    public Postcode2() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_postcode2, container, false);

        cvGo = view.findViewById(R.id.cvGo);
        cvGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.postCodeContainer2,new Postcode3()).commit();

            }
        });
        return view;
    }
}