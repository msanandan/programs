package com.optional.classes;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {

	
public static void main(String[] args) {
	
	List<String>counterNames = Arrays.asList("india","china","japan" ,"Austrilia");
	
	//To display country names uppercase
	counterNames.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
	
	
	//Stream<String> upperCaseNames = counterNames.stream().map(name -> name.toUpperCase());
	
	//upperCaseNames.forEach(System.out::println);
	
	//To print of the country names
	counterNames.stream().map(name ->name.length()).forEach(System.out::println);
	
	counterNames.stream().mapToInt(name ->name.length()).forEach(System.out::println); 
}
}
