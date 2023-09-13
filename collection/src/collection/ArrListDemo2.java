package collection;

import java.util.ArrayList;

public class ArrListDemo2 {
	
	public static void main(String[] args) {
		ArrayList<Object>l=new ArrayList<>();
		
		l.add("A");
		l.add("10");//integer
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2,"M");
		l.add("N");
		l.add("Z");
		l.set(5,"x");
		System.out.println(l);
	}

}
