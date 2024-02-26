package week1.Day;

public class Car {

	public void soundHorn() {
		System.out.println("sound Horn");
	}

	public void applyBreak() {
		System.out.println("apply Break");
	}

	public void accelarator() {
		System.out.println("Acccelarator");
	}

	public static void main(String[] args) {
		Car obj=new Car();
		obj.accelarator();
		obj.applyBreak();
		obj.soundHorn();
		
		
	}
}

