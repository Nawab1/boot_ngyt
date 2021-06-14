package com.example.demo.exc;

public class UserPresent extends RuntimeException {
  public UserPresent(String msg) {
	  super(msg);
  }
}
