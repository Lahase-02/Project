package com.demo.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student {
	
	private String name;
	private int gradelevel;
	private double gpa;
	private String gender;
	private int notebooks;
	private Optional<Bike> bike;
	List<String> activities = new ArrayList<>();
	  
	public Student(){

	    }
	public Student(String name, int gradelevel, double gpa, String gender, int notebooks, 
			List<String> activities) {
		super();
		this.name = name;
		this.gradelevel = gradelevel;
		this.gpa = gpa;
		this.gender = gender;
		this.notebooks = notebooks;
		this.activities = activities;
	}
	
	public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradelevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGradelevel() {
		return gradelevel;
	}
	public void setGradelevel(int gradelevel) {
		this.gradelevel = gradelevel;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getNotebooks() {
		return notebooks;
	}
	public void setNotebooks(int notebooks) {
		this.notebooks = notebooks;
	}
	public Optional<Bike> getBike() {
		return bike;
	}
	public void setBike(Optional<Bike> bike) {
		this.bike = bike;
	}
	
	 

	    public  List<String> getActivities() {
	        return this.activities;
	    }

	    public void setActivities(List<String> activities) {
	        this.activities = activities;
	    }

	    public void printListOfActivities(){

	        System.out.println("List of Activities are : " + this.activities);
	    }
	    
	    public String toString() {
	        return "Student{" +
	                "name='" + name + '\'' +
	                ", gradeLevel=" + gradelevel +
	                ", gpa=" + gpa +
	                ", gender='" + gender + '\'' +
	                ", activities=" + activities +
	                '}';
	    }



}
