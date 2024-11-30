package com.example.application.mapper.orders;

import com.example.application.dto.orders.OrderDTO;
import com.example.application.entity.ordrers.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(source = "products", target = "products")
    OrderDTO toDTO(Order order);
}

