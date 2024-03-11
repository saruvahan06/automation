package week3.Day3;

public class OccuranceOfCharacter {
	public static void main(String[] args) {
		String name = "Testleaf";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char charAt = name.charAt(i);
			if (charAt == 'e') {
				count++;
			}
		}
		System.out.println("Occurance Of Character in " + name + " of e is " + count);

	}

}
