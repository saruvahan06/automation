package week2.Day3;

public class palinDromenumber {
	public static void main(String[] args) {
		int num = 534;
		int reminder;
		int sum = 0;
		int tmp = num;
		while (num > 0) {
			reminder = num % 10;
			sum = sum * 10 + reminder;
			num /= 10;
		}
		System.out.println(sum);
		if (tmp == sum) {
			System.out.println("it is a palindrome number");
		} else {
			System.out.println("it is not palindrome number");
		}
	}
}
