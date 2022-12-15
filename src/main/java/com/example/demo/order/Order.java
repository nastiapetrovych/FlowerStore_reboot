package com.example.demo.order;


import com.example.demo.delivery.Delivery;
import com.example.demo.flower.Flower;
import com.example.demo.payment.Payment;
import com.example.demo.user.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {
    LinkedList<Flower> items = new LinkedList<Flower>();
    Payment payment;
    Delivery delivery;
    int price = 0;
    List<User> users = new ArrayList<>();


    public  void addItem(Flower Item) {
        items.add(Item);
    }
    public  void removeItem(Flower item) {
        items.remove(item);
    }

    public  void setPaymentStrategy(Payment type){
        this.payment = type;
    }

    public void setDeliveryStrategy(Delivery type){
        this.delivery = type;
    }
    public int calculateTotalPrice(){
        for (int i = 0; i < items.size(); i++){
            Flower item = items.get(i);
            price += item.getPrice();
        }
        return price;
    }

    public String orderDescription(){
        return "The order is " + payment.pay(price) + " and " + delivery.delivery(items);
    }
    public void processOrder(){
        System.out.println("I am processing");
        calculateTotalPrice();
        payment.pay(price);
        delivery.delivery(this.items);
        System.out.println("Thanks for your purchase");
        }
    public void order(){
        notifyUsers();
    }
    public void addUser(User user){
        users.add(user);
    }
    public void removeUser(User user){
        users.remove(user);
    }
    public void notifyUsers(){
        for (User user: users){
            user.update("Order is completed");
        }
    }
}
