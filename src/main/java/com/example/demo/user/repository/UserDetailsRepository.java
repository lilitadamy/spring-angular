package com.example.demo.user.repository;

import com.example.demo.user.model.dto.UserDetailsDto;
import com.example.demo.user.model.entity.UserDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetailsEntity, Integer> {
    UserDetailsEntity findById(int id);
}
