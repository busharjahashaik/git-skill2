package com.wareops.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bin")
public class Bin {
    @Id
    private int binId;
    private int warehouseId;
    private String location;
    private int capacity;

    public Bin() {}
    public Bin(int binId, int warehouseId, String location, int capacity) {
        this.binId = binId;
        this.warehouseId = warehouseId;
        this.location = location;
        this.capacity = capacity;
    }

    public int getBinId() { return binId; }
    public void setBinId(int binId) { this.binId = binId; }

    public int getWarehouseId() { return warehouseId; }
    public void setWarehouseId(int warehouseId) { this.warehouseId = warehouseId; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}
