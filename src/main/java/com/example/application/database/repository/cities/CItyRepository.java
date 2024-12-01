package com.example.application.database.repository.cities;

import com.example.application.entity.cities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CItyRepository extends JpaRepository<City, Long> {
    @Query(
        "SELECT c FROM City c left join fetch c.shops s where c.name = :name "
    )
    City findCityAndShopsByName(@Param("name") String name);

}
