package com.example.lapshop.Repository;

import com.example.lapshop.Entity.LaptopPurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopPurchaseRepository extends JpaRepository<LaptopPurchaseEntity, Long> {
}