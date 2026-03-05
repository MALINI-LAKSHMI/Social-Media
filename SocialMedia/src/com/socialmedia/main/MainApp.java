package com.socialmedia.main;

import java.util.*;
import com.socialmedia.bean.*;
import com.socialmedia.service.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SocialMediaService service = new SocialMediaService();

        User userA = new User("Alice",25,"New York","Engineer");
        User userB = new User("Bob",25,"San Francisco","Designer");

        service.signup(userA);
        service.signup(userB);

        service.sendFriendRequest(userA,userB);

        System.out.println("Bob Notifications:");
        service.viewNotifications(userB);

        service.acceptFriendRequest(userB,userA);

        service.createPost(userA,"Enjoying the sunny day in New York! #blessed");

        System.out.println("\nBob Feed:");
        service.showFeed(userB);

        Post post = userA.getPosts().get(0);

        service.likePost(post);
        service.commentPost(post,"Looks amazing!");

        System.out.println("\nUpdated Feed:");
        service.showFeed(userB);

    }
}