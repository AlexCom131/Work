package com.example.lapshop.controller;

import com.example.lapshop.Entity.LaptopPurchaseEntity;
import com.example.lapshop.Repository.LaptopPurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/laptop-purchases")
public class LaptopPurchaseController {

    @Autowired
    private LaptopPurchaseRepository laptopPurchaseRepository;

    @GetMapping
    public Iterable<LaptopPurchaseEntity> getAllLaptopPurchases() {
        return laptopPurchaseRepository.findAll();
    }

    @PostMapping
    public LaptopPurchaseEntity createLaptopPurchase(@RequestBody LaptopPurchaseEntity laptopPurchase) {
        return laptopPurchaseRepository.save(laptopPurchase);
    }

    @PutMapping("/{id}")
    public LaptopPurchaseEntity updateLaptopPurchase(@PathVariable Long id, @RequestBody LaptopPurchaseEntity laptopPurchase) {
        LaptopPurchaseEntity existingLaptopPurchase = laptopPurchaseRepository.getOne(id);
        existingLaptopPurchase.setUser(laptopPurchase.getUser());
        existingLaptopPurchase.setLaptop(laptopPurchase.getLaptop());
        return laptopPurchaseRepository.save(existingLaptopPurchase);
    }

    @DeleteMapping("/{id}")
    public void deleteLaptopPurchase(@PathVariable Long id) {
        laptopPurchaseRepository.deleteById(id);
    }
}
