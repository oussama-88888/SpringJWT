package com.oussama.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.oussama.User.entities.Role;
import com.oussama.User.entities.User;
import com.oussama.User.service.UserService;

@SpringBootApplication
public class UsersMicroserviceApplication {
	
	@Autowired
	UserService userService ;
	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}/*
	@PostConstruct
	void init_users() {
	//ajouter les rôles
	userService.addRole(new Role(null,"ADMIN"));
	userService.addRole(new Role(null,"USER"));
	//ajouter les users
	userService.saveUser(new User(null,"admin","123",true,null));
	userService.saveUser(new User(null,"oussama","123",true,null));
	userService.saveUser(new User(null,"yassine","123",true,null));
	//ajouter les rôles aux users
	userService.addRoleToUser("admin", "ADMIN");
	userService.addRoleToUser("oussama", "USER");
	userService.addRoleToUser("yassine", "USER");
	}*/
	@Bean
	BCryptPasswordEncoder getBCE() {
	return new BCryptPasswordEncoder();
	}}



