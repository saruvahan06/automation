package week2.Day3;

public class sumOfdigits {
	public static void main(String[] args) {
		int num = 324;
		int sum = 0;

		// Extract digits and sum them up
		while (num > 0) {
			int reminder = num % 10; // Extract the last digit 324%10==4
			sum += reminder; // Add  to the sum 4+2+3
			num /= 10; // Remove the last digit 324/32==10
		}

		System.out.println("Sum of digits: " + sum);
		

	}
}
