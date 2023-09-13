package com.optional.classes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements2 {
	
	public static void main(String[] args) {

		String input = "EverythingisEasywhenyouarebusybutnothingiseasywhenyouarelazy";

		String[] arr = input.split("");

		List<String> list = Arrays.stream(arr)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(i -> i.getValue() == 2)
				.map(i -> i.getKey())
				.collect(Collectors.toList());

		System.out.println(list);
		//List<String> Duplicates = map.entrySet().stream().filter(i
			//	->i.getValue()==2).map(i -> i.getKey()).collect(Collectors.toList());

				//System.out.println(Duplicates);

	}
}
