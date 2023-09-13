package com.predicateExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.jar.Attributes.Name;

public class ComsumerExample {
	
	public static void main(String[] args) {
		
		
		Consumer<String> c=(name)->System.out.println(name+ ",Good Evening");
		
		c.accept("Ashok");
		c.accept("john");
		c.accept("Rani");
		
		List<Integer>numbers = Arrays.asList(10,20,30,40);
		
		numbers.forEach(i ->System.out.println(i));


}
}