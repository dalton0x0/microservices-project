package com.hhcm.projet.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hhcm.projet.models.User;

@Service
public class UserServiceImpl implements UserService{
	
	ArrayList<User> list = new ArrayList<>();

    {
        list.add(new User(1L,"user1@email.com", "1234567"));
        list.add(new User(2L,"user2@email.com", "1234"));
        list.add(new User(3L,"user3@email.com", "1234"));
    }

	@Override
	public List<User> getAllUsers() {
		return list;
	}

	@Override
	public void deleteUser(Long id) {
			
		User deletUser = getUserById(id);
		
		list.remove(deletUser);
	}

	@Override
	public ArrayList<User> add(User user) {
		list.add(user);
		return list;
	}

	@Override
	public User getUserById(Long id) {
        return list.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Utilisateur inexistant"));
    }
	

}
