package com.socialmedia.bean;

import java.util.*;

public class Post {

    private String content;
    private User author;

    private int likeCount = 0;
    private List<String> comments = new ArrayList<>();

    public Post(String content, User author) {
        this.content = content;
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void likePost() {
        likeCount++;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public List<String> getComments() {
        return comments;
    }
}