package com.cogini.facebook_recyclerview.Model;

/**
 * Created by DungNguyen on 1/29/18.
 */

public class NewsFeedHeader {
    private String ownerName;
    private String content;

    public NewsFeedHeader() {
    }

    public NewsFeedHeader(String ownerName, String content) {
        this.ownerName = ownerName;
        this.content = content;
    }
}
