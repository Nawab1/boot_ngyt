package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service

public class UserService {
	@Autowired
   private UserRepository userRepository;
   
   public User saveData(User user) {
	   
	user =   userRepository.save(user);
	   return user;
   }
   
   public User checkExistance(User user) {
	   user = userRepository.getById(user.getId());
	   return user;
   }

public Optional<User> checkWithUserPass(User user) {
	  Optional<User> u = userRepository.findUserByUserNameAndPassword(user.getUserName(),user.getPassword());
	return u ;
}
}
