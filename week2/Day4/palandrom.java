package week2.Day4;

public class palandrom {
	public static void main(String[] args) {
		// initialize
		// split the characters
		// reverse the each characters and to store
		// verify the store value and given input value
		String name = "malayalam";
		String temp = "";
		// split the characters
		char[] c = name.toCharArray();
		for (int i = c.length -1; i >= 0; i--) {
			temp = temp + c[i];
			// System.out.print(charArray[i]);
		}
		if (temp.equals(name)) {
			System.out.println("The given word " + name + " is palandrom");
		} else {
			System.out.println("The given word " + name + " is not palandrom");
		}
	}
}
