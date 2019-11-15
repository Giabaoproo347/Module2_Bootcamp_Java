package com.codegym.services;

import com.codegym.models.Customer;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceipl implements CustomerService {

    private static Map<Integer, Customer> customers;

    static {
        customers  = new HashMap<>();
        customers.put(1,new Customer(1,"John","john@codegym.vn","Ha Noi"));
        customers.put(2,new Customer(2,"Ha","hn@codegym.vn","Ha Noi"));
        customers.put(3,new Customer(3,"Dung","jhn@codegym.vn","Ha Noi"));
        customers.put(4,new Customer(4,"Minh","ohn@codegym.vn","Ha Noi"));
        customers.put(5,new Customer(5,"Duong","joh@codegym.vn","Ha Noi"));

    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {

        customers.put(customer.getID(),customer);
    }

    @Override
    public void update(int ID, Customer customer) {
        customers.put(ID, customer);
    }

    @Override
    public void remove(int ID) {
        customers.remove(ID);

    }

    @Override
    public Customer findByID(int ID) {
        return customers.get(ID);

    }
}
