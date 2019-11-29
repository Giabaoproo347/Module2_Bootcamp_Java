package com.codegym.service;

import com.codegym.model.Customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CustomerService {

    List<Customer> findAll();

    Customer findByID(int id);

    void save(Customer customer);

    void update(int id, Customer customer);

    void remove(int id);

}
