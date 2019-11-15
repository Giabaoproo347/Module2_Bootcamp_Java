package com.codegym.services;

import com.codegym.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save (Customer customer);

    void remove (int ID);

    void update (int ID, Customer customer);

    Customer findByID(int ID);
}
