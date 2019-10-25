package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class BurgerActivity extends AppCompatActivity {

    private TextView tv_name;
    private TextView tv_price;
    private TextView tv_desc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);
        Intent intent = getIntent();

        tv_name = findViewById(R.id.tv_name);
        tv_price = findViewById(R.id.tv_price);
        tv_desc = findViewById(R.id.tv_desc);

 /*       tv_name.setText(getName());
        tv_price.setText(getPrice());
        tv_desc.setText(getDescription());
        */


    }
}
