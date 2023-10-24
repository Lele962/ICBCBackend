package MiniBank.com.example.ICBCBackend.repository;

import java.util.List;
import MiniBank.com.example.ICBCBackend.model.Customer;

public interface CustomerRepository {
    Customer getById(String id);
    Customer create(Customer customer);
    Customer update(Customer customer);
    void delete(String id);
    List<Customer> getAll();

}
