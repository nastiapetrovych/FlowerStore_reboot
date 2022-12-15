package com.example.demo;
import com.example.demo.flower.Flower;
import com.example.demo.item.FlowerBucket;
import com.example.demo.item.Item;
import com.example.demo.item.PaperDecorator;
import com.example.demo.item.RibbonDecorator;
import com.example.demo.payment.PayPalPaymentStrategy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class ItemTest {
    @Test
    void  testPaperRibbon(){
        Flower flower1 = new Flower();
        Item item = new FlowerBucket();
        item.setDescription("Tulip");
        FlowerBucket.addFlowers(flower1);
        item = new RibbonDecorator(item);
        item = new PaperDecorator(item);
        System.out.println(item.getDescription());
       Assertions.assertEquals("The ribbon is added to Tulip and  packed in  paper",
               item.getDescription());
    }
    @Test
    void  testPaper(){
        Flower flower2 = new Flower();
        Item item = new FlowerBucket();
        item.setDescription("Rose");
        FlowerBucket.addFlowers(flower2);
        item = new RibbonDecorator(item);
        Assertions.assertEquals("The ribbon is added to Rose",
                item.getDescription());

    }
}
