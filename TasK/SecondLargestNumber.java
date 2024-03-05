package TasK;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] num = { 2, 3, 45, 66, 78, 99, 44, 56, 77 };

		Arrays.sort(num); // Sorting the array in ascending order

		int secondLargest = num[num.length - 2]; // Second last element is the second largest

		System.out.println("The second largest number is: " + secondLargest);
	}
}
