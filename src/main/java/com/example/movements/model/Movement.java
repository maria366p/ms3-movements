package com.example.movements.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(collection = "movements")
public class Movement {

    @Id
    private String id;

    private String productId;
    private String type;  // IN | OUT
    private int qty;
    private Instant timestamp;

    public Movement() {}

    public Movement(String productId, String type, int qty, Instant timestamp) {
        this.productId = productId;
        this.type = type;
        this.qty = qty;
        this.timestamp = timestamp;
    }

    // Getters & Setters
    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getProductId() { return productId; }

    public void setProductId(String productId) { this.productId = productId; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public int getQty() { return qty; }

    public void setQty(int qty) { this.qty = qty; }

    public Instant getTimestamp() { return timestamp; }

    public void setTimestamp(Instant timestamp) { this.timestamp = timestamp; }
}

