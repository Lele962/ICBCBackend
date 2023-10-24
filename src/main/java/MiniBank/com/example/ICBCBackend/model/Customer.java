package MiniBank.com.example.ICBCBackend.model;


import lombok.Data;
import java.io.Serializable;

@Data
public class Customer implements Serializable {
    private String id;
    private String name;
    private String contactDetails;  // 联系信息
    // 其他字段
}
