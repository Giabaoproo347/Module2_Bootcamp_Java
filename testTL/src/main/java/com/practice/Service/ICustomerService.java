package com.practice.Service;

import com.practice.Model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ICustomerService implements CustomerService {
    public static Map<Integer, Customer> customerMap = new HashMap();
    static {
        customerMap.put(1,new Customer(1,"Bao","bao@gmail.com","Vinh Phuc"));
        customerMap.put(2,new Customer(2,"Huy","huy@gmail.com","Vinh Phuc"));
        customerMap.put(3,new Customer(3,"Tuan","tuan@gmail.com","Vinh Phuc"));
        customerMap.put(4,new Customer(4,"Truc","truc@gmail.com","Vinh Phuc"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer findByID(int id) {
        return customerMap.get(id);
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(),customer);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }
}
