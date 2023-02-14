package com.demo.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.demo.data.Student;
import com.demo.data.StudentDateBase;

public class ConsumerAndPredicator {
	Predicate<Student> sgrd = s->s.getGradelevel()>=3;
	Predicate<Student> scgp = s->s.getGpa()>=3.5;
	BiConsumer<String, List<String>> biconsumerstudent= (name,activities)->System.out.println(name+ ""+activities);
	/*
	 * Consumer<Student> cs=(s->{ if(sgrd.and(scgp).test(s)){
	 * biconsumerstudent.accept(s.getName(),s.getActivities());
	 * 
	 * } });
	 */
	Consumer<Student> cs1=(s)->{
		if(sgrd.and(scgp).test(s)){
			biconsumerstudent.accept(s.getName(),s.getActivities());
	
	}
	};
	
	
	public void printAll(List<Student> s) {
		s.forEach(cs1);
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = StudentDateBase.getAllStudents();
		new ConsumerAndPredicator().printAll(list);

	}

}
