package MiniBank.com.example.ICBCBackend.service.Impl;

import MiniBank.com.example.ICBCBackend.model.Customer;
import MiniBank.com.example.ICBCBackend.repository.CustomerRepository;
import MiniBank.com.example.ICBCBackend.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    public CustomerServiceImpl(CustomerRepository customerRepository){
    }

    @Override
    public Customer getCustomer(String id) {
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
