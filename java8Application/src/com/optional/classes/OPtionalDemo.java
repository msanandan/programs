package com.optional.classes;

import java.util.Optional;

public class OPtionalDemo {
	
	public static void main(String[] args) {
		Customer customer = new Customer(101,"sanandan",null);
		
		/*
		 * String email = customer.getEmail();
		 * 
		 * System.out.println(email);
		 */
		
		//when you know that the optional container is never null
		/*
		 * Optional<String> emailoptional = Optional.of(customer.getEmail());
		 * 
		 * System.out.println(emailoptional);
		 */
		
		//when you know that the optional container is either null or contains some
		
		/*
		 * Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
		 * 
		 * System.out.println(emailOptional2);
		 */
		Optional<String> emailoptional3 = Optional.ofNullable(customer.getEmail());
		
		if(emailoptional3.isPresent()) {
			System.out.println(emailoptional3.get());
		}else {
			
			//System.out.println(emailoptional3.orElse("No email data found"));
			
			//System.out.println(emailoptional3.orElseGet(()->"No email data found"));
			
			//System.out.println(emailoptional3.orElseThrow(()-> new IllegalArgumentException("Email Data not found")));
			System.out.println(emailoptional3.map(String::toUpperCase).orElseGet(()->"where is your email id...first fill your emailand then come back and check it once!!!"));
			
		}
	}

}
