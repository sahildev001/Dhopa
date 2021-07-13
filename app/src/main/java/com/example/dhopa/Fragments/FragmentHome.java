package com.example.dhopa.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dhopa.Adapter.RecycleAdapter;
import com.example.dhopa.Adapter.RecycleOfferAdapter;
import com.example.dhopa.Model.ModelRecycle;
import com.example.dhopa.R;

import java.util.ArrayList;

public class FragmentHome extends Fragment {
RecyclerView recyclerView,recycleViewOffer;

    ArrayList<ModelRecycle> modelReycleList = new ArrayList<>();


    public FragmentHome() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = v.findViewById(R.id.recyclerView);

            listData();
        RecycleAdapter adapter= new RecycleAdapter(modelReycleList);
        recyclerView.setAdapter(adapter);

        recycleViewOffer= v.findViewById(R.id.recyclerViewOffers);
        RecycleOfferAdapter recycleOfferAdapter = new RecycleOfferAdapter(modelReycleList);
        recycleViewOffer.setAdapter(recycleOfferAdapter);

        return v;

    }
    void listData(){
        ModelRecycle modelRecycle = new ModelRecycle("Dhopa Laundary","1810 Camino Real","4.3",R.drawable.laundry);
        modelReycleList.add(modelRecycle);
        modelRecycle = new ModelRecycle("Dhopa Laundary","1810 Camino Real","4.2",R.drawable.laundry);
        modelReycleList.add(modelRecycle);
        modelRecycle = new ModelRecycle("Dhopa Laundary","1810 Camino Real","-5",R.drawable.laundry);
        modelReycleList.add(modelRecycle);

    }
}