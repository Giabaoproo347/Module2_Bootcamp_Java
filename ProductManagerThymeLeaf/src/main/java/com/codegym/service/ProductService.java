package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findByID(int id);

    void save(Product product);

    void update (int id, Product product);

    void delete (int id);

}
