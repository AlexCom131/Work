package com.example.lapshop.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="laptop_purchases")
public class LaptopPurchaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "laptop_id")
    private LapTopEntity laptop;

    public LaptopPurchaseEntity() {
    }

    public LaptopPurchaseEntity(UserEntity user, LapTopEntity laptop) {
        this.user = user;
        this.laptop = laptop;
    }

    public Long getId() {
        return id;
    }

    public LaptopPurchaseEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public LaptopPurchaseEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public LapTopEntity getLaptop() {
        return laptop;
    }

    public LaptopPurchaseEntity setLaptop(LapTopEntity laptop) {
        this.laptop = laptop;
        return this;
    }
}