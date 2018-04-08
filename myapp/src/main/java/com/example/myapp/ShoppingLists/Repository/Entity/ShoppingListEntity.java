package com.example.myapp.ShoppingLists.Repository.Entity;

public class ShoppingListEntity {

    private final long id;
    private final long groupId;
    private final String name;
    private final boolean isDeleted;
    private final String date;

    public ShoppingListEntity(long id, long groupId, String name, boolean isDeleted, String date) {
        this.id = id;
        this.groupId = groupId;
        this.name = name;
        this.isDeleted = isDeleted;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public long getGroupId() {
        return groupId;
    }

    public String getName() {
        return name;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public String getDate() {
        return date;
    }
}

