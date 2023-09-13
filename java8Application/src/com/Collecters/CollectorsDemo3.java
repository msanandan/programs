
//employee should be grouped based on country name 
package com.Collecters;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemo3 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Robest",26500.00);
		Employee e2 = new Employee(2, "Abraham",46000.00);
		Employee e3 = new Employee(3,"Ashok", 36500.00);
		Employee e4 = new Employee(4,"Ching", 16500.00);
		Employee e5 = new Employee(5,"Kumar", 25500.00);
		
		List<Employee>employees = Arrays.asList(e1,e2,e3,e4,e5);
		
		Map<Object, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(e -> e.country));
		
		System.out.println(map);

	}

}
