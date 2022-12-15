package com.example.demo.user;

public class Sender implements User{
    @Override
    public void update(String status) {
        System.out.println(status);
    }
}
