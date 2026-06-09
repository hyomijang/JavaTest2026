package chapter13;

public class A {
	// 멤버변수(인변,정변,상수,상수,인클,정클)
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	static int sa = 350;

	// 멤버변수: 인스턴스 멤버클래스 =인스턴스멤버변수
	// 클래스 = 설계도 => 집
	class B {

	static class C {
		void bcd() {
			
			System.out.println(sa);
			outterFunc();
			
		}
	}

		public int a = 13;
		protected int b = 14;

		// 멤버변수
		// 생성자
		// 멤버함수(겟,셋,기능,출력,오버라이딩)
		void bcd() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			outterFunc();
		}
	}
	// =======================
	// 생성자 (클래스반복)

	public static void outterFunc() {
		System.out.println("바깥쪽 함수");
		
		int lb = 5;
		class Local{
			public void localBcd() {
				System.out.println("지역클래스");
				System.out.println(lb);
			}
		}
		Local local = new Local();
		local.localBcd();
	}
}
