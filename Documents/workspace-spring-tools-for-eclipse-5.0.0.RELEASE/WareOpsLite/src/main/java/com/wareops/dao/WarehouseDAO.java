package com.wareops.dao;

import com.wareops.entity.Warehouse;

public class WarehouseDAO extends GenericDAO<Warehouse> {
    public WarehouseDAO() {
        super(Warehouse.class);
    }

    // You can add entity-specific methods here if needed
}
