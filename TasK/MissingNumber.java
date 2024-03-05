package TasK;

public class MissingNumber {
	public static void main(String[] args) {
		int[] num = { 2, 4, 5, 1, 6 };
		int n = num.length + 1; // The length of the original array + 1
		int totalSum = n * (n + 1) / 2; // Sum of natural numbers from 1 to n
		int actualSum = 0;

		for (int i = 0; i < num.length; i++) {
			actualSum += num[i];
		}

		int missingNumber = totalSum - actualSum;
		System.out.println("The missing number is: " + missingNumber);
	}
}
