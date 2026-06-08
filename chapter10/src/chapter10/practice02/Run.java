package chapter10.practice02;

public class Run {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 부모객체참조변수 = 모든 자식의 번지를 저장한다.
		// 자식의 번지영역에서 (부모영역만 있으면 업캐스팅이 이루어진다)
		
		A a1 = new A();
		A a2 = (A)new B(); // upCasting 자동형변환
		int i = 20;
		double d = (double)i;
			
		A a3 = new C();
		A a4 = new D();
		
		B b1 = new B();
		B b2 = new C();
		B b3 = new D();
		//B b4 = new A(); 선언 불가
		double d2 = 56.75;
		int i2 = (int)d2;
		
		B b5 = (B)a2; // downCasting
		
		C c1 = new C();
		C c2 = (C)b2;
	}
}
