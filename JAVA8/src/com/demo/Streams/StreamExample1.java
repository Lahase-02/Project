package com.demo.Streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.demo.data.Student;
import com.demo.data.StudentDateBase;

public class StreamExample1 {

	public static void main(String[] args) {
		
		 List<Student>Slist =StudentDateBase.getAllStudents();
		 Predicate<Student> sgpa = s->s.getGpa()<=3.9;
		 Predicate<Student> sgrd = s->s.getGradelevel()<=3;      
	Map<String, List<String>>	 mp= Slist.stream()
			.filter(sgpa)
			.filter(sgrd).collect
			 (Collectors.toMap(Student::getName, Student::getActivities));
	
	System.out.print(mp);
		}
	

}
