package com.treedemo;

import java.util.Comparator;
import java.util.TreeSet;

import collection.MyComparator;

public class TreeSetDemo3 {

	
	public static void main(String[] args) {
		
		TreeSet<Integer>t1=new TreeSet<>(new MyComparator());
		
		t1.add(10);
		t1.add(0);
		t1.add(15);
		t1.add(5);
		t1.add(20);
		t1.add(20);
		
	System.out.println(t1);
	}
}
class MyComparator1 implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		
		//return i1.compareTo(i2);//Ascending order
		//return -i1.compareTo(i2);//Descending order
		//return i2.compareTo(i1);//Descending order                                          
		return -i2.compareTo(i1);//Ascending order
	}

}