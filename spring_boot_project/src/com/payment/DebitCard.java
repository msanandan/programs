package com.payment;

public class DebitCard implements payment{
	
	@Override
	public String pay() {
		
		return "payment completed throughdebit card";
	}

}
