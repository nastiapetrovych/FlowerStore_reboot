package com.example.demo.delivery;

import com.example.demo.flower.Flower;

import java.util.LinkedList;
import java.util.List;

public interface Delivery {
    public String delivery(LinkedList<Flower> items);
}
