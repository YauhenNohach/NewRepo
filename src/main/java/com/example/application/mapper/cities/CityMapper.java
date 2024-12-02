package com.example.application.mapper.cities;

import com.example.application.dto.cities.*;
import com.example.application.entity.cities.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CityMapper {
    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    @Mapping(target = "region.cities", ignore = true)
    CityDTO toDTO(City city);

    @Mapping(target = "cities", ignore = true)
    RegionDTO toDTO(Region region);

    ShopDTO toDTO(Shop shop);

    FactoryDTO toDTO(Factory factory);
    MariaDTO toDTO(Maria maria);
    UniversityDTO toDTO(University university);

    List<CityDTO> toCityDTOList(List<City> cities);
}

