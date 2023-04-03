package com.tohu.tohucommand.Models.User;

public class User {
    public boolean authenticated;
    public String role;
    public String userName;

    public User(boolean authenticated, String role, String userName) {
        this.authenticated = authenticated;
        this.role = role;
        this.userName = userName;
    }
}
