package chapter10.practice01;

public class Human{
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int age;
		
//	public Human() {
//		this(null, 0);
//	}
		
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void eat() {}
	void sleep() {}

}
