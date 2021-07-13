package com.example.dhopa.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dhopa.Model.ModelNotification;
import com.example.dhopa.Model.ModelRecycle;
import com.example.dhopa.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class RecycleNotification extends RecyclerView.Adapter<RecycleNotification.ViewHolder> {
    ArrayList<ModelNotification> modelNotification;
    public RecycleNotification(ArrayList<ModelNotification> modelReycleList) {
        this.modelNotification=modelReycleList;
    }
    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_notification,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecycleNotification.ViewHolder holder, int position) {
        ModelNotification modelRecycle = modelNotification.get(position);
        holder.order.setText(modelRecycle.getOrder());
        holder.summary.setText(modelRecycle.getSummary());
        holder.time.setText(modelRecycle.getTime());
        holder.image.setImageResource(modelRecycle.getImage());

    }

    @Override
    public int getItemCount() {
        return modelNotification.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView order, summary, time;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            image= itemView.findViewById(R.id.orderImage);
            order= itemView.findViewById(R.id.order);
            summary= itemView.findViewById(R.id.summary);
            time= itemView.findViewById(R.id.time);
        }
    }
}
