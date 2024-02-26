package week1.Day2;

public class chrome {
	String browserName="Chrome";
	public String incognito(String browserName) {
		System.out.println(browserName);
		return browserName;
	}
	public static void main(String[] args) {
		chrome cb=new chrome();
		cb.incognito("Chrome");
		System.out.println(cb.browserName);
		
	}
}
