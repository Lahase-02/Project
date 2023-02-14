package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
    @Id
	private String name;
	private String city;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int iD, String name, String city) {
		super();
		ID = iD;
		this.name = name;
		this.city = city;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", name=" + name + ", city=" + city + "]";
	}

}
