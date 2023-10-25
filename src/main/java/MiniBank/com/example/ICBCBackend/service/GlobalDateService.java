package MiniBank.com.example.ICBCBackend.service;

import MiniBank.com.example.ICBCBackend.model.SysDate;
import MiniBank.com.example.ICBCBackend.repository.SystemDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class GlobalDateService {
    @Autowired

    private SystemDateRepository   systemDateRepository;

    public LocalDate getCurrentDate(){
        return systemDateRepository.findById(1L).map(SysDate::getCurrentDate).orElse(LocalDate.now());
    }

    public void setSystemDate(LocalDate date){
        SysDate sysDate = systemDateRepository.findById(1L).orElse(new SysDate());
        sysDate.setCurrentDate(date);
        systemDateRepository.save(sysDate);
    }
}
