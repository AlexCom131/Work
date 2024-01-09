package com.example.lapshop.controller;

import com.example.lapshop.Entity.UserEntity;
import com.example.lapshop.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    private UserRepository userRepository;

@PostMapping
public ResponseEntity registration(@RequestBody UserEntity user){
    try {
        userRepository.save(user);

        return ResponseEntity.ok("Реєстрація завершена");
    } catch (Exception e)
    {
        return ResponseEntity.badRequest().body("От халепа!!!!");
    }
}

@GetMapping("/")
public ResponseEntity getUser(){
    try {
        return ResponseEntity.ok("Сервер запущено");
    } catch (Exception e)
    {
        return ResponseEntity.badRequest().body("От халепа!!!");
    }
}
}
