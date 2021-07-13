package com.example.dhopa.Fragments;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dhopa.BottomNavActivity;
import com.example.dhopa.R;

import java.util.ArrayList;

public class MyOrderFragment extends Fragment {
int count =1,countIron=1;
LinearLayout fold,iron;
ImageView ivFold,ivIron;
RatingBar ratingBar;
TextView ratingValue;
Toolbar mActionBar;
    public MyOrderFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_my_order, container, false);
fold= view.findViewById(R.id.llFold);
iron= view.findViewById(R.id.llIron);
ivIron= view.findViewById(R.id.ivIron);
ivFold= view.findViewById(R.id.ivFold);
ratingBar= view.findViewById(R.id.RatingBar);
ratingValue = view.findViewById(R.id.tvRating);
//viewDetails = view.findViewById(R.id.tvViewDetails);
//viewDetails.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameMyorder,new ProgressFragment()).commit();
//    }
//});
ratingValue.setText(String.valueOf(ratingBar.getRating()));
ivFold.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(getContext(), "click", Toast.LENGTH_SHORT).show();
        count++;
        if(count%2==0){
            fold.setVisibility(View.GONE);
            ivFold.setImageResource(R.drawable.ic_baseline_arrow_down_24);
        }
        else {
            fold.setVisibility(View.VISIBLE);
            ivFold.setImageResource(R.drawable.ic_baseline_arrow_up_24);
        }
    }
});
        ivIron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "click", Toast.LENGTH_SHORT).show();
                countIron++;
                if(countIron%2==0){
                    iron.setVisibility(View.GONE);
                    ivIron.setImageResource(R.drawable.ic_baseline_arrow_down_24);
                }
                else {
                    iron.setVisibility(View.VISIBLE);
                    ivIron.setImageResource(R.drawable.ic_baseline_arrow_up_24);
                }
            }
        });


        mActionBar= view.findViewById(R.id.toolbarOrder);


        mActionBar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_baseline_arrow_back_ios_24));
        mActionBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //What to do on back clicked
                Toast.makeText(getContext(), "back", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), BottomNavActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }
}