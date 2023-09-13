package com.optional.classes;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {

	
	public static void main(String[] args) {
		
		List<String> javacourses = Arrays.asList("core java","adv java","springboot");
		
		List<String> uicourses = Arrays.asList("html","css","bs","js");
		
		List<List<String>>courses = Arrays.asList(javacourses, uicourses);
		
		courses.stream().flatMap(s->s.stream()).forEach(System.out::println);
	}
}
