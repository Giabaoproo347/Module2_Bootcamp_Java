package com.practice.Service;

import com.practice.Model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findByID(int id);

    void save(Customer customer);

    void update(int id, Customer customer);

    void remove (int id);




}
