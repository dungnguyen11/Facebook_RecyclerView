package com.cogini.facebook_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cogini.facebook_recyclerview.Model.NewsFeedFooter;
import com.cogini.facebook_recyclerview.Model.NewsFeedHeader;
import com.cogini.facebook_recyclerview.Model.NewsFeedPost;

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


    public NewsFeedAdapter(ArrayList<Object> objects) {
        mNewsFeedObjects = objects;
    }

    //Header ViewHolder
    public static class NewsFeedHeaderHolder extends ViewHolder {
        public NewsFeedHeaderHolder(View itemView) {
            super(itemView);
        }
    }

    //Post ViewHolder
    public static class NewsFeedPostHolder extends ViewHolder {
        //Properties
        private NewsFeedPost mPost;

        //View
        private TextView mOwnerName;
        private TextView mDate;
        private TextView mContent;
        private ImageView mPhoto;
        private TextView mLike;
        private TextView mComment;
        private TextView mShare;

        public NewsFeedPostHolder(View itemView) {
            super(itemView);
            mOwnerName = itemView.findViewById(R.id.ownerName_post_textView4);
            mDate = itemView.findViewById(R.id.date_post_textView);
            mContent = itemView.findViewById(R.id.content_post_textView);
            mPhoto = itemView.findViewById(R.id.owner_photo_post_imageView);
            mLike = itemView.findViewById(R.id.like_post_textView);
            mComment = itemView.findViewById(R.id.comment_post_textView);
            mShare = itemView.findViewById(R.id.share_post_textView);
        }

        public void bind(NewsFeedPost post) {
            mPost = post;
            mOwnerName.setText(mPost.getOwnerName());
            mDate.setText(mPost.getDate());
            mContent.setText(mPost.getContent());


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
                View headerView = LayoutInflater
                        .from(parent.getContext())
                        .inflate(R.layout.news_feed_header, parent, false);

                viewHolder = new NewsFeedHeaderHolder(headerView);
                break;

            case POST_TYPE:
                View postView = LayoutInflater
                        .from(parent.getContext())
                        .inflate(R.layout.news_feed_post, parent, false);
                viewHolder = new NewsFeedPostHolder(postView);
                break;

            case FOOTER_TYPE:
                View footerView = LayoutInflater
                        .from(parent.getContext())
                        .inflate(R.layout.news_feed_footer, parent, false);
                viewHolder = new NewsFeedFooterHolder(footerView);
                break;
        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final int itemType = getItemViewType(position);

        switch (itemType) {
            case HEADER_TYPE:
                break;

            case POST_TYPE:
                NewsFeedPost post = (NewsFeedPost) mNewsFeedObjects.get(position);
                ((NewsFeedPostHolder) holder).bind(post);
                break;

            case FOOTER_TYPE:
                break;
        }

    }

    @Override
    public int getItemViewType(int position) {
        Object item = mNewsFeedObjects.get(position);

        if (item instanceof NewsFeedHeader) {
            return HEADER_TYPE;
        } else if (item instanceof NewsFeedPost) {
            return POST_TYPE;
        } else if (item instanceof NewsFeedFooter) {
            return FOOTER_TYPE;
        } else {
            //return -1 to indicate that there are no fit type
            return -1;
        }

    }

    @Override
    public int getItemCount() {
        return mNewsFeedObjects.size();
    }
}
