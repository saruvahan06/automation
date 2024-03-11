package week3.Day2;

public class MirroStarr {
	public static void main(String[] args) {
		int n = 6;
		int k = n * 2 - 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			k = k - 2;
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
