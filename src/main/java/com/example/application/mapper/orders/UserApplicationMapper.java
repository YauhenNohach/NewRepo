package com.example.application.mapper.orders;

import com.example.application.dto.orders.UserApplicationDTO;
import com.example.application.entity.ordrers.UserApplication;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserApplicationMapper {
    UserApplicationMapper INSTANCE = Mappers.getMapper(UserApplicationMapper.class);

    @Mapping(source = "orders", target = "orders")
    UserApplicationDTO toDTO(UserApplication userApplication);
}

