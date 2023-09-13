package com.optional.classes;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileData {
	
	

	public static void main(String[] args) throws IOException{
		
		String 	filename = "info.txt";
		
		try(Stream<String>  lines = Files.lines(Paths.get(filename))){
			
			
			lines.forEach(line -> System.out.println(line));
			}catch(Exception e) {
				
				e.printStackTrace();
			
				
				
			}
	}
}
		
	

/*
 * try(//DB connectionLogic){
 
  //Iteration
}
catch(Exception e){
e.printstackTrace();
}
finally{
//DBclose
	*/
//try with resources-->There will note beany finally block concept
	