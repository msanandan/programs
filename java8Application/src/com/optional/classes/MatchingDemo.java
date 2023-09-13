package com.optional.classes;

import java.util.Arrays;
import java.util.List;

public class MatchingDemo {
	
	public static void main(String[] args) {
		
		
		Person p1 = new Person("sanandan", "USA");
		Person p2 = new Person("ravi", "JAPAN");
		Person p3 = new Person("raju", "CHINA");
		Person p4 = new Person("srini", "INDIA");
		
		List<person> persons = Arrays.asList(p1,p2,p3,p4);
		
		//is there any indian avilable	
		
		boolean anyindian = persons.stream().anyMatch(p ->p.country.equals("INDIA"));
				System.out.println("Any indian Avaiable:"+anyindian);
        boolean allindians = persons.stream().allMatch(p->p.country.equals("INDIA"));
        System.out.println("All the person are  Indians?:"+anyindian);
}
}