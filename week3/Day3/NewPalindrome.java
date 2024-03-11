package week3.Day3;

public class NewPalindrome {
	public static void main(String[] args) {
		String name = "Bilal";
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char reverse = name.charAt(i);// values are store
			rev = rev + reverse;
		}
		if (rev.equals(name)) {
			System.out.println("Palindrome");
		} else {
			System.out.println(name + " is not palindome");
		}
	}
}
