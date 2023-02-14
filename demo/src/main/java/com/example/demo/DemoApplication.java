package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Dao.UserRepository;
import com.example.demo.entites.User;

@SpringBootApplication(scanBasePackages = "com.example.demo")
public class DemoApplication {

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		 
		 UserRepository userRepository=context.getBean(UserRepository.class);
		 
		 User user = new User();
		 user.setName("mahesh");
		 user.setCity("panvel");
		  User user2 =userRepository.save(user);
		  System.out.println(user2);
		  }

}
