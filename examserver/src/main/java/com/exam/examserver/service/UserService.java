package com.exam.examserver.service;

import java.util.Set;

import com.exam.examserver.models.User;
import com.exam.examserver.models.UserRole;

public interface UserService {
	
	public  User createUser(User user,Set<UserRole>userRole )throws Exception ;
		
	public  User getuser(long id);

	public void deleteById(long id);
}
