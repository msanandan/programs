package collection;

import java.util.TreeSet;

public class ComparableDemo {
	public static void main(String[] args) {
		
		TreeSet<StringBuffer> t=new TreeSet<>();
		
		t.add(new StringBuffer("K"));
	   t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("A"));
	    t.add(new StringBuffer("A"));
	    
	    System.out.println("Z".compareTo("k"));
	    
	    System.out.println("k".compareTo("Z"));//k z
	  System.out.println("A".compareTo("K"));
	  System.out.println("A".compareTo("A"));
	  //System.out.println("A".compareTo("null"));
	  
	}
}
