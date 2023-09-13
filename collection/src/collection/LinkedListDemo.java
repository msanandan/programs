package collection;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<>();
		
		l.add("sanandan");
		l.add("40");
		l.add(null);
		l.add("sanandan");
		System.out.println(l);
		
		l.set(0, "kumar");
		l.set(0, "Reddy");
	//	l.set(0, "Reddy");
		
		System.out.println(l);
		l.removeLast();
		l.addFirst("Dhatsol");
		System.out.println(l);
	}
	

}
