package com.example.application.mapper.orders;

import com.example.application.dto.orders.ProductDTO;
import com.example.application.entity.ordrers.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toDTO(Product product);
}
