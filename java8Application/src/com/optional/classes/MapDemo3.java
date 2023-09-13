package com.optional.classes;

import java.util.Arrays;
import java.util.List;

public class MapDemo3 {
	
	public static void main(String[] args) {
		//Get the Employees age whose salary is more then50k
		
		Employee emp1 = new Employee("Daykar", 35, 55000.0);
		Employee emp2 = new Employee("Dinnu", 25, 45000.0);
		Employee emp3 = new Employee("Butlar", 35, 35000.0);
		Employee emp4 = new Employee("shiva", 45, 65000.0);
		
		List<Employee>listofEmployees = Arrays.asList(emp1,emp2,emp3,emp4);
		
		//listofEmployees.stream().filter(e->e.salary>50000.0).map(emp ->emp.age).forEach(System.out::println);
		
		//Get the Employee names whose age is more then 30
		
		listofEmployees.stream().filter(e ->e.age>30).map(e ->e.name).forEach(System.out::println);
	} 

}
