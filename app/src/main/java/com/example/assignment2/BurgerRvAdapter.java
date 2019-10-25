package com.example.assignment2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BurgerRvAdapter extends RecyclerView.Adapter<BurgerRvAdapter.BurgerViewHolder>{

    private ArrayList<Burger> data;
    public void setData(ArrayList<Burger> data){
        this.data = data;
    }

    public class BurgerViewHolder extends RecyclerView.ViewHolder{
        public TextView nameText;
        public TextView priceText;
        public View view;
        public TextView descriptionText;

        public BurgerViewHolder(@NonNull View itemView){
            super(itemView);
            view = itemView;
            nameText = itemView.findViewById(R.id.tv_name);
            priceText = itemView.findViewById(R.id.tv_price);
            descriptionText = itemView.findViewById(R.id.tv_desc);
        }
    }

    @NonNull
    @Override
    public BurgerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.burger_item,parent,false);

        BurgerViewHolder burgerViewHolder = new BurgerViewHolder(view);
        return burgerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BurgerViewHolder holder, int position) {
        final Burger burger = data.get(position);
        holder.nameText.setText(burger.getName());
        holder.descriptionText.setText(burger.getDescription());
        holder.priceText.setText(Double.toString(burger.getPrice()));

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, BurgerActivity.class);
                intent.putExtra("Burger Name", burger.getName());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
