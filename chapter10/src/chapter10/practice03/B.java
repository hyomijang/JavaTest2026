package chapter10.practice03;

public class B extends A {
	//멤버변수
	int n = 4;
	//생성자
	public B(int m, int n) {
		super(m);
		this.n = n;
	}
	//멤버함수
	public void bcd() {
		System.out.println("B 클래스 함수");
	}
	
}
