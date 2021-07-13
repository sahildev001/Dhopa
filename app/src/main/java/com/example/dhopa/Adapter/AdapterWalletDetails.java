package com.example.dhopa.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dhopa.Model.modelWalletrvDetails;
import com.example.dhopa.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class AdapterWalletDetails extends RecyclerView.Adapter<AdapterWalletDetails.ViewHolder> {
    ArrayList<modelWalletrvDetails> arrayListDetails;
    public AdapterWalletDetails(ArrayList<modelWalletrvDetails> arrayListDetails) {

        this.arrayListDetails= arrayListDetails;
    }

    @NonNull
    @NotNull
    @Override
    public AdapterWalletDetails.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_wallet_detail,parent,false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdapterWalletDetails.ViewHolder holder, int position) {
        modelWalletrvDetails modelWalletrvDetails = arrayListDetails.get(position);
        holder.profilePic.setImageResource(modelWalletrvDetails.getProfile_pic());
        holder.name.setText(modelWalletrvDetails.getName());
        holder.time.setText(modelWalletrvDetails.getTime());
        holder.amount.setText(modelWalletrvDetails.getTime());

    }

    @Override
    public int getItemCount() {
        return arrayListDetails.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,time,amount;
        ImageView profilePic;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameWalletDetails);
            time = itemView.findViewById(R.id.timeWalletDetails);
            amount = itemView.findViewById(R.id.amountWalletDetails);
            profilePic = itemView.findViewById(R.id.profileWalletDetails);


        }
    }
}
