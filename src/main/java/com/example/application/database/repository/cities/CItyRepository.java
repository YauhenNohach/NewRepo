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


    @Query(value = "SELECT COUNT(c.id) " +
            "FROM cities c " +
            "INNER JOIN cities_shops cs ON c.id = cs.city_id " +
            "INNER JOIN shops s ON cs.shops_id = s.id " +
            "GROUP BY c.id " +
            "HAVING COUNT(s.id) = 1",
            nativeQuery = true)
    int countCitiesWithMoreThan10Shops();

    @Query(value = "SELECT COUNT(c.id) " +
            "FROM City c " +
            "JOIN c.shops s " +
            "GROUP BY c.id " +
            "HAVING COUNT(s.id) = 1")
    int countCitiesWithMoreThan10ShopsJPQL();

    // количество городов где магазинов больше 10
    // SQL: SELECT COUNT(cities.id) FROM cities
    // inner join cities_shops on cities.id = cities_shops.city_id
    // inner join shops on shop_id = shops.id
    // GROUP BY cities.id
    // HAVING count(shops.id) > 10


    // вывести, где количетсво attractions > 2 SQL:
    //
}
