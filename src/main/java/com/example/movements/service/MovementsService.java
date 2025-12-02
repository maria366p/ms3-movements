package com.example.movements.service;

import com.example.movements.model.Movement;
import com.example.movements.repository.MovementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovementsService {

    private final MovementRepository repository;

    public MovementsService(MovementRepository repository) {
        this.repository = repository;
    }

    public List<Movement> getLastMovements(String productId) {
        return repository.findTop100ByProductIdOrderByTimestampDesc(productId);
    }
}