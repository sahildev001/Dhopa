package com.example.dhopa.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.dhopa.Adapter.AdapterRvPaymentHostory;
import com.example.dhopa.BottomNavActivity;
import com.example.dhopa.R;

public class PaymentHistoryFragment extends Fragment {
RecyclerView recyclerView;
Toolbar toolbar;
    public PaymentHistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_payment_history, container, false);
            recyclerView = view.findViewById(R.id.rvpaymentHistory);
            recyclerView.setAdapter(new AdapterRvPaymentHostory());
            toolbar = view.findViewById(R.id.toolbarPaymentHistory);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_baseline_arrow_back_ios_24));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
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