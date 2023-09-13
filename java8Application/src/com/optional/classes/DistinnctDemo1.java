package com.optional.classes;

import java.util.Arrays;
import java.util.List;

public class DistinnctDemo1 {
	
	public static void main(String[] args) {
		
		List<String> javacourses = Arrays.asList("core java","adv java","springboot","restapi","Microsrvices");
		
		javacourses.stream().limit(3).forEach(System.out::println);
		
		
		System.out.println("******************************************************************");
		
		javacourses.stream().skip(3).forEach(System.out::println);
		
		List<String> names = Arrays.asList("raja","rani","raja","rani","guru");
		
		names.stream().distinct().forEach(System.out::println);
	}

}
