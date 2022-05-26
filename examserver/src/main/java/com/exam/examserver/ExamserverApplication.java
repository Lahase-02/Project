package com.exam.examserver;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.examserver.models.Role;
import com.exam.examserver.models.User;
import com.exam.examserver.models.UserRole;
import com.exam.examserver.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {
	@Autowired
	private UserService useService;
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("starting code");
		
		/*
		 * User user = new User(); user.setFirst_name("mahesh");
		 * user.setLast_name("lahase"); user.setGmail("afaefg@gmail.com");
		 * user.setPassword("mahesh@3"); user.setPhone("4546778");
		 * user.setUsername("mahesh34");
		 * 
		 * Role role= new Role(); role.setRoleName("Admin");
		 * 
		 * UserRole userrole =new UserRole();
		 * 
		 * userrole.setRoles(role); userrole.setUser(user); Set<UserRole> roles = new
		 * HashSet<>(); roles.add(userrole); useService.createUser(user, roles);
		 */
	}

}
