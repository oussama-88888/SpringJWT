package com.oussama.User.service;

import java.util.List;

import com.oussama.User.entities.Role;
import com.oussama.User.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
	}


