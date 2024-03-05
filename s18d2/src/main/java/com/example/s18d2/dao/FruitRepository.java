package com.example.s18d2.dao;

import com.example.s18d2.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit,Long> {

    @Query(value = "SELECT f.id,f.name,f.price,f.fruit_type from fsweb.fruit as f  ORDER BY f.price DESC",nativeQuery = true)
    List<Fruit> getByPriceDesc();

    @Query(value = "SELECT f.id,f.name,f.price,f.fruit_type from fsweb.fruit as f  ORDER BY f.price ASC ",nativeQuery = true)
    List<Fruit> getByPriceAsc();

    @Query("SELECT f FROM Fruit f WHERE f.name  ILIKE %:name%")
    List<Fruit> searchByName(String name);


}
