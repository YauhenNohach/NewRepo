package com.example.application.service.orders;

import com.example.application.database.repository.orders.OrderRepository;
import com.example.application.entity.ordrers.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public Order getOrderWithProducts(final Long id){
        var orderOptional = orderRepository.findOrderWithProducts(id);
        return orderOptional.orElseThrow(() -> new IllegalArgumentException("Order not found"));
    }
}
