package week3.Day3;

public class ChangeIndexToUppercase {
	public static void main(String[] args, int i) {
		String name = "ChangeMe";// input
		for (int j = 0; j < args.length; j++) {
		char charAt = name.charAt(i);
		if (i % 2 != 0) {
			String lowercase = name.toLowerCase();

			System.out.println(lowercase);
		}
	}
}
}