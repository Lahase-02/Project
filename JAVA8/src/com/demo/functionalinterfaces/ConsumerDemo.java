package com.demo.functionalinterfaces;

import java.security.PublicKey;
import java.util.List;
import java.util.function.Consumer;

import com.demo.data.Student;
import com.demo.data.StudentDateBase;

public class ConsumerDemo {

	/*
	 * public static void printAll() { Consumer<Student> c2 =
	 * (s)->System.out.println(s); List<Student> Slist =
	 * StudentDateBase.getAllStudents(); Slist.forEach(c2); }
	 */
	static Consumer<Student> sname = (s)->System.out.print(s.getName());
	static Consumer<Student> sactivities=(s)->System.out.println(s.getActivities());
	
	public static void printNamesActivites() {
		Consumer<Student> sname = (s)->System.out.print(s.getName());
		Consumer<Student> sactivities=(s)->System.out.println(s.getActivities());
		    List<Student> Slist = StudentDateBase.getAllStudents();
		    Slist.forEach(sname.andThen(sactivities));
		    
	}
	
	public static void printNamesActivitesUseingMethod() {
		
		
		    List<Student> Slist = StudentDateBase.getAllStudents();
		    Slist.forEach((s)->{
		    	if(s.getGradelevel()>=3) {
		    		sname.andThen(sactivities).accept(s);
		    	}
		    }
		    );
		    
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//printAll();
		
		//printNamesActivites();
		printNamesActivitesUseingMethod();
		Consumer<String> c =(s)->System.out.println(s.toUpperCase());
		c.accept("mahesh");
	}

}
