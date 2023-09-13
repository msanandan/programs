package collection;

import java.util.HashSet;

public class HashSetDmo {
	
	public static void main(String[] args) {
		HashSet<Object>h=new HashSet<>();
		
		h.add("B");
		h.add("c");
		
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		
		System.out.println(h.add("z"));
		System.out.println(h);
	}

}
