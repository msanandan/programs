package com.optional.classes;

import java.util.Arrays;
import java.util.List;

public class Filter1 {
	
	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(3,4,6,12,20);
		
		list.stream().filter(num -> num % 5 ==0)
		             .forEach(System.out::println);
	}

}
