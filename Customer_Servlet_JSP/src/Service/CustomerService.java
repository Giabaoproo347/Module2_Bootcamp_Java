package Service;

import Model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    void update (int id, Customer customer);
    void delete (int id);
    Customer findByID(int id);
}