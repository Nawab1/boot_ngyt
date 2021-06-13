package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

private Long id;
 private String name;
 private String password;
 private String userName;
 
}
