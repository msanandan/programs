package com.optional.classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;




public class OddSelection {
	
	public static void main(String[] args) {
		
		//String[] s = {};
		
		
		List<String> list = Arrays.asList("Zero", "one", "two", "three", "four", "five", "six", "seven" ,"Eight", "Nine");
		
		//IntStream.range(0, list.size()).forEach(System.out::println);
		
		IntStream.range(0, list.size()).filter(i -> i%2==1).mapToObj(i ->list.get(i)).forEach(i -> System.out.println(i));
		
		IntStream.range(0, list.size()).filter(i -> i%2==0).mapToObj(i ->list.get(i)).forEach(i -> System.out.println(i));
	}
}