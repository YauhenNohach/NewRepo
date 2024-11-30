package com.example.application.dto.orders;

import lombok.Data;

import java.util.List;

@Data
public class UserApplicationDTO {
    private Long id;
    private String username;
    private String email;
    private List<OrderDTO> orders;
}

