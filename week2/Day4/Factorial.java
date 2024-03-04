package week2.Day4;

public class Factorial {
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			// System.out.println(fact);
			fact = fact * i;
		}
		System.out.println("The factorial of " + num + " is " + fact);
	}
}
