package com.example.education.edTech.repository;

import com.example.education.edTech.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

     User findByMobileNumber(long mobile);

}
