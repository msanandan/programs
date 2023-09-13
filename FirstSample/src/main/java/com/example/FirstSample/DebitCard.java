package com.example.FirstSample;

public class DebitCard implements Payment {

	@Override
	public String pay() {
	
		return "debitCard";
	}

}
