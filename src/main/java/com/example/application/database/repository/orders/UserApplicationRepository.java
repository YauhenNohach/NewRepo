package com.example.application.database.repository.orders;

import com.example.application.entity.ordrers.UserApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserApplicationRepository extends JpaRepository<UserApplication, Long> {

        @Query("SELECT u FROM UserApplication u LEFT JOIN FETCH u.orders o WHERE u.id = :id")
        Optional<UserApplication> findUserWithOrders(@Param("id") Long id);
    }