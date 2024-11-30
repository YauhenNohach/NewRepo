package com.example.application.rest.controller.orders;

import com.example.application.dto.orders.UserApplicationDTO;
import com.example.application.entity.ordrers.Order;
import com.example.application.entity.ordrers.UserApplication;
import com.example.application.service.orders.OrderService;
import com.example.application.service.orders.UserApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserApplicationController {

    private final UserApplicationService userApplicationService;

    @GetMapping("/{id}")
    public ResponseEntity<UserApplicationDTO> getUserWithOrders(@PathVariable("id") Long id) {
        var user = userApplicationService.getUserWithOrders(id);
        return ResponseEntity.ok(user);
    }
}
