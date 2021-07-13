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
import com.example.dhopa.R;

public class HelpFragment extends Fragment {
    TextView help,toolbaricon;
    Toolbar mActionBar;
    public HelpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_help, container, false);

        help = view.findViewById(R.id.tvHelp);
        toolbaricon= view.findViewById(R.id.tvToolbarHelp);
        String data="Lorem ipsum dolor sit amet, consecteur elit, sed do eiusmod tempor incididunt elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"velit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"velit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"velit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"elit, sed do eiusmod tempor incididunt ut\"v";
                help.setText(data);
        mActionBar= view.findViewById(R.id.toolbarHelp);


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


                return  view;
    }
}