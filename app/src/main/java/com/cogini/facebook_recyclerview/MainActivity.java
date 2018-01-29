package com.cogini.facebook_recyclerview;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cogini.facebook_recyclerview.Model.NewsFeedFooter;
import com.cogini.facebook_recyclerview.Model.NewsFeedHeader;
import com.cogini.facebook_recyclerview.Model.NewsFeedPost;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Properties
    ArrayList<Object> mNewsFeedObjects = new ArrayList<>();

    //View
    RecyclerView mRecyclerView;
    NewsFeedAdapter mNewsFeedAdapter;
    BottomNavigationView mBottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewsFeedHeader header = new NewsFeedHeader("Mike");

        String fakeText = getResources().getString(R.string.fake_text);
        NewsFeedPost post1 = new NewsFeedPost("John", fakeText);
        NewsFeedPost post2 = new NewsFeedPost("Anna", fakeText);
        NewsFeedPost post3 = new NewsFeedPost("Logan", fakeText);
        NewsFeedPost post4 = new NewsFeedPost("Bob", fakeText);

        NewsFeedFooter footer = new NewsFeedFooter();

        mNewsFeedObjects.add(header);
        mNewsFeedObjects.add(post1);
        mNewsFeedObjects.add(post2);
        mNewsFeedObjects.add(post3);
        mNewsFeedObjects.add(post4);
        mNewsFeedObjects.add(footer);





        //Set up RecyclerView
        mRecyclerView = findViewById(R.id.newsFeed_RecyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mNewsFeedAdapter = new NewsFeedAdapter(mNewsFeedObjects);
        mRecyclerView.setAdapter(mNewsFeedAdapter);

    }
}
