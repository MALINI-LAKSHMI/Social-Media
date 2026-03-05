package com.socialmedia.service;

import java.util.*;
import com.socialmedia.bean.*;

public class SocialMediaService {

    private List<User> users = new ArrayList<>();

    public void signup(User user) {
        users.add(user);
    }

    public void sendFriendRequest(User from, User to) {
        to.getFriendRequests().add(from);
        to.getNotifications().add(from.getName() + " sent you a friend request");
    }

    public void acceptFriendRequest(User user, User requester) {

        user.getFriends().add(requester);
        requester.getFriends().add(user);

        user.getFriendRequests().remove(requester);

        requester.getNotifications().add(user.getName() + " accepted your friend request");
    }

    public void createPost(User user, String content) {

        Post post = new Post(content, user);
        user.getPosts().add(post);

        for(User friend : user.getFriends()) {
            friend.getNotifications().add(user.getName() + " created a new post");
        }
    }

    public void likePost(Post post) {
        post.likePost();
    }

    public void commentPost(Post post, String comment) {
        post.addComment(comment);
    }

    public void showFeed(User user) {

        for(User friend : user.getFriends()) {

            for(Post post : friend.getPosts()) {

                System.out.println("Author: " + post.getAuthor().getName());
                System.out.println("Post: " + post.getContent());
                System.out.println("Likes: " + post.getLikeCount());

                System.out.println("Comments:");
                for(String c : post.getComments()) {
                    System.out.println(c);
                }

                System.out.println("------------------");
            }
        }
    }

    public void viewNotifications(User user) {

        for(String n : user.getNotifications()) {
            System.out.println(n);
        }

        user.getNotifications().clear();
    }
}