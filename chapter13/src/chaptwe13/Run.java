package chaptwe13;

public class Run {
	public static void main(String[] args) {
		B b = new B();
		b.bcd();
		C c = new B();
		c.bcd();
		//익명 클래스 //익명객체 //부//익명객체
		
		C c2 = new C() {
			
			@Override
			public void bcd() {
				System.out.println("부모로부터 구현된 다형성");
			}
			public void cde() {
				System.out.println("익명에서 사용자 정의 사용한 함수");
			}
		};
		
		c2.bcd();
		
		A1 a1 =new A1();
		a1.abc();
	}

}
