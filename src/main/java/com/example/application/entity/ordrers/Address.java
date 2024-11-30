package com.example.application.entity.ordrers;


import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Address {

    private String street;
    private String city;
    private String state;
    private String postalCode;
}
