package com.example.lapshop.Repository;

import com.example.lapshop.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
//
public interface UserRepository extends CrudRepository<UserEntity, Long > {
}


