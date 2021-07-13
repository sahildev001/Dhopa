package com.example.dhopa.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.dhopa.BottomNavActivity;
import com.example.dhopa.R;
import com.example.dhopa.SchedulePickupActivity;

public class CartFragment extends Fragment {
    Toolbar Actionbar;
ImageView ivFoldMens,ivFoldWomen,ivFoldBedding,ivFoldHouseHold,ivIronMan,ivIronWomen;
LinearLayout llFoldMens,llFoldWomen,llFoldBedding,llFoldHouseHold,llIronMan,llIronWomen;
int countmen=1,countwomen=1,countbedding=1,countHousehold=1,countironman=1,countIronwomen=1;

Button button;


    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_cart, container, false);

        Actionbar = view.findViewById(R.id.toolbarCart);
        Actionbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_baseline_arrow_back_ios_24));
        Actionbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //What to do on back clicked
                Toast.makeText(getContext(), "back", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), BottomNavActivity.class);
                startActivity(intent);
            }
        });
        button = view.findViewById(R.id.cartButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SchedulePickupActivity.class);
                startActivity(intent);
            }
        });

        ivFoldMens= view.findViewById(R.id.ivFoldMan);
        ivFoldWomen= view.findViewById(R.id.ivFoldWomen);
        ivFoldBedding= view.findViewById(R.id.ivFoldBedding);
        ivFoldHouseHold= view.findViewById(R.id.ivFoldHouseholds);
        ivIronMan= view.findViewById(R.id.ivIromMen);
        ivIronWomen= view.findViewById(R.id.ivIronWomen);

        llFoldMens = view.findViewById(R.id.llmenCart);
        llFoldWomen = view.findViewById(R.id.llWomenmenCart);
        llFoldBedding = view.findViewById(R.id.llbeddingCart);
        llFoldHouseHold = view.findViewById(R.id.llHouseholdCart);
        llIronMan = view.findViewById(R.id.llmenIronCart);
        llIronWomen = view.findViewById(R.id.llWomenmenIronCart);


        ivIronMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countironman++;
                if(countironman%2==0){
                    llIronMan.setVisibility(View.GONE);
                    ivIronMan.setImageResource(R.drawable.ic_baseline_arrow_down_24);
                }
                else {
                    llIronMan.setVisibility(View.VISIBLE);
                    ivIronMan.setImageResource(R.drawable.ic_baseline_arrow_up_24);
                }
            }
        });
        ivIronWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countIronwomen++;
                if(countIronwomen%2==0){
                    llIronWomen.setVisibility(View.GONE);
                    ivIronWomen.setImageResource(R.drawable.ic_baseline_arrow_down_24);
                }
                else {
                    llIronWomen.setVisibility(View.VISIBLE);
                    ivIronWomen.setImageResource(R.drawable.ic_baseline_arrow_up_24);
                }
            }
        });


        ivFoldMens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countmen++;
                if(countmen%2==0){
                    llFoldMens.setVisibility(View.GONE);
                    ivFoldMens.setImageResource(R.drawable.ic_baseline_arrow_down_24);
                }
                else {
                    llFoldMens.setVisibility(View.VISIBLE);
                    ivFoldMens.setImageResource(R.drawable.ic_baseline_arrow_up_24);
                }
            }
        });
        ivFoldWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countwomen++;
                if(countwomen%2==0){
                    llFoldWomen.setVisibility(View.GONE);
                    ivFoldWomen.setImageResource(R.drawable.ic_baseline_arrow_down_24);
                }
                else {
                    llFoldWomen.setVisibility(View.VISIBLE);
                    ivFoldWomen.setImageResource(R.drawable.ic_baseline_arrow_up_24);
                }
            }
        });
        ivFoldBedding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countbedding++;
                if(countbedding%2==0){
                    llFoldBedding.setVisibility(View.GONE);
                    ivFoldBedding.setImageResource(R.drawable.ic_baseline_arrow_down_24);
                }
                else {
                    llFoldBedding.setVisibility(View.VISIBLE);
                    ivFoldBedding.setImageResource(R.drawable.ic_baseline_arrow_up_24);
                }
            }
        });
        ivFoldHouseHold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countHousehold++;
                if(countHousehold%2==0){
                    llFoldHouseHold.setVisibility(View.GONE);
                    ivFoldHouseHold.setImageResource(R.drawable.ic_baseline_arrow_down_24);
                }
                else {
                    llFoldHouseHold.setVisibility(View.VISIBLE);
                    ivFoldHouseHold.setImageResource(R.drawable.ic_baseline_arrow_up_24);
                }
            }
        });




        return  view;
    }
}