package MiniBank.com.example.ICBCBackend.repository;

import MiniBank.com.example.ICBCBackend.model.SysDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemDateRepository extends JpaRepository<SysDate, Long> {}

