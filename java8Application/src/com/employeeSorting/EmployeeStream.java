package com.employeeSorting;

import java.awt.SecondaryLoop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeStream {
	
	public static void main(String[] args) {
		  
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee( 1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		
		employeeList.add(new Employee( 2, "Smith", 25, "male", "sals", 2015, 13500.0));
		employeeList.add(new Employee( 3, "David", 29, "male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee( 4, "Orlen", 28, "male", "Development", 2014, 32000.0));
		employeeList.add(new Employee( 5, "charls", 27, "male", "HR", 2013, 22700.0));
		employeeList.add(new Employee( 6, "Cathy", 43, "male", "Security", 2016, 10500.0));
		employeeList.add(new Employee( 7, "Ramesh", 35, "male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee( 8, "Suresh", 31, "male", "Development", 2015, 34500.0));
		employeeList.add(new Employee( 9, "Gita", 24, "Fmale", "sales", 2016, 11500.0));
		employeeList.add(new Employee( 10, "mahesh", 38, "male", "security", 2010, 11000.0));
		employeeList.add(new Employee( 11, "Gouri", 27, "male", "Infrastructure", 2015, 15700.0));
		employeeList.add(new Employee( 12, "Nithin", 25, "Female", "Development", 2011, 28200.0));
		employeeList.add(new Employee( 13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee( 14, "Buttler", 24, "male", "sales", 2017, 10700.0));
		employeeList.add(new Employee( 15, "Ashok", 23, "male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee( 16, "Sanvi", 26, "Female", "Development", 2015, 00.0));
		
		/*//1.how many male and female employee are therein the organization
		
		Map<String, Long> maleFemales = employeeList.stream().collect(Collectors.groupingBy((Employee::getGender),Collectors.counting()));
		System.out.println(maleFemales);
		System.out.println("=====================================================================");
		
		//2.write a java codeto print all the departments in the organization
		List<String> departments = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
	    System.out.println(departments);
	    
	    System.out.println("=======================================================================");
		
	    //3.write a java code print avarage age of male and femail employees
	    
	    Map<String, Double> avarageAge = employeeList.stream().collect(Collectors.groupingBy((Employee::getGender),Collectors.averagingDouble(Employee::getAge)));
		
		System.out.println(avarageAge);
		 System.out.println("=======================================================================");		 		
		
		//4.write a java code print highest paid employee in the organisation?
		 Optional<Employee>highestpaid = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		 																																																																																																																																																																																																																																																																																																																																																													
		if(highestpaid.isPresent()) {
			
			System.out.println(highestpaid.get().getName());
			
			System.out.println("=======================================================================");
	     
			
			//5.get all the employees who joined after 2015?
			
			employeeList.stream().filter(e ->e.getYearofjoining()>2015).forEach(System.out::println);
			
			employeeList.stream().filter(e ->e.getYearofjoining()>=2015).map(i -> i.getName()).forEach(System.out::println);
			System.out.println("=======================================================================");
			
			//6.count the number of Employees in each department?
			Map<String, Long> employeecount = employeeList.stream().collect(Collectors.groupingBy((Employee::getDepartment),Collectors.counting()));
			
			System.out.println(employeecount);
			System.out.println("=======================================================================");
			
			//7.what is the average salary of each department
			
			Map<String, Double> averageSalary = employeeList.stream().collect(Collectors.groupingBy((Employee::getDepartment),Collectors.averagingDouble(Employee::getSalary)));
			System.out.println(averageSalary);
			
			System.out.println("=======================================================================");
		
		/*
		 * //8.Get the details of youngest male employee in Depelopment Department
		 * 
		 * Optional<Employee> optional = employeeList.stream() .filter(i
		 * ->i.getGender()=="Male") .filter(i -> i.getDepartment() == "Development")
		 * .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		 * 
		 * if(optional.isPresent()) {
		 * 
		 * System.out.println(optional.get()); System.out.println(
		 * "=======================================================================");
		 */	     
				     //9.who is having most Experiance in the organization?
				     
				     Optional<Employee> exp = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
				     
				     if(exp.isPresent()) {
				    	 
				    	 System.out.println(exp.get().getName());
				    	 System.out.println("=======================================================================");
				    	 
				    	 //10.how many male &  female employees are therein the sales team?
				    	 
				    	 Map<String, Long> salesMap = employeeList.stream().filter(i -> i.getDepartment()=="sales").collect(Collectors.groupingBy((Employee::getGender),Collectors.counting()));
				    	 System.out.println(salesMap);
				    	 System.out.println("=======================================================================");
				    	 
				    	 //11.To print average salary of Male and Female Employees?
				    	 
				    	 Map<String, Double> avgsalary= employeeList.stream().collect(Collectors.groupingBy((Employee::getGender),Collectors.averagingDouble(Employee::getSalary)));
				    	 System.out.println(avgsalary);
				    	 
				    	 System.out.println("=======================================================================");
				    	 
				    	 //12.To print the list down the names of all employees in each department?
				    	 Map<String, List<String>> emplDept = employeeList.stream().collect(Collectors.groupingBy((Employee::getDepartment),Collectors.mapping((Employee::getName),Collectors.toList())));
				    	 
				    	 System.out.println(emplDept);
				    	 
				    	 System.out.println("=======================================================================");
				    	 
				    	 //13.what is he average salary and Total salary of whole organization?
				    	 
				    	 Double avgSalary = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
				    	 System.out.println(avgSalary);
				    	 
				    	 Double totalsal = employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
				    	 System.out.println(totalsal);
				    	 
				    	 System.out.println("=======================================================================");
				    	 
				    	 //14.Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years?
				    	 List<String> Young25 = employeeList.stream().filter(i -> i.getAge()<=25).map(e ->e.getName()).collect(Collectors.toList());
				    	 
				    	 System.out.println(Young25);
				    	 List<String> older25 = employeeList.stream().filter(i -> i.getAge()>25).map(e ->e.getName()).collect(Collectors.toList());
                         System.out.println(older25);
                         
                         System.out.println("=======================================================================");
                         
                         
                         //15who is the oldest employee in the organization
                         
                         Optional<Employee> oldest = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
                         
                         if(oldest.isPresent()) {
                        	 
                        	 System.out.println(oldest.get().getName());
                        	 
                        System.out.println("=======================================================================");
                        
                       //16.find the second highest salaried employee datails in the organization?
                        	  
                        Optional<Employee> secondhighest = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
                        if(secondhighest.isPresent()) {
                        	
                        
                        	  System.out.println(secondhighest.get().getName());
                        	  
                        	  System.out.println("=======================================================================");
                         }
				     }
				     }
	}
}

		
		
		
		
		
		
	


