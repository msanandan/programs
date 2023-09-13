package com.dateandtime_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) throws ParseException {
		      	
		
		Date d =new Date();
		
		System.out.println(d);
		
		//converting date obj format to String format-->format(); 	 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
		
		String formatString = sdf.format(d);
		
		System.out.println(formatString);
		
		//convart string to date
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
		
		sdf1.parse("26/08/2023");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		            Date parsedDate   =    sdf.parse("2026-08-26");
		            
		            System.out.println(parsedDate);
		            
		            
		            
		            //date =>Date and time
		            //again you have format
		            
		            //in real time there are mutiple parsing issues
		            //no choice of methods
		            
		            //custom date not passible
		
		
		
	}	
	
}
