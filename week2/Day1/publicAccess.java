package week2.Day1;

public class publicAccess {
	public void accesslevel() {
		System.out.println("this is from public access");
	}

	private void privateAccess1() {
		System.out.println("this is from private access");
	}

	protected void protectedpulic() {
		System.out.println("this is from protected access");
	}
	void defaultAccess() {
		System.out.println("this is default");
	}

	public static void main(String[] args) {
		publicAccess pb = new publicAccess();
		pb.accesslevel();
		pb.privateAccess1();
		pb.protectedpulic();
		pb.defaultAccess();
	}
}
