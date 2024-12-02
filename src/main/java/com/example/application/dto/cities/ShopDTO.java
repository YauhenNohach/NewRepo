package com.example.application.dto.cities;

import lombok.Data;

import java.util.List;

@Data
public class ShopDTO {
    private Long id;
    private String name;
    private List<CityDTO> cities;
}
