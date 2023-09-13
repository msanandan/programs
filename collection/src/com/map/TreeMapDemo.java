package com.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
	    TreeMap<String, Integer> t = new TreeMap<>(new Mycomparator6());
		
		t.put("XXX",10);
		t.put("AAA",20);
		t.put("ZZZ",30);
		t.put("LLL",40);
		
		System.out.println(t);
	}

}
     class Mycomparator6 implements Comparator<Object>{

		@Override
		public int compare(Object o1, Object o2) {
			String s1 =o1.toString(); 
			String s2 =(String)o2;
			return -s2.compareTo(s1);
		}
    	 
    	 
     }