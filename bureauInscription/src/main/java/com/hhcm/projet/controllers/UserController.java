package com.hhcm.projet.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hhcm.projet.models.User;
import com.hhcm.projet.services.UserServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController()
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
	
	private final UserServiceImpl userServiceImpl;
	
	@GetMapping("")
	public List<User> allUser(){
		
		return userServiceImpl.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable Long id){
		
		return userServiceImpl.getUserById(id);
	}
	
	

}
