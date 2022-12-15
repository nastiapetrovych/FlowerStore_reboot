package com.example.demo.item;

public class RibbonDecorator extends ItemDecorator{
    Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }

    double getPrice() {
        return 40 + item.price();
    }

    @Override
    public String getDescription() {
        return "The ribbon is added" + " to " + item.description;
    }

    @Override
    double price() {
        return getPrice();
    }
}
