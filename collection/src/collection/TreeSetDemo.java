package collection;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet<>();
		
		t.add("A");
		t.add("a");
		t.add("b");
		t.add("Z");
		t.add("L");
		//t.add("10")
		t.add(null);
		System.out.println(t);
	}

}
