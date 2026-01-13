package com.hhcm.projet.services;

import java.util.ArrayList;
import java.util.List;

import com.hhcm.projet.models.User;

public interface UserService {

	List <User> getAllUsers();
	void deleteUser(Long id);
	ArrayList<User> add(User user);
	User getUserById(Long id);
}
