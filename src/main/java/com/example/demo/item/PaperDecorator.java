package com.example.demo.item;

public class PaperDecorator extends ItemDecorator{
    Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    double getPrice() {
        return 13 + item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " and  packed in  paper";
    }

    @Override
    double price() {
        return getPrice();
    }

}
