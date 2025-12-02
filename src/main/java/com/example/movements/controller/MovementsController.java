package com.example.movements.controller;

import com.example.movements.model.Movement;
import com.example.movements.service.MovementsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movements")
public class MovementsController {

    private final MovementsService service;

    public MovementsController(MovementsService service) {
        this.service = service;
    }

    @GetMapping("/health")
    public ResponseEntity<?> health() {
        return ResponseEntity.ok(new Status("ok", "ms3-movements"));
    }

    @GetMapping("/{productId}")
    public ResponseEntity<List<Movement>> getMovements(@PathVariable String productId) {
        List<Movement> movements = service.getLastMovements(productId);
        return ResponseEntity.ok(movements);
    }

    static class Status {
        public String status;
        public String service;

        public Status(String status, String service) {
            this.status = status;
            this.service = service;
        }
    }
}
