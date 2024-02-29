package week2.Day1;

public class usingTemp {
public static void main(String[] args) {
	int a = 20;
	int b = 80;
	int temp;
	temp = a;
	a = b;
	b = temp;
	System.out.println("value of a "+a);
	System.out.println("value of b "+b);
}
}
