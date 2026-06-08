package chapter10.practice01;

public class Student extends Human{
	@SuppressWarnings("unused")
	private int studentId;
	
//	public Student() {
//		this(0, null, 0);	
//	}

	public Student(int studentId, String name, int age) {
		super(name, age);
		this.studentId = studentId;
	}

	void goToSchool() {}
}
