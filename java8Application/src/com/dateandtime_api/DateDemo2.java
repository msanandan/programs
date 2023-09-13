package com.dateandtime_api;

import java.time.LocalDate;

public class DateDemo2 {
	
	public static void main(String[] args) {
		
		//LocalDate local = new LocalDate();
		
		LocalDate currentDate =LocalDate.now();
	
		System.out.println(currentDate);
		
		int day = currentDate.getDayOfMonth();
		
		int month = currentDate.getMonthValue();
		
		int year = currentDate.getYear();
		
		System.out.println(day+"/"+month+"/"+year);
		
		System.out.printf("%d.%d.%d",month,day,year);
				
				
	}

}
