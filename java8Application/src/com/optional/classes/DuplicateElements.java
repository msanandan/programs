package com.optional.classes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//To find the Duplicate Characters in a given String//w c r h n
public class DuplicateElements {

	public static void main(String[] args) {

		String input = "ILoveWatchingCricketWithMyFriends";

		String[] arr = input.split("");

		List<String> list = Arrays.stream(arr)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(i -> i.getValue() == 2)
				.map(i -> i.getKey())
				.collect(Collectors.toList());

		System.out.println(list);
		// System.out.println(Arrays.toString(arr));

		// Arrays.stream(arr).forEach(System.out::println);

		// Map<String, Long> map =
		// Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		// System.out.println(map);

		// map.entrySet().forEach(System.out::println);

		// map.entrySet().stream().filter(i
		// ->i.getValue()==2).forEach(System.out::println);

		// List<String> Duplicates = map.entrySet().stream().filter(i
		// ->i.getValue()==2).map(i -> i.getKey()).collect(Collectors.toList());

		// System.out.println(Duplicates);

	}
}
