package com.example.lapshop.controller;

import com.example.lapshop.Entity.LapTopEntity;
import com.example.lapshop.Repository.LapTopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

    @Autowired
    private LapTopRepository lapTopRepository;

    @PostMapping
    public ResponseEntity registration(@RequestBody LapTopEntity lapTop){
        try {
            lapTopRepository.save(lapTop);

            return ResponseEntity.ok("Дані збережені");
        } catch (Exception e)
        {
            return ResponseEntity.badRequest().body("От халепа!!!!");
        }
    }

    @GetMapping("/")
    public ResponseEntity getU(){
        try {
            return ResponseEntity.ok("Звязок встановленийжжж");
        } catch (Exception e)
        {
            return ResponseEntity.badRequest().body("От халепа)))");
        }
    }
}
