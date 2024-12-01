package com.example.application.database.repository.cities;

import com.example.application.entity.cities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CItyRepository extends JpaRepository<City, Long> {


}
