package com.map;

import java.util.Hashtable;

public class HashtableDemo{

	public static void main(String[] args) {
		
  Hashtable<Car, String>h=new Hashtable<>();
	
	
	h.put(new Car(5),"Americans");
	
	h.put(new Car(2),"Brazillian");
	
	h.put(new Car(6),"Chinese");
	
	h.put(new Car(15),"Dauatche");
	
	h.put(new Car(23),"Americans");
	
	h.put(new Car(16),"French");
	
	System.out.println(h);
	
	
	
	}

}
