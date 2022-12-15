package com.example.demo.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
@Getter
@Setter
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(unique = true)
    private String email;
    @Getter @Setter
    private LocalDate dob;
    @Setter @Getter @Transient
    private Integer age;

    public Integer getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
