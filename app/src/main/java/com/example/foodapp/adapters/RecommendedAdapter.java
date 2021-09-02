package com.example.foodapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.model.Recommended;

import java.util.ArrayList;

public class RecommendedAdapter extends RecyclerView.Adapter<RecommendedAdapter.RecommendedViewHolder> {

    private ArrayList<Recommended> rList;
    public RecommendedAdapter(ArrayList<Recommended> list) {
        rList = list;
    }
    @NonNull
    @Override
    public RecommendedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_three, parent, false);
        RecommendedViewHolder vh = new RecommendedViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendedViewHolder holder, int position) {
        Recommended item = rList.get(position);

        holder.imageView.setImageResource(item.getImageResource());
        holder.txtName.setText(item.getName());
        holder.txtPrice.setText(item.getPrice());
    }

    @Override
    public int getItemCount() {
        return rList.size();
    }

    public class RecommendedViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView txtName, txtPrice;

        public RecommendedViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imgProduct);
            txtName = itemView.findViewById(R.id.tProductName);
            txtPrice = itemView.findViewById(R.id.tPrice);

        }
    }
}
