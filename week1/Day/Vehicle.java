package week1.Day;

public class Vehicle {

	public void braNd() {
		System.out.println("car Brands");
	}

	public void moDel() {
		System.out.println("luxury,budget");
	}

	public void priCe() {
		System.out.println("high level ,low level");
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		car.braNd();
		car.priCe();
	}
}
