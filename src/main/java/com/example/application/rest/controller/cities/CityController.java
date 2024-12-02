package com.example.application.rest.controller.cities;

import com.example.application.dto.cities.CityDTO;
import com.example.application.service.cities.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cities")
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;

    @GetMapping("/{id}")
    public CityDTO getCity(@PathVariable Long id){
        return cityService.getAllFields(id);
    }

    @GetMapping()
    public CityDTO getFilterCityAndShop(@RequestParam String name){
        return cityService.getFindCityAndShopsByName(name);
    }

    @GetMapping("/count")
    public int getCountCitiesWithShopsMoreThan10(){
        return cityService.getCountCitiesWithShopsMoreThan10();
    }

    @GetMapping("/count2")
    public int getCountCitiesWithShopsMoreThan10JPQL(){
        return cityService.getCountCitiesWithShopsMoreThan10();
    }
}