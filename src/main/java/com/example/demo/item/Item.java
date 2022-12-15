package com.example.demo.item;

public  abstract class Item {
    String description;

    public  String getDescription() {
        return description;

    }
    public  void setDescription(String name) {
        this.description = name;

    }
    abstract double price();
}
