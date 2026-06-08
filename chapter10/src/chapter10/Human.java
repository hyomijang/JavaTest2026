package chapter10;

//Human 클래스(Student, Worker)
public class Human {
	//멤버변수 - 공통 : 이름 나이
	private String name; //private 상속불가 - get set 함수로 접근
	private int age; //private 상속불가 - get set 함수로 접근
	//String name;
	//int age;
	
	//생성자 - 디생,매생
	//public Human() {
	//	this(null, 0);
	//}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//멤버함수 - get set
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}

	//멤버함수 - method print : 먹기 잠자기
	public void eat() {
		System.out.printf("Human먹기");
		System.out.printf("stuID=(출력x), name=%s, age=%s\n", name, age);
	}
	public void sleep() {
		System.out.printf("Human잠자기");
		System.out.printf("stuID=(출력x), name=%s, age=%s\n", name, age);

	}
	
}
