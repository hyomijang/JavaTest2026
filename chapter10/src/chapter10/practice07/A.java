package chapter10.practice07;

public class A {
	int a;

		
	public A() {
		this(0);
	}

	public A(int a) {
		super();
		this.a = a;
		System.out.println("A 생성자");
	}

	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}

	
}
