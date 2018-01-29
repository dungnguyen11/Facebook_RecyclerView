package com.cogini.facebook_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView.ViewHolder;
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

    //Header ViewHolder
    public static class NewsFeedHeaderHolder extends ViewHolder {
        private NewsFeedHeader mHeader;
        private TextView mOwnerName;
        private TextView mContent;

        public NewsFeedHeaderHolder(View itemView) {
            super(itemView);
            mOwnerName = itemView.findViewById(R.id.ownerName_header_textView);
            mContent = itemView.findViewById(R.id.content_header_textView);
        }

        public void bind(NewsFeedHeader header) {

        }
    }

    //Post ViewHolder
    public static class NewsFeedPostHolder extends ViewHolder {
        private NewsFeedPost mPost;

        public NewsFeedPostHolder(View itemView) {
            super(itemView);
        }

        public void bind(NewsFeedPost post) {

        }
    }

    //Footer ViewHolder
    public static class NewsFeedFooterHolder extends ViewHolder {
        private NewsFeedFooter mFooter;

        public NewsFeedFooterHolder(View itemView) {
            super(itemView);
        }

        public void bind(NewsFeedFooter footer) {

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
                viewHolder = new NewsFeedPostHolder(postView);
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
        final int itemType = getItemViewType(position);

        switch (itemType) {
            case HEADER_TYPE:
                NewsFeedHeader header = new NewsFeedHeader();
                ((NewsFeedHeaderHolder) holder).bind(header);
                break;

            case POST_TYPE:
                NewsFeedPost post = new NewsFeedPost();
                ((NewsFeedPostHolder) holder).bind(post);
                break;

            case FOOTER_TYPE:
                NewsFeedFooter footer = new NewsFeedFooter();
                ((NewsFeedFooterHolder) holder).bind(footer);
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
