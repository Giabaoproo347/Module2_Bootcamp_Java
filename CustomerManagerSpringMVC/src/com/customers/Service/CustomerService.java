package com.customers.Service;

import com.customers.Model.Customer;

import java.util.ArrayList;

public interface CustomerService {

    public ArrayList<Customer> findAll();

    void add(Customer customer);

    void update(int id, Customer customer);

    void delete(int id);

    Customer findById(int id);


}
