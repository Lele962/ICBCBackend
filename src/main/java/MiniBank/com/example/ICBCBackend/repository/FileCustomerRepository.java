package MiniBank.com.example.ICBCBackend.repository;

import MiniBank.com.example.ICBCBackend.model.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.nio.file.Paths;
import java.util.*;
@Repository
public class FileCustomerRepository  implements CustomerRepository{
    private final String directory = "data/customers";
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Customer getById(String id) {
        // 从文件中读取客户信息并反序列化
        // ...
        return null;
    }

    @Override
    public Customer create(Customer customer) {
        // 序列化客户信息并保存到文件
        // ...
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        // 查找对应的文件，序列化客户信息并保存
        // ...
        return customer;
    }

    @Override
    public void delete(String id) {
        // 查找对应的文件并删除
        // 注意：这里应该执行逻辑删除，比如将客户信息移动到一个“已删除”目录
        // ...
    }

    @Override
    public List<Customer> getAll() {
        // 读取目录中的所有文件，反序列化并返回客户列表
        // ...
        return null;
    }
}
