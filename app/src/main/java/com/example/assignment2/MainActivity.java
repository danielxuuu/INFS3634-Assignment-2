package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        recyclerView = findViewById(R.id.rv_main);
        recyclerView.setLayoutManager(layoutManager);
*/


        ArrayList<Burger> burgers = new ArrayList<>();
        burgers.add(new Burger("Big Bac", "Double Beef Patty Burger with smoky BBQ flavour with fresh tomatoes and lettuce, high calories, hunger satisfying",7.0));
        burgers.add(new Burger("Third Pounder", "Beef one third Pound Burger high protein, hunger satisfying",6.5));
        burgers.add(new Burger("Double Third Pounder", "Beef one third Pound Burger with a double patty high protein, hunger satisfying",8.5));
        burgers.add(new Burger("Chicken Deluxe", "Classic Chicken Burger, hunger satisfying",5.5));
        burgers.add(new Burger("Chicken Cheese Deluxe", "Classic Chicken Burger with cheese,  hunger satisfying",6.0));
        burgers.add(new Burger("Fish Smacker", "Fish Burger made with real fish pieces sourced from the Pacific Ocean",6.5));
        burgers.add(new Burger("Bacon Deluxe", "Bacon Burger, lettuce and creamy mayo loaded on a slab of chicken",6.5));
        burgers.add(new Burger("Cheesy Bacon Deluxe", "Bacon Burger with tomato and lettuce loaded with melted cheese with creamy mayo on a chicken slab",7.0));
        burgers.add(new Burger("BBQ Bacon Stacker", "Double Beef patty with eye bacon",5.5));
        burgers.add(new Burger("Cheeseburger", "Beef patty with BBQ sauce and mayonnaise",4.5));
        burgers.add(new Burger("Cheesy Cheeseburger", "Cheese sauce on a Beef patty with BBQ sauce and mayonnaise",5.0));
        burgers.add(new Burger("Double Cheeseburger", "Double Beef patty with BBQ sauce and mayonnaise",5.5));
        burgers.add(new Burger("Triple Cheeseburger", "Triple Beef patty with BBQ sauce and mayonnaise",6.5));
        burgers.add(new Burger("Hash Brown Cheeseburger", "Beef patty with BBQ sauce and mayonnaise finished off with a crunchy hash brown",6.5));
        burgers.add(new Burger("Cheeseburger", "Beef patty with BBQ sauce and mayonnaise",4.5));
        burgers.add(new Burger("Vegan Cheeseburger", "Double vegan patty with vegan BBQ sauce and vegan mayonnaise",8.5));





        RecyclerView recyclerView = findViewById(R.id.rv_main);

        BurgerRvAdapter adapter = new BurgerRvAdapter();
        adapter.setData(burgers);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
