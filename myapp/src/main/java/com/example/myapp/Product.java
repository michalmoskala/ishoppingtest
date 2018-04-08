package com.example.myapp;

public class Product {
    private final long id;
    private final String twojastara;


    public Product(long id, String twojastara) {
        this.id = id;
        this.twojastara = twojastara;
    }

    public long getId() {
        return id;
    }

    public String getTwojastara() {
        return twojastara;
    }
}
