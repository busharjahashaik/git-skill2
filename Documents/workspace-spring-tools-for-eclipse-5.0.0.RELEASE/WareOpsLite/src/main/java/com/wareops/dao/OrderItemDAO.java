package com.wareops.dao;

import com.wareops.entity.OrderItem;

public class OrderItemDAO extends GenericDAO<OrderItem> {
    public OrderItemDAO() {
        super(OrderItem.class);
    }
}
