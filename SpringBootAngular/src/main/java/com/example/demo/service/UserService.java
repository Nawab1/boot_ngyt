package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
   private UserRepository userRepository;
   
   public User saveData(User user) {
	user =   userRepository.save(user);
	   return user;
   }
}
