package chapter14.page20;

public class A {
	//멤버변수 (인스턴스,정적,상수,인스턴스(클래스),정적(클래스),정적인터페이스)
	//생성자(디생,매생 ->this)

	public A() {}
	//멤버함수
	public void abc() {
		bcd();
	}
	public void bcd()  {
	//반복문을 실행하다가 0.5초식 정지했다가 실행하는 로직구현
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("what");
		}
	}
}
