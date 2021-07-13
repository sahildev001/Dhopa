package com.example.dhopa.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dhopa.Model.ModelRecycle;
import com.example.dhopa.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class RecycleOfferAdapter extends RecyclerView.Adapter<RecycleOfferAdapter.ViewHolder> {
    ArrayList<ModelRecycle> modelRecycleList;
    public RecycleOfferAdapter(ArrayList<ModelRecycle> modelReycleList) {
        this.modelRecycleList=modelReycleList;
    }

    @NonNull
    @NotNull
    @Override
    public RecycleOfferAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.offers_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecycleOfferAdapter.ViewHolder holder, int position) {
        ModelRecycle modelRec = modelRecycleList.get(position);
        holder.title.setText(modelRec.getTitle());
        holder.description.setText(modelRec.getDescreption());
        holder.rating.setText(modelRec.getRating());
        holder.imageView.setImageResource(modelRec.getImage());

    }

    @Override
    public int getItemCount() {
        return modelRecycleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title, description, rating;
        public ViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            title= itemView.findViewById(R.id.txt);
            description= itemView.findViewById(R.id.desc);
            rating= itemView.findViewById(R.id.rating);
        }
    }
}
