package com.example.education.edTech.service;

import com.example.education.edTech.entity.User;
import com.example.education.edTech.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User fetchUserByMobile(long mobileNumber){
        return userRepository.findByMobileNumber(mobileNumber);

    }

    public void SaveUser(User user){
        userRepository.save(user);

    }
}
