package com.example.demo.user;

public class Receiver implements User{
    @Override
    public void update(String status) {
        System.out.println(status);
    }
}
