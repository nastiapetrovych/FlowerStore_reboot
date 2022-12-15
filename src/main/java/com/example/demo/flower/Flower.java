package com.example.demo.flower;
import lombok.Setter;
import lombok.Getter;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table
public class Flower {
    @Id
    @SequenceGenerator(
            name = "flower_sequence",
            sequenceName = "flower_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "flower_sequence"
    )
    @Setter @Getter
    private long id;
    @Setter @Getter
    private int flowerNumber;
    @Setter @Getter
    private String Color;
    @Setter @Getter
    private int price;

    public int getPrice() {
        return this.price;
    }

}

