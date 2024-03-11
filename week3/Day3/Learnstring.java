package week3.Day3;

public class Learnstring {
	public static void main(String[] args) {

		// string literal
		String name = " Testleaf";
		// string instance
		String insta = new String("Testlaef");
		if (name.equals(insta)) {
			System.out.println("Equal");
		}
		if (name==insta) {
			System.out.println("Equal");
		}
	}
}