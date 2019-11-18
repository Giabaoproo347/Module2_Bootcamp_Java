package com.customers.Service;

import com.customers.Controller.CustomerServlet;
import com.customers.Model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ICustomerService implements CustomerService {
   public static Map<Integer, Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1,"Bao","Vinh Phuc","bao@gmail.com"));
        customers.put(2, new Customer(2,"Phuc","Bac Ninh","phuc@gmail.com"));
        customers.put(3, new Customer(3,"Duc","Bac Ninh","duc@gmail.com"));
    }
    @Override
    public ArrayList<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void add(Customer customer) {
            customers.put(customer.getId(),customer);
    }

    @Override
    public void update(int id, Customer customer) {
            customers.put(id,customer);
    }

    @Override
    public void delete(int id) {
        customers.remove(id);

    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }
}
