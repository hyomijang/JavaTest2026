package chapter10.practice04;

public class Run {

	public static void main(String[] args) {
		A a = new A();
		a.print();
		
		B b = new B();
		b.print();
		
		System.out.println("================");
		A a1 = new B();
		a1.print();
	}

}
