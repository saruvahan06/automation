package week2.Day4;

public class fibonaciSeries {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3;
		int value = 6;
		System.out.print(num1 + " " + num2);
		for (int i = 2; i < value; i++) {
			num3 = num1 + num2;
			// System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
			System.out.print(" " + num3);
		}
	}
}