package week2.Day2;

public class usingMethodpositiveOrNegative {

	public void num(int num1, int num2) {
		if (num1 >= 0) {
			System.out.println("num1 is positive number");
		} else {
			System.out.println("num1 is negative number");
		}
		if (num2 <= 0) {
			System.out.println("num2 is negative number");
		} else {
			System.out.println("num2 is positive number");
		}

	}

	public static void main(String[] args) {
		usingMethodpositiveOrNegative pn = new usingMethodpositiveOrNegative();
		pn.num(20, -34);
	}
}
