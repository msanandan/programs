package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		LinkedList<String> l = new LinkedList<>();

		l.add("Thirupathi");
		l.add("sanandan");
		l.add("Navya");
		l.add("Durga");
		System.out.println(l);
		ListIterator<String> ltr = l.listIterator();

		while (ltr.hasNext()) {

			String s = ltr.next();

			if (s.equals("sanandan")) {
				ltr.remove();

			} else if (s.equals("Durga")) {
				ltr.add("Aruna");
			} else if (s.equals("Navya")) {
				ltr.set("shiva");
			}
		}
		System.out.println(l);
	}
}