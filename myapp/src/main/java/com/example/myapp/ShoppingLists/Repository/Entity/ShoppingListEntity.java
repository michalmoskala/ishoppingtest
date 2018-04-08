package com.example.myapp.ShoppingLists.Repository.Entity;

import java.util.ArrayList;

public class ShoppingListEntity {

    private final long id;
    private final long groupId;
    private final String name;
    private final boolean isDeleted;
    private final String date;
    private final ArrayList<ProductEntity> products;

    public ShoppingListEntity(long id, long groupId, String name, boolean isDeleted, String date, ArrayList<ProductEntity> products) {
        this.id = id;
        this.groupId = groupId;
        this.name = name;
        this.isDeleted = isDeleted;
        this.date = date;
        this.products = products;
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

    public ArrayList<ProductEntity> getProducts() {
        return products;
    }
}

