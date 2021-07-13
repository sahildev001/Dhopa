package com.example.dhopa.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dhopa.Model.ModelRecycle;
import com.example.dhopa.R;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    ArrayList <ModelRecycle> modelRecycles;
    public RecycleAdapter(ArrayList<ModelRecycle> modelReycleList) {
        this.modelRecycles=modelReycleList;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_adapter,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull RecycleAdapter.ViewHolder holder, int position) {
            ModelRecycle modelRec = modelRecycles.get(position);
            holder.title.setText(modelRec.getTitle());
            holder.description.setText(modelRec.getDescreption());
            holder.rating.setText(modelRec.getRating());
            holder.imageView.setImageResource(modelRec.getImage());
    }

    @Override
    public int getItemCount() {
        return modelRecycles.size();
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
