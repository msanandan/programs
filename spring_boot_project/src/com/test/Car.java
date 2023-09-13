package com.test;

public class Car  extends Engine {
	
	public void drive() {
		
		int result = super.start();
		
		if(result>=1) {
			
			System.out.println("jouney Stated Successfully");
		}else {
			
			System.out.println("Engine has some problems");
	}

}
}