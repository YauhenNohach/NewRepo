package com.example.application.database.repository.orders;

import com.example.application.entity.ordrers.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("SELECT o FROM Order o LEFT JOIN FETCH o.products p WHERE o.id = :id")
    Optional<Order> findOrderWithProducts(@Param("id") Long id);
}
