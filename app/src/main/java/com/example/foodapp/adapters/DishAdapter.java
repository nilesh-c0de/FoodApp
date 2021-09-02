package com.example.foodapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.model.Dish;

import java.util.ArrayList;

public class DishAdapter extends RecyclerView.Adapter<DishAdapter.DishViewHolder> {
    private ArrayList<Dish> mList;

    public DishAdapter(ArrayList<Dish> list) {
        mList = list;
    }
    @NonNull
    @Override
    public DishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one, parent, false);
        DishViewHolder vh = new DishViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull DishViewHolder holder, int position) {
        Dish item = mList.get(position);

        holder.imageView.setImageResource(item.getImgResource());
        holder.textView.setText(item.getDishName());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class DishViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public DishViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageDish);
            textView = itemView.findViewById(R.id.textDishName);
        }
    }
}
