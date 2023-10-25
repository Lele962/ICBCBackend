package MiniBank.com.example.ICBCBackend.controller;

import MiniBank.com.example.ICBCBackend.service.GlobalDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;


@RestController
@RequestMapping("/api/system-date")
public class SystemDateController {
    @Autowired

    private GlobalDateService globalDateService;

    @GetMapping
    public ResponseEntity<LocalDate> getCurrentDate(){
        return ResponseEntity.ok(globalDateService.getCurrentDate());
    }

    @PostMapping
    public ResponseEntity<Void> setSystemDate(LocalDate date){
        globalDateService.setSystemDate(date);
        return ResponseEntity.ok().build();
    }

}
