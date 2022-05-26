package com.exam.examserver.controllers;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.examserver.models.Role;
import com.exam.examserver.models.User;
import com.exam.examserver.models.UserRole;
import com.exam.examserver.service.UserService;

@RestController
@RequestMapping("/user")
public class UserControllers {
	@Autowired
	UserService userservice;

	@PostMapping("/")
	public User createUsers(@RequestBody  User user) throws Exception {
		Set<UserRole>roles = new HashSet<UserRole>();
		Role role = new Role();
		role.setRoleName("normal");
		UserRole userRole= new UserRole();
		userRole.setUser(user);
		userRole.setRoles(role);
		roles.add(userRole);
		return userservice.createUser(user, roles);


	}

	@GetMapping("{id}")
	public User getUser(@PathVariable("id") long id ) {

		User user=userservice.getuser(id);
		return user;
	}
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable("id") long id) {
		userservice.deleteById(id);
	}

}
