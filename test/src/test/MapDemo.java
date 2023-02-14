package test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	 int id;
	 int salary;
	
	public Employee(int id,int salary ) {
		this.id=id;
		this.salary=salary;
	}
	
}
public class MapDemo {

	
	public static void main(String[] args) {
		List<Employee>list =Arrays.asList
				(new Employee(1, 30000),
						new Employee(1, 30000),
						new Employee(3, 40000),
						new Employee(2, 50000));
		
	
			list.stream().filter(e->e.salary>30000).map(r->r.salary-300).forEach(System.out::println);
	
	}

}
