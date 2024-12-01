package com.example.application.database.repository.shop;

import com.example.application.entity.cities.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository  extends JpaRepository<Shop, Long> {

}
