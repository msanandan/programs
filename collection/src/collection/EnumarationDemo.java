package collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationDemo {

	public static void main(String[] args) {

		Vector<Object> v = new Vector<>();

		for (int i = 1; i<=10; i++) {

			v.addElement(i);
		}
		System.out.println(v);
		Enumeration<Object> e = v.elements();

		while (e.hasMoreElements()) {
			
		Integer I = (Integer) e.nextElement();

			if (I % 2 == 0) {

				System.out.print(I +" ");

			}
		}
		System.out.println();
		System.out.println(v);
	}

}
