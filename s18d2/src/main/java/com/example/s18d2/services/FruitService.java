package com.example.s18d2.services;

import com.example.s18d2.dao.FruitRepository;
import com.example.s18d2.entity.Fruit;

import java.util.List;

public interface FruitService {
    Fruit getById(long id);
    List<Fruit> getByPriceDesc();

    List<Fruit> getByPriceAsc();

    Fruit save(Fruit fruit);

    Fruit delete(long id);

    List<Fruit> serchByName(String name);

}
