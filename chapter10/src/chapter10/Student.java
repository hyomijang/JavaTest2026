package chapter10;

public class Student extends Human{
	//멤버변수[부모 (이름 나이) 학번]
	//String name; // 부모것 사용
	//int age; // 부모것 사용
	int studentID;

	//생성자 - 디생,매생
	//자식 : 부모생성자를 책임져야한다.
	//public Student() {
	//	this(0, null, 0);
	//}
	public Student(int studentID, String name, int age) {
		super(name, age);
		this.studentID = studentID;
	}

	//멤버함수 - : 등교하기
	public void gotoSchool() {
		System.out.println("Student등교하기");
		System.out.printf("stuID=%d, name=%s, age=%s\n", studentID, this.getName(), this.getAge());
	}
	
}
