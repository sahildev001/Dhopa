package com.example.dhopa.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.dhopa.Adapter.AdapterWalletDetails;
import com.example.dhopa.Adapter.WalletViewPagerAdapter;
import com.example.dhopa.BottomNavActivity;
import com.example.dhopa.Model.modelWalletrvDetails;
import com.example.dhopa.Model.vpCardModel;
import com.example.dhopa.R;

import java.util.ArrayList;

public class MyWalletFragment extends Fragment {
Toolbar mActionBar;
ViewPager2 cardVp;
RecyclerView rvDeatils;
ArrayList<vpCardModel> arrayList = new ArrayList<>();
ArrayList<modelWalletrvDetails> arrayListDetails = new ArrayList<>();

    public MyWalletFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_my_wallet, container, false);
listData();
        cardVp = view.findViewById(R.id.vpMyWalletCard);

        cardVp.setAdapter(new WalletViewPagerAdapter(arrayList));

        rvDeatils = view.findViewById(R.id.rvwalletDetails);


        mActionBar = view.findViewById(R.id.toolbarMyWallet);
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

        listDataDetails();

        AdapterWalletDetails adapterWalletDetails = new AdapterWalletDetails(arrayListDetails);
        rvDeatils.setAdapter(adapterWalletDetails);


        return view;
    }

   public void listData(){
       vpCardModel  model = new vpCardModel("0000 0000 0000 0000","Navjot Singh","05/20");
       arrayList.add(model);

       model = new vpCardModel("0000 0000 0000 0000","Navjot Singh","05/20");
       arrayList.add(model);

       model = new vpCardModel("0000 0000 0000 0000","Navjot Singh","05/20");
       arrayList.add(model);

    }
    public void listDataDetails(){
        modelWalletrvDetails model = new modelWalletrvDetails("Bagicha Singh", "-$220.0","2 min ago",R.drawable.person);
        arrayListDetails.add(model);
        model = new modelWalletrvDetails("Bagicha Singh", "-$220.0","2 min ago",R.drawable.person);
        arrayListDetails.add(model);
        model = new modelWalletrvDetails("Bagicha Singh", "-$220.0","2 min ago",R.drawable.person);
        arrayListDetails.add(model);
        model = new modelWalletrvDetails("Bagicha Singh", "-$220.0","2 min ago",R.drawable.person);
        arrayListDetails.add(model);
        model = new modelWalletrvDetails("Bagicha Singh", "-$220.0","2 min ago",R.drawable.person);
        arrayListDetails.add(model);
        model = new modelWalletrvDetails("Bagicha Singh", "-$220.0","2 min ago",R.drawable.person);
        arrayListDetails.add(model);
    }
}