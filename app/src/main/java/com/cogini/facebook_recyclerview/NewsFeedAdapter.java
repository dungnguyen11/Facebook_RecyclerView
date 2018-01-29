package com.cogini.facebook_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView.ViewHolder;

import com.cogini.facebook_recyclerview.Model.NewsFeedHeader;

import java.util.ArrayList;

/**
 * Created by DungNguyen on 1/29/18.
 */

public class NewsFeedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    //Static types
    public static final int HEADER_TYPE = 0;
    public static final int POST_TYPE = 1;
    public static final int FOOTER_TYPE = 2;


    //Properties
    ArrayList<Object> mNewsFeedObjects = new ArrayList<>();

    //Header ViewHolder
    public static class NewsFeedHeaderHolder extends ViewHolder {
        private NewsFeedHeader mHeader;

        public NewsFeedHeaderHolder(View itemView) {
            super(itemView);
        }
    }

    //Post ViewHolder
    public static class NewsFeedHolder extends ViewHolder {
        public NewsFeedHolder(View itemView) {
            super(itemView);
        }
    }

    //Footer ViewHolder
    public static class NewsFeedFooterHolder extends ViewHolder {
        public NewsFeedFooterHolder(View itemView) {
            super(itemView);
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ViewHolder viewHolder = null;

        switch (viewType) {
            case HEADER_TYPE:
                View headerView = new View(null);
                viewHolder = new NewsFeedHeaderHolder(headerView);
                break;

            case POST_TYPE:
                View postView = new View(null);
                viewHolder = new NewsFeedHolder(postView);
                break;

            case FOOTER_TYPE:
                View footerView = new View(null);
                viewHolder = new NewsFeedFooterHolder(footerView);
                break;
        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mNewsFeedObjects.size();
    }
}
