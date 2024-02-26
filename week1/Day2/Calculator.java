package week1.Day2;

public class Calculator {
	public int add(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public int sub(int a, int b) {
		System.out.println(a - b);
		return a - b;
	}
	public int multiplication(int a, int b) {
		System.out.println(a * b);
		return a * b;
	}
	public int division(int a, int b) {
		System.out.println(a / b);
		return a / b;
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(34, 45);
		cal.sub(23, 20);
		cal.multiplication(2, 5);
		cal.division(3, 45);
	}
}



