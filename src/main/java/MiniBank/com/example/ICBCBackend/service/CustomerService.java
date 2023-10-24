package MiniBank.com.example.ICBCBackend.service;

import MiniBank.com.example.ICBCBackend.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer getCustomer(Customer customer);
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(String id);
    List<Customer> getAllCustomers();
}
