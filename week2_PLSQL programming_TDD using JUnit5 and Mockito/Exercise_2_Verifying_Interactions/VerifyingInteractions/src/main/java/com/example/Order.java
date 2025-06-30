package com.example;

public class Order {
    private String id;
    private String item;

    public Order(String id, String item) {
        this.id = id;
        this.item = item;
    }

    public String getId() { return id; }
    public String getItem() { return item; }
}
