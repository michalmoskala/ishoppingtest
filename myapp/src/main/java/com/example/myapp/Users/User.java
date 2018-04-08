package com.example.myapp.Users;

public class User {

    private final long id;
    private final String content;

    public User() {
        this.id = -1;
        this.content = "";
    }

    public User(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
