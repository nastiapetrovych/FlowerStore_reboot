package com.example.demo.delivery;


import com.example.demo.flower.Flower;

import java.util.LinkedList;

public class DHLDeliveryStrategy implements Delivery {
    public String delivery(LinkedList<Flower> items) {
        for (int i = 0; i < items.size(); i++) {
            items.remove(items.get(i));
        }
       return "delivered by DHL";
    }}
