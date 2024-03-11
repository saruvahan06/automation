package week3.Day1;

import java.util.Arrays;

public class findDuplicate {
	public static void main(String[] args) {
		int num[] = { 2, 3, 1, 4, 5, 6, 4 };
		// int length = num.length;
		// System.out.println(num[0]);
		// 1 2 3 4 4 5 6
		Arrays.sort(num);// this is method used to arrange the values in accending order
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}
		}
		String[] names = new String[5];
		names[0] = "Tharun";
		names[1] = "arun";
		names[2] = "varun";
		names[3] = "saru";
		names[4] = "tamil";
		// names[5]="nitesh";
		// names[6]="wewr";
		System.out.println(names[0]);
	}

}
