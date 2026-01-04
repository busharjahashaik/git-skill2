package com.wareops.dao;

import com.wareops.entity.Product;

public class ProductDAO extends GenericDAO<Product> {
    public ProductDAO() {
        super(Product.class);
    }
}
