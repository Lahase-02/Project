package com.exam.examserver.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Uid; 
	private String username;
	private String Password;
	private String first_name;
	private String last_name;
	private String gmail;
	private String Phone;
	private boolean Active_user =true;
	
	
	public User(long uid, String username, String password, String first_name, String last_name, String gmail,
			String phone, boolean active_user) {
		super();
		Uid = uid;
		this.username = username;
		Password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gmail = gmail;
		Phone = phone;
		Active_user = active_user;
	}
	
	public User() {
	
	}
	@OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "user" )
	@JsonIgnore
	private Set<UserRole>userRoles =new HashSet<UserRole>();
	

	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public long getUid() {
		return Uid;
	}
	public void setUid(long uid) {
		Uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public boolean isActive_user() {
		return Active_user;
	}
	public void setActive_user(boolean active_user) {
		Active_user = active_user;
	}
	
	
	
}
