package com.example.application.service.cities;

import com.example.application.database.repository.cities.CItyRepository;
import com.example.application.database.repository.orders.OrderRepository;
import com.example.application.database.repository.shop.ShopRepository;
import com.example.application.dto.cities.CityDTO;

import com.example.application.dto.cities.ShopDTO;
import com.example.application.entity.cities.City;
import com.example.application.mapper.cities.CityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class CityService {
    private final CItyRepository cItyRepository;
    private final ShopRepository shopRepository;

    public CityDTO getAllFields(Long id){
        var getALlCity = cItyRepository.findById(id).get();
        return CityMapper.INSTANCE.toDTO(getALlCity);
    }

    public CityDTO getFindCityAndShopsByName(String name){
        var findCityAndShopsByName = cItyRepository.findCityAndShopsByName(name);
        var getAllShops = shopRepository.findAll();
        var cityDto = CityMapper.INSTANCE.toDTO(findCityAndShopsByName);
        var getShopsDto = CityMapper.INSTANCE.toDTO(getAllShops);
        cityDto.setShops(getShopsDto);
        return cityDto;
    }

}
