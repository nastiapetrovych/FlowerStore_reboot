package com.example.demo.payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
       return "payed by PayPal";
    }
}
