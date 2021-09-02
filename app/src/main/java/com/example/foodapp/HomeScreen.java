package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.example.foodapp.adapters.DishAdapter;
import com.example.foodapp.adapters.ProductAdapter;
import com.example.foodapp.adapters.RecommendedAdapter;
import com.example.foodapp.model.Dish;
import com.example.foodapp.model.Product;
import com.example.foodapp.model.Recommended;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {

    RecyclerView rc, rc2, rc3;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<Dish> dList = new ArrayList<>();
        ArrayList<Product> pList = new ArrayList<>();
        ArrayList<Recommended> rList = new ArrayList<>();

        rList.add(new Recommended(R.drawable.recommended1, "Tamil plate", "40"));
        rList.add(new Recommended(R.drawable.recommended1, "Dosa", "30"));
        rList.add(new Recommended(R.drawable.recommended1, "Misal", "20"));
        rList.add(new Recommended(R.drawable.recommended1, "Idali", "20"));
        rList.add(new Recommended(R.drawable.recommended1, "Non Veg", "60"));
        rList.add(new Recommended(R.drawable.d, "Non Veg", "60"));

        pList.add(new Product(R.drawable.popular1, "20", "Veg Thali"));
        pList.add(new Product(R.drawable.popularfood2, "25", "Veg Thali"));
        pList.add(new Product(R.drawable.recommended1, "30", "Veg Thali"));
        pList.add(new Product(R.drawable.popularfood2, "10", "Veg Thali"));
        pList.add(new Product(R.drawable.popularfood3, "50", "Veg Thali"));
        pList.add(new Product(R.drawable.popular1, "60", "Veg Thali"));

        dList.add(new Dish("samosa", R.drawable.d));
        dList.add(new Dish("dosa", R.drawable.dosa));
        dList.add(new Dish("plate", R.drawable.plate));
        dList.add(new Dish("idali", R.drawable.idli));

        rc = findViewById(R.id.recyclerView1);
        rc.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rc.setAdapter(new DishAdapter(dList));

        rc2 = findViewById(R.id.recyclerView2);
        rc2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rc2.setAdapter(new ProductAdapter(pList));

        rc3 = findViewById(R.id.recyclerView3);
        rc3.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rc3.setAdapter(new RecommendedAdapter(rList));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }
}