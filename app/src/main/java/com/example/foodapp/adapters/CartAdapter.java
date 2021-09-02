package com.example.foodapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.model.CartItem;
import com.example.foodapp.model.Dish;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    private ArrayList<CartItem> mList;

    public CartAdapter(ArrayList<CartItem> list) {
        mList = list;
    }
    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item, parent, false);
        CartViewHolder vh = new CartViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        CartItem item = mList.get(position);

        holder.imageView.setImageResource(item.getCart_number());
        holder.textView.setText(item.getCart_name());
        String txt1 = String.valueOf(item.getCart_total());
        String txt2 = String.valueOf(item.getCart_cout());
        holder.textView2.setText(txt1);
        holder.textView3.setText(txt2);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class CartViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView, textView2, textView3;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imgCart);
            textView = itemView.findViewById(R.id.txtCart);
            textView2 = itemView.findViewById(R.id.txtCartPrice);
            textView3 = itemView.findViewById(R.id.txtCartCount);
        }
    }
}
