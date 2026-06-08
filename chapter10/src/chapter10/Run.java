package chapter10;

public class Run {

	public static void main(String[] args) {
		//자식 객체 생성
		Student stu1 = new Student(1100, "홍길동", 24);
		//자식 맴버 변수
		System.out.printf("stu1.stuID = %s\n", stu1.studentID);
		System.out.printf("stu1.age = %s\n", stu1.getAge());
		System.out.printf("stu1.name = %s\n", stu1.getName());

		System.out.println("The end");
	}

}
