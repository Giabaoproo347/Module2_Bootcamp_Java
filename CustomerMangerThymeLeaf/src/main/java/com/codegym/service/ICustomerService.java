package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ICustomerService implements  CustomerService {
    public static Map<Integer, Customer> customers = new HashMap<>();
        static {
            customers.put(1,new Customer(1,"Bao","bao@gmail.com","Vinh Phuc"));
            customers.put(2,new Customer(2,"Huy","huy@gmail.com","Vinh Phuc"));
            customers.put(3,new Customer(3,"hoàng","hoang@gmail.com","Vinh Phuc"));
            customers.put(4,new Customer(4,"Hai","hai@gmail.com","Vinh Phuc"));
        }


    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer findByID(int id) {
        return customers.get(id);
    }

    @Override
    public void save(Customer customer) {
            customers.put(customer.getId(), customer);

    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
