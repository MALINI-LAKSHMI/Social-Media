package com.socialmedia.bean;

import java.util.*;

public class User {

    private String name;
    private int age;
    private String location;
    private String occupation;

    private List<User> friends = new ArrayList<>();
    private List<Post> posts = new ArrayList<>();
    private List<String> notifications = new ArrayList<>();
    private List<User> friendRequests = new ArrayList<>();

    public User(String name, int age, String location, String occupation) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getOccupation() {
        return occupation;
    }

    public List<User> getFriends() {
        return friends;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<String> getNotifications() {
        return notifications;
    }

    public List<User> getFriendRequests() {
        return friendRequests;
    }
}