package com.example.application.dto.cities;

import lombok.Data;

import java.util.List;

@Data
public class CityDTO {
    private Long id;
    private String name;
    private List<AttractionDTO> attractions;
    private List<ShopDTO> shops;
    private RegionDTO region;
    private MariaDTO maria;
}
