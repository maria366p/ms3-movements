package com.example.movements.repository;

import com.example.movements.model.Movement;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MovementRepository extends MongoRepository<Movement, String> {

    List<Movement> findTop100ByProductIdOrderByTimestampDesc(String productId);

}