package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo2 {
		
	 public static void main(String[] args) {
		ArrayList<Student> l=new ArrayList<>();
		//List<Student> l1 = new ArrayList<>();
		
		l.add(new Student(1,"Raju"));
	    l.add(new Student(2,"Ravi"));
		l.add(new Student(3,"upender"));
		l.add(new Student(4,"Rani"));
		
		ListIterator<Student>itr = l.listIterator();
		
		while(itr.hasNext()) {
			
		System.out.println(itr.next());	
		}
		System.out.println("**********************************");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

		
	}


