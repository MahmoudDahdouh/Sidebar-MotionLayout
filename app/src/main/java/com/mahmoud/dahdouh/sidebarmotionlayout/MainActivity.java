package com.mahmoud.dahdouh.sidebarmotionlayout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerAdapter adapter;
    private RecyclerView recyclerView;
    private List<TextItem> list;
    private ViewPager2 viewPager2;
    private List<TopItem> topItemList;
    private TopAdapter topAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.content);
        //rec_two = findViewById(R.id.rec_two);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        // rec_two.setLayoutManager(new LinearLayoutManager(this));

        adapter = new RecyclerAdapter();
        list = new ArrayList<>();

        list.add(new TextItem("Cost", R.drawable.cost));
        list.add(new TextItem("Forest", R.drawable.forest));
        list.add(new TextItem("River", R.drawable.river));
        list.add(new TextItem("Mountain", R.drawable.mountain));


        adapter.setTextItemList(list);
        recyclerView.setAdapter(adapter);
        //rec_two.setAdapter(adapter);
        setTopViewPager();
    }

    private void setTopViewPager() {
        viewPager2 = findViewById(R.id.viewpager_2);
        topItemList = new ArrayList<>();
        topItemList.add(new TopItem(R.drawable.car));
        topItemList.add(new TopItem(R.drawable.girl));
        topItemList.add(new TopItem(R.drawable.man));

        topAdapter = new TopAdapter();
        topAdapter.setTopItemList(topItemList);

        viewPager2.setAdapter(topAdapter);
    }
}


