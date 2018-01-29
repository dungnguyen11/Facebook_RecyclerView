package com.cogini.facebook_recyclerview.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

/**
 * Created by DungNguyen on 1/29/18.
 */

public class NewsFeedPost {
    private String id;
    private String ownerName;
    private String date;
    private String time;
    private String content;
    private int numberOfLikes;
    private int numberOfCommnets;

    public NewsFeedPost() {
    }

    public NewsFeedPost(String ownerName, String content) {
        this.id = UUID.randomUUID().toString();
        this.ownerName = ownerName;
        this.content = content;
        this.date = getCurrentDate();
        this.time = getCurrentTime();
        this.numberOfLikes = 0;
        this.numberOfCommnets = 0;
    }

    //Functions
    public String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = dateFormat.format(Calendar.getInstance().getTime());
        return date;
    }

    public String getCurrentTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String time = dateFormat.format(Calendar.getInstance().getTime());
        return time;
    }

    // GETTER and SETTER
    public String getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public int getNumberOfCommnets() {
        return numberOfCommnets;
    }

    public void setNumberOfCommnets(int numberOfCommnets) {
        this.numberOfCommnets = numberOfCommnets;
    }
}
