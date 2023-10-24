package MiniBank.com.example.ICBCBackend.service.Impl;

import MiniBank.com.example.ICBCBackend.model.Customer;
import MiniBank.com.example.ICBCBackend.repository.CustomerRepository;
import MiniBank.com.example.ICBCBackend.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository =  customerRepository;
    }

    @Override
    public Customer getCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return null;
    }

    @Override
    public void deleteCustomer(String id) {

    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }
}
