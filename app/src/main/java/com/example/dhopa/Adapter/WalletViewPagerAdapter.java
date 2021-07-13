package com.example.dhopa.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dhopa.Model.vpCardModel;
import com.example.dhopa.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class WalletViewPagerAdapter extends RecyclerView.Adapter<WalletViewPagerAdapter.ViewHolder> {

ArrayList<vpCardModel> arrayList;
    public WalletViewPagerAdapter(ArrayList<vpCardModel> arrayList) {
        this.arrayList= arrayList;
    }

    @NonNull
    @NotNull
    @Override
    public WalletViewPagerAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_my_wallet_card_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull WalletViewPagerAdapter.ViewHolder holder, int position) {

        vpCardModel model = arrayList.get(position);
        holder.cardNumber.setText(model.getCard_number());
        holder.Name.setText(model.getName());
        holder.Date.setText(model.getDate());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView cardNumber,Name,Date;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            cardNumber = itemView.findViewById(R.id.tvCardNUmber);
            Name= itemView.findViewById(R.id.WalletNameNavjotSingh);
            Date = itemView.findViewById(R.id.tvDate);

        }
    }
}
