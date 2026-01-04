package com.wareops.dao;

import com.wareops.entity.Customer;

public class CustomerDAO extends GenericDAO<Customer> {
    public CustomerDAO() {
        super(Customer.class);
    }
}
