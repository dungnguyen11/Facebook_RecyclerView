package com.cogini.facebook_recyclerview.Model;

/**
 * Created by DungNguyen on 1/29/18.
 */

public class NewsFeedHeader {
    private String ownerName;

    public NewsFeedHeader() {
    }

    public NewsFeedHeader(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
