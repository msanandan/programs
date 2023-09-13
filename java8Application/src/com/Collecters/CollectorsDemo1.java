package com.Collecters;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsDemo1 {

	public static void main(String[] args) {

		Person p1 = new Person("jhon", "USA");
		Person p2 = new Person("steve", "JAPAN");
		Person p3 = new Person("Ashok", "INDIA");
		Person p4 = new Person("Ching", "CHINA");
		Person p5 = new Person("Kumar", "INDIA");
		
		List<Person> personsList = Arrays.asList(p1,p2,p3,p4,p5);
		
		//List<Person> filteredList = personsList.stream().filter(p -> p.country.equalsIgnoreCase("INDIA")).collect(Collectors.toList());
		
		//System.out.println(filteredList);
		
		List<String> indians = personsList.stream().filter(p -> p.country.equalsIgnoreCase("INDIA")).map(s -> s.name).collect(Collectors.toList());

		System.out.println(indians);
	}

}
