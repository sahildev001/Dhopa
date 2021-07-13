package com.example.dhopa.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dhopa.R;
import com.google.android.material.card.MaterialCardView;


public class PostcodeChooseYourOPotion extends Fragment {

    MaterialCardView home,office;
    TextView tvhome;
    View lastclickedview;





    public PostcodeChooseYourOPotion() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_postcode_choose_your_o_ption, container, false);
        home = view.findViewById(R.id.cvHome);
        office = view.findViewById(R.id.cvOffice);
        tvhome = view.findViewById(R.id.tvHome);




        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "home", Toast.LENGTH_SHORT).show();
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.postCodeContainer,new Postcode2()).commit();
                home.setVisibility(View.GONE);
                office.setVisibility(View.GONE);
                if(v != lastclickedview) {
                    home.setCardBackgroundColor(getActivity().getResources().getColor(R.color.color_primary));
                    tvhome.setTextColor(getActivity().getResources().getColor(R.color.white));

                    // lastclickedview.setBackgroundColor(getActivity().getResources().getColor(R.color.white));

                }
                //your Action
                lastclickedview =  v;

            }
        });
        office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "office", Toast.LENGTH_SHORT).show();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.postCodeContainer,new Postcode2()).commit();
                home.setVisibility(View.GONE);
                office.setVisibility(View.GONE);
                if(v != lastclickedview) {
                    home.setCardBackgroundColor(getActivity().getResources().getColor(R.color.color_primary));

                    //  lastclickedview.setBackgroundColor(getActivity().getResources().getColor(R.color.white));
                }
                //your Action
                lastclickedview =  v;
            }
        });


        return view;
    }
}