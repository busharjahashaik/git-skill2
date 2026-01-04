package com.wareops.dao;

import com.wareops.entity.SalesOrder;

public class SalesOrderDAO extends GenericDAO<SalesOrder> {
    public SalesOrderDAO() {
        super(SalesOrder.class);
    }
}
