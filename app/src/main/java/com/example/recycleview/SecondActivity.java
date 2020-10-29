package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FoodListAdapter foodListAdapter;
    ArrayList<Food> foodList;
    private RecyclerView.LayoutManager linearLatoutManager,gridLayoutanager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView = findViewById(R.id.recyclerView);
        foodList = new ArrayList<>();

        foodList.add(new Food(R.drawable.ic_account_balance_wallet_black_24dp,"Fruktoviy tort ", "tort", 500));
        foodList.add(new Food(R.drawable.ic_account_balance_wallet_black_24dp,"Fruktoviy tort ", "tort", 500));
        foodList.add(new Food(R.drawable.ic_account_balance_wallet_black_24dp,"Fruktoviy tort ", "tort", 500));
        foodList.add(new Food(R.drawable.ic_account_balance_wallet_black_24dp,"Fruktoviy tort ", "tort", 500));

        foodListAdapter = new FoodListAdapter(this, foodList);

        linearLatoutManager = new LinearLayoutManager(this);
        gridLayoutanager = new GridLayoutManager(this,3);

        recyclerView.setLayoutManager(linearLatoutManager);

        recyclerView.setAdapter(foodListAdapter);


    }
}
