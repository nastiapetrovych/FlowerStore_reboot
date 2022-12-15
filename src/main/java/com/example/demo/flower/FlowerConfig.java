package com.example.demo.flower;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class FlowerConfig {
    @Bean
    CommandLineRunner commandLineRunner(FlowerRepository repository) {
        return args -> {
            Flower flower1 = new Flower();
            flower1.setId(1);
            flower1.setFlowerNumber(15);
            flower1.setColor("pink");
            flower1.setPrice(10);
            Flower flower2 = new Flower();
            flower2.setId(2);
            flower2.setFlowerNumber(10);
            flower2.setColor("red");
            flower2.setPrice(15);
            repository.saveAll(List.of(flower1, flower2));
        };
    }
}
