package MiniBank.com.example.ICBCBackend.service;

import MiniBank.com.example.ICBCBackend.model.Customer;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public interface CustomerService {

    Customer getCustomer(String id);
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(String id);
    List<Customer> getAllCustomers();
}
