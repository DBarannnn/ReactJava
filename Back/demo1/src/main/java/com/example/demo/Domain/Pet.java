package com.example.demo.Domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;


@Data
@Entity
@Table(name = "pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private LocalDate birthDate;

    @Column
    private String image;

    @Column
    private String description;

    @Transient
    private int years;

    @Transient
    private int months;

    @PostPersist
    @PostLoad
    @PostUpdate
    private void calculateAge(){
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        this.years = period.getYears();
        if (period.getYears() == 0 && period.getMonths() == 0){
            this.months = 1;
        }
        else {
            this.months = period.getMonths();
        }
    }



}
