package com.exam.examserver.service.impl;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.examserver.models.User;
import com.exam.examserver.models.UserRole;
import com.exam.examserver.repo.RoleRepository;
import com.exam.examserver.repo.UserRepositery;
import com.exam.examserver.service.UserService;
@Service
public class UserServiceImp implements UserService {
	@Autowired
	private RoleRepository rolerepository;
	@Autowired
	private UserRepositery  userrepositery;
	
	
	public User createUser(User user, Set<UserRole> userRole) throws Exception {
	
		 User local =userrepositery.findByUsername(user.getUsername());
		 if(local!=null) {
			 System.out.println("user is alread present");
			    throw new Exception("user already present");
		 }
		 else {
			 for(UserRole ur:userRole) {
				 rolerepository.save(ur.getRoles());
				 user.getUserRoles().addAll(userRole);
				 local= userrepositery.save(user);
				 System.out.println( "hii ");
			 }
		 }
		
		return local;
	}


	@Override
	public User getuser(long id) {
		  User user=userrepositery.findById(id);
		return user;
	}


	@Override
	public void deleteById(long id) {
		userrepositery.deleteById(id);
		
	}

}
