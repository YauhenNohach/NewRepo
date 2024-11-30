package com.example.application.rest.controller.orders;

import com.example.application.entity.ordrers.Order;
import com.example.application.service.orders.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderWithProducts(@PathVariable("id") Long id) {
        var order = orderService.getOrderWithProducts(id);
        return ResponseEntity.ok(order);
    }
}
