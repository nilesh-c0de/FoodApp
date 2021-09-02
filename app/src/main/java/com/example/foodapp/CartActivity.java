package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodapp.adapters.CartAdapter;
import com.example.foodapp.adapters.DishAdapter;
import com.example.foodapp.model.CartItem;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        ArrayList<CartItem> list = new ArrayList<>();

        list.add(new CartItem(R.drawable.popular1, "Veg Food", 2, 40));
        list.add(new CartItem(R.drawable.dosa, "Dosa", 1, 30));
        list.add(new CartItem(R.drawable.idli, "Idali", 1, 30));
        list.add(new CartItem(R.drawable.s, "Paneer", 1, 50));
        recyclerView = findViewById(R.id.recyclerViewCart);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new CartAdapter(list));
    }
}