package MiniBank.com.example.ICBCBackend.model;

import lombok.Data;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "system_date")
public class SysDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Column(name = "current_date")
    private LocalDate currentDate;

    @Column(name="last_modified")
    private LocalDateTime lastModified;

    // Setter for currentDate
    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }



}
