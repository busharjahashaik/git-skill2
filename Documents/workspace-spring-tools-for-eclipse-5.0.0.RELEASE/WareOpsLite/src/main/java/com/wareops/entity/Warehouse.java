package com.wareops.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "warehouse")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    private int warehouse_id;

    private String name;
    private String city;
    private String status;

    // ---------------- Constructors ----------------

    // Default constructor (required by Hibernate)
    public Warehouse() {}

    // Constructor used when adding a new warehouse (ID auto-generated)
    public Warehouse(String name, String city, String status) {
        this.name = name;
        this.city = city;
        this.status = status;
    }

    // Optional constructor if you need to create warehouse object with a known ID
    public Warehouse(int warehouseId, String name, String city, String status) {
        this.warehouse_id = warehouseId;
        this.name = name;
        this.city = city;
        this.status = status;
    }

    // ---------------- Getters and Setters ----------------

    public int getWarehouseId() { return warehouse_id; }
    public void setWarehouseId(int warehouseId) { this.warehouse_id = warehouseId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
