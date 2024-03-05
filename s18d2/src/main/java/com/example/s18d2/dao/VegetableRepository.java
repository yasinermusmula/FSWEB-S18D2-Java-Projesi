package com.example.s18d2.dao;

import com.example.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable,Long> {


    @Query(value = "SELECT v.id,v.name,v.price,v.grown_on_tree from  fsweb.vegetable as v ORDER BY v.price DESC",nativeQuery = true)
    List<Vegetable> getByPricesDesc();

    @Query(value = "SELECT v.id,v.name,v.price,v.grown_on_tree from  fsweb.vegetable as v ORDER BY v.price ASC",nativeQuery = true)
    List<Vegetable> getByPricesAsc();

    @Query("SELECT v FROM Vegetable v WHERE v.name ILIKE %:name%")
    List<Vegetable> searchByName(String name);


}
