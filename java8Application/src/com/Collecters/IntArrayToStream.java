package com.Collecters;

import java.util.Arrays;
import java.util.Comparator;

public class IntArrayToStream {

	public static void main(String[] args) {

		int[] arr1 = { 1, -5, 3, 14, -2, 17 };

		int secondLargestNumber = Arrays.stream(arr1).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.get();

		System.out.println("the second largest number is" + secondLargestNumber);

		int secondLowestNumber = Arrays.stream(arr1).boxed().sorted().skip(1).findFirst().get();
		System.out.println("the second minimumnumber is " + secondLowestNumber);

		int sum = (secondLargestNumber + secondLowestNumber);

		System.out.println(sum);
	}

}
