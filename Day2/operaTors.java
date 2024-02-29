package week2.Day2;

public class operaTors {
	public static void main(String[] args) {
		int age = 18;
		int num = 5;
		if (num == 7) {
			System.out.println("Number is equal to");
		} else {
			System.out.println("Number is not equal to");
		}
		if (num != 7) {
			System.out.println("number is satisfied");
		} else {
			System.out.println("is not staisfied");
		}
		if (age >= 18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("not eligible");
		}
		System.out.println(age + num);
		System.out.println(++age);
		//System.out.println(age++);
		System.out.println(--age);
		System.out.println(age--);
	}
}
