package com.cogini.facebook_recyclerview;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    NewsFeedAdapter mNewsFeedAdapter;

    BottomNavigationView mBottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set up RecyclerView
        mRecyclerView = findViewById(R.id.newsFeed_RecyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mNewsFeedAdapter = new NewsFeedAdapter();
        mRecyclerView.setAdapter(mNewsFeedAdapter);

    }
}
