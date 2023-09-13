//write a java program to get MAX MIN and AVG salary from given employees data using stream api
package com.Collecters;




import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsDemo2 {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Robest",26500.00);
		Employee e2 = new Employee(2, "Abraham",46000.00);
		Employee e3 = new Employee(3,"Ashok", 36500.00);
		Employee e4 = new Employee(4,"Ching", 16500.00);
		Employee e5 = new Employee(5,"Kumar", 25500.00);
		
       List<Employee> employeesList = Arrays.asList(e1,e2,e3,e4,e5);
       
       
       //to find the maximum salaried Employee form list of employees
       Optional<Employee>optional = employeesList.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		
            if(optional.isPresent()) {
	
	            System.out.println(optional.get().salary);
	            
	          //to find the maximum salaried Employee form list of employees
	   Optional<Employee> optional2 = employeesList.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
	   
	   if(optional2.isPresent()) {
			
           System.out.println(optional2.get().name);

	   //to find the average salary of employees
           
           Double averageSalary = employeesList.stream().collect(Collectors.averagingDouble(e ->e.salary));
           
           System.out.println(averageSalary);
}
	}

	}}
