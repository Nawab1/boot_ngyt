package com.example.demo.resource;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exc.UserPresent;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/user")
public class HomeController {
	@Autowired
 private UserService userService;
 @PostMapping("/save")
 public ResponseEntity<User> saveData(@RequestBody User user){
	
	 if(userService.checkExistance(user) == null) {
	 
	 user =  userService.saveData(user);
	
	
	 return new ResponseEntity<User>(user,HttpStatus.OK);
	 }else {
		 throw new UserPresent("user with it id "+user.getId()+"present");
	 }
 }
  @PostMapping("/login")
  public User logIn(@RequestBody User user) {
	  if(userService.checkWithUserPass(user).isPresent()) {
		  return user;
	  }else {
			 throw new UserPresent("user with it id "+user.getUserName()+"present");
  
	  }
  }
}
