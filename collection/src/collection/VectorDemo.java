package collection;

import java.util.Vector;

public class VectorDemo {
	
	

	public static void main(String[] args) {
		
		Vector<Object> V=new Vector();
		
		System.out.println(V.capacity());
		
		for(int i = 1;i<=10;i++){
		
		
		V.addElement(i);
	}
	System.out.println(V.capacity());
	
	V.addElement("shiva");
	System.out.println(V.capacity());
	System.out.println(V);
	
	    
	
	}

}
