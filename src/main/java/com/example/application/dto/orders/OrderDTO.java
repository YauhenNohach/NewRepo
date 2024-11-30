package com.example.application.dto.orders;

import lombok.Data;

import java.util.List;

@Data
public class OrderDTO {
    private Long id;
    private String orderNumber;
    private List<ProductDTO> products;
}
