package com.employeeSorting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class javaStreams {
	
	
	public static void main(String[] args) throws IOException {
		//1.print integers using Integer stream 
		
		IntStream.range(0, 10).forEach(System.out::println);
		
		System.out.println("=======================================================================");
		
		//2.integer stream with skip
		
		IntStream.range(0, 10).skip(5).forEach(System.out::println);
		
		System.out.println("=======================================================================");
		//3.integer stream with sum
		int sum = IntStream.range(0, 10).sum();
		
		System.out.println(sum);
		
		System.out.println("=======================================================================");
		
		//4.Stream.of, sorted,findFirst
		
		Optional<String> findFirst = Stream.of("Ava","Aneri","Alberto").sorted().findFirst();
		
		if(findFirst.isPresent()){
			System.out.println(findFirst.get());
		}
		System.out.println("=======================================================================");
		
		//5.Stream from array sort filter and print
		String[] names = {"Albafta","Ankit","kushal","Brent","Sarika","Amanda","Hans","Shivaika","Sarah"};
		Arrays.stream(names)
		
		                     .filter(x ->x.startsWith("A"))
		                     //.map(i -> i.equalsIgnoreCase(i))
		                     .sorted()
		                     .forEach(System.out::println);
		
		System.out.println("=======================================================================");
		
		
		
		//6.Avereage of squrees of an int[]
		
		Arrays.stream(new int[] {2,4,6,8,10}).map(x ->x *x).average().ifPresent(System.out::println);
		
		System.out.println("=======================================================================");
		
		//7.Stream from List,Filter and print
		
		List<String> List = Arrays.asList("Albafta","Ankit","kushal","Brent","Sarika","Amanda","Hans","Shivaika","Sarah");
		
		List.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach(System.out::println);
		System.out.println("=======================================================================");
		//8.stream rows from text file sort, filter,print
		
		Stream<String>bands = Files.lines(Paths.get("bands.txt"));
		
		bands.sorted().filter(x -> x.length() > 13).forEach(System.out::println);
		bands.close();
		System.out.println("=======================================================================");
		
		//9.Streams rows from  text file save to List
		
		List<String> jitWords = Files.lines(Paths.get("bands.txt")).filter(x -> x.contains("jit")).collect(Collectors.toList());
		
		System.out.println(jitWords);
		System.out.println("=======================================================================");
		
		//10.Stream rows from CSV file(data.txt)and count
		long rows = Files.lines(Paths.get("data.txt")).map(x -> x.split(",")).filter(x -> x.length==3).count();
		
		System.out.println(rows);
		System.out.println("=======================================================================");
		
		//11.stream rows from CSV files,parse data from rows
		
		Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
		
		rows2.map(x -> x.split(",")).filter(x ->x.length==3).filter(x -> Integer.parseInt(x[1])>15).forEach(k -> System.out.print(k[1]+" "+k[2]));
		
		//12.stream rows from CSV file,store fields in HashMap
		
		Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
		Map<String,Integer>map=new HashMap<>();
		map = rows3.map(x -> x.split(",")).filter(x -> x.length==3).filter(x -> Integer.parseInt(x[1]) > 15)
		             .collect(Collectors.toMap(x ->x[0],x -> Integer.parseInt(x[1])));
		
		System.out.println("=======================================================================");
		
		
		//13.Reduction - sum
		
		Integer reduce =Stream.of(7,1,4).reduce(1,(Integer a,Integer b)->a*b);
		
		System.out.println(reduce);
		
		System.out.println("=======================================================================");
		//14.Reduction - summary statistics
		IntSummaryStatistics summaryStatistics = IntStream.of(7,2,19,88,73,4,10).summaryStatistics();
		
		System.out.println(summaryStatistics);
		System.out.println("=======================================================================");
	}}
		//15.Take two int[].
		//1.int[] arr1 = {1,-5,3,14,-2,17};
		//
		//from the above array of int values write a java 8 Stream API code toget the sum of second max and second minmum
		//Second Max=14
		//Second min=-2	
		//Sum =14+(-2) =14-2=12	