package com.optional.classes;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
	
	public static void main(String[] args) {
		
		//From list of names filter them sing Some Character and then print the length of the namees.
		
		List<String> names = Arrays.asList("Ashok","AArvi","raju","Rani","shekar","avinash","ravi");
		
		names.stream().filter(name -> name.startsWith("A")).map(name -> name.length()).forEach(System.out::println);																					
		
		
	
		
		
	}

}
