package com.example.dhopa.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.example.dhopa.R;


public class Postcode3 extends Fragment {
TextView pin_loc;
    public Postcode3() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_postcode3, container, false);

        pin_loc = v.findViewById(R.id.tvPinYourLocation);

        pin_loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame_replace_for_maps,
                        new PinYourLocationMapsFragment()).commit();
            }
        });

        String[] type = new String[] {"Phase 8 Sector 59, Mohali", "Phase 8 Sector 59, Mohali", "Phase 8 Sector 59, Mohali", "Phase 8 Sector 59, Mohali","Phase 8 Sector 59, Mohali"};

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        getActivity(),
                        R.layout.dropdown_menu_popup_item,
                        type);

        AutoCompleteTextView editTextFilledExposedDropdown =
                v.findViewById(R.id.filled_exposed_dropdown);
        editTextFilledExposedDropdown.setAdapter(adapter);

        return v;
    }
}