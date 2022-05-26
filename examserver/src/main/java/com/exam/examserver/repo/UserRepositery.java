package com.exam.examserver.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examserver.models.User;

public interface UserRepositery extends JpaRepository<User, Long>{

	User findByUsername(String username);
	User findById(long id);

}
