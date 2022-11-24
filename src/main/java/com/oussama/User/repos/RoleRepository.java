package com.oussama.User.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oussama.User.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);





	

}
