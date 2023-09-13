package com.payment;

public class BillCollector {
	
	public payment p = new DebitCard();
	
	public void billpay(double amount) {
		
		String result = p.pay();
		
		System.out.println(result);
	}

}
