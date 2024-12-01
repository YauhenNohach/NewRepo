package com.example.application.entity.cities;

import lombok.Data;

import javax.persistence.Embeddable;


@Data
@Embeddable
public class Address {
    private String street;
}
