package com.exam.examserver.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserRole {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	private long userRoleId;
	
	
	public UserRole() {
		
	}
	
	

	public UserRole(long userRoleId, User user, Role roles) {
		super();
		this.userRoleId = userRoleId;
		this.user = user;
		this.roles = roles;
	}



	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;
	@ManyToOne
	private Role roles;
	
	public Role getRoles() {
		return roles;
	}
     public void setRoles(Role roles) {
		this.roles = roles;
	}



	public long getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(long userRoleId) {
		this.userRoleId = userRoleId;
	}
	

	
}
