package week1.Day2;

public class StudentReport {
	String studentName = "saru";
	int studentID = 23;
	char initial = 'v';
	boolean regularStudent = true;
	long phoneNumber = 32323224;
	float cgp = 80.5f;
	double overAllpercentage = 32434.54545;

	public void studentMark() {
		int age=32;
		System.out.println(age);
	}

	public static void main(String[] args) {
		StudentReport stu=new StudentReport();
		System.out.println(stu.studentID);
		System.out.println(stu.initial);
	}
}
