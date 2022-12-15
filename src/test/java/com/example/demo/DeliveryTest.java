package com.example.demo;

import com.example.demo.delivery.PostDeliveryStrategy;
import com.example.demo.flower.Flower;
import com.example.demo.order.Order;
import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.payment.PayPalPaymentStrategy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class DeliveryTest {

    @Test
    void testCreditCardPayment() {
        Order order1 = new Order();
        Flower flower1 = new Flower();
        Order order2 = new Order();
        order2.addItem(flower1);
        order2.setPaymentStrategy(new PayPalPaymentStrategy());
        order2.setDeliveryStrategy(new PostDeliveryStrategy());
        flower1.setPrice(20);
        flower1.setColor("red");
        flower1.setFlowerNumber(15);
        Flower flower2 = new Flower();
        flower2.setPrice(25);
        flower2.setColor("pink");
        flower1.setFlowerNumber(15);
        order1.addItem(flower1);
        order1.addItem(flower2);
        order1.setPaymentStrategy(new CreditCardPaymentStrategy());
        order1.setDeliveryStrategy(new DHLDeliveryStrategy());
        System.out.println(order1.orderDescription());
        Assertions.assertEquals("The order is payed by credit card and delivered by DHL",
                order1.orderDescription());

    }
    @Test
    void testPayPalPayment() {
        Order order1 = new Order();
        Flower flower1 = new Flower();
        flower1.setPrice(20);
        flower1.setColor("red");
        flower1.setFlowerNumber(15);
        Flower flower2 = new Flower();
        flower2.setPrice(25);
        flower2.setColor("pink");
        flower1.setFlowerNumber(15);
        order1.addItem(flower1);
        order1.addItem(flower2);
        order1.setPaymentStrategy(new PayPalPaymentStrategy());
        order1.setDeliveryStrategy(new DHLDeliveryStrategy());
        System.out.println(order1.orderDescription());
        Assertions.assertEquals("The order is payed by PayPal and delivered by DHL",
                order1.orderDescription());

    }
    @Test
    void testDHLDelivery() {
        Order order1 = new Order();
        Flower flower1 = new Flower();
        flower1.setPrice(20);
        flower1.setColor("red");
        flower1.setFlowerNumber(15);
        Flower flower2 = new Flower();
        flower2.setPrice(25);
        flower2.setColor("pink");
        flower1.setFlowerNumber(15);
        order1.addItem(flower1);
        order1.addItem(flower2);
        order1.setPaymentStrategy(new PayPalPaymentStrategy());
        order1.setDeliveryStrategy(new DHLDeliveryStrategy());
        System.out.println(order1.orderDescription());
        Assertions.assertEquals("The order is payed by PayPal and delivered by DHL",
                order1.orderDescription());
    }
    @Test
    void testPostDelivery() {
        Order order1 = new Order();
        Flower flower1 = new Flower();
        flower1.setPrice(20);
        flower1.setColor("red");
        flower1.setFlowerNumber(15);
        Flower flower2 = new Flower();
        flower2.setPrice(25);
        flower2.setColor("pink");
        flower1.setFlowerNumber(15);
        order1.addItem(flower1);
        order1.addItem(flower2);
        order1.setPaymentStrategy(new PayPalPaymentStrategy());
        order1.setDeliveryStrategy(new PostDeliveryStrategy());
        System.out.println(order1.orderDescription());
        Assertions.assertEquals("The order is payed by PayPal and delivered by post",
                order1.orderDescription());
    }
    }


