package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myfood.adapter.AsiaFoodAdapter;
import com.example.myfood.adapter.PopularFoodAdapter;
import com.example.myfood.model.AsiaFood;
import com.example.myfood.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AsiaFoodAdapter asiaFoodAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PopularFood> popularFoodList = new ArrayList<>();
        popularFoodList.add(new PopularFood("Cake","Rs.500", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chicken Drumstick", "Rs.1000",R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka Stick", "Rs.700",R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Cake","Rs.500", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chicken Drumstick", "Rs.1000",R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka Stick", "Rs.700",R.drawable.popularfood3));

        setPopularRecycler(popularFoodList);

        List<AsiaFood> asiaFoodList = new ArrayList<>();

        asiaFoodList.add(new AsiaFood("Pizza","Rs.1000", R.drawable.asiafood1,"4.5","Family Restaurant"));
        asiaFoodList.add(new AsiaFood("Straberry","Rs.100", R.drawable.asiafood1,"4.5","Strawberry Garden"));
        asiaFoodList.add(new AsiaFood("Pizza","Rs.1000", R.drawable.asiafood1,"4.5","Family Restaurant"));
        asiaFoodList.add(new AsiaFood("Straberry","Rs.100", R.drawable.asiafood1,"4.5","Strawberry Garden"));
        asiaFoodList.add(new AsiaFood("Pizza","Rs.1000", R.drawable.asiafood1,"4.5","Family Restaurant"));
        asiaFoodList.add(new AsiaFood("Straberry","Rs.100", R.drawable.asiafood1,"4.5","Strawberry Garden"));



        setAsiaRecycler(asiaFoodList);
    }

    private void setAsiaRecycler(List<AsiaFood> asiaFoodList) {
    }

    private void setPopularRecycler(List<PopularFood> popularFoodList) {
    }
}