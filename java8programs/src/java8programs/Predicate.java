package java8programs;

public class Predicate {
	
	public static void main(String[] args) {
		
		Predicate<integer>p =i ->i >10;
		
		System.out.println(p.test(5));
		System.out.println(p.test(15));
	}




	}


