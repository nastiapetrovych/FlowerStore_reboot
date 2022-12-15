package com.example.demo.item;

public class BasketDecorator extends ItemDecorator{
    Item item;
    double getPrice() {
        return 4 + item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "put into the basket";
    }

    @Override
    double price() {
        return getPrice();
    }
}
