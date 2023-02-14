package com.demo.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.demo.data.Student;
import com.demo.data.StudentDateBase;

public class FunctionInterfacExample {

	Predicate<Student> sgpa=(s)->s.getGpa()>=3.9;
	Consumer<Student> c2= (s)->System.out.println(s);
	Function<List<Student>, HashMap<String, Double>> fn=(students ->{
		HashMap<String, Double> Grademap= new HashMap();
		students.forEach((student->{
			if(sgpa.test(student))
			Grademap.put(student.getName(), student.getGpa());
		}
			
		));
		return Grademap;
			
	
		
	});
	
	public static void main(String[] args) {
		
		  List<Student>  sList=StudentDateBase.getAllStudents();
		
              System.out.println(new FunctionInterfacExample().fn.apply(sList)); 
	}

}
