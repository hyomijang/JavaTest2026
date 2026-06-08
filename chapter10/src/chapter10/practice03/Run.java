package chapter10.practice03;

public class Run {

	public static void main(String[] args) {
		//자식객체를 만들어서 자기멤버와 자기함수접근
		B b = new B(3, 4);
		// b객체 멤버변수
		System.out.printf("b.n = %d\n", b.n);
		System.out.printf("부모m b.m = %d\n", b.m);
//		System.out.printf("b.m = %d\n", b.m);
		System.out.println("==============");
		
		// b객체 멤버함수
		b.bcd();
		b.abc();
		System.out.printf("%s\n", "=".repeat(20));
		
		// 부모객체생성 자식객체번지 할당 (부모 = 모든자식번지)(auto upcasting)
		A a = new B(3, 4);
		//System.out.printf("자식n a.n = %d\n", a.n);
		System.out.printf("부모m b.m = %d\n", a.m);
		
		// a객체 멤버함수
		// a.bcd();
		a.abc();
		
		//다운캐스팅 ( 자식객체참조변수 = (자식)부모객체 ) 50%확률
		A a1 = new A(10);
		if (a1 instanceof B) {
			//System.out.printf("B b2 = (B)a // b2.n = %d\n", a.n);
			B b2 = (B)a;
			System.out.printf("B b2 = (B)a // b2.n = %d\n", b2.n);
		} else {
			System.out.println("부모객체번지에는 자식객체영역이 없다");
		}
		
	}

}
