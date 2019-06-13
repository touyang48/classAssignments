package com.example.demo.Domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepo extends CrudRepository<CarDeal, Long> {

    List<CarDeal> findByModel(String model);
}
