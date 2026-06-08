package chapter09.valuable;

public class A {
	//멤버변수 - 인스턴트변수 힙영역 , 정적변수 클래스변수 클래스
	@SuppressWarnings("unused")
	private int a;
	public static int b;
	//생성자 (디폴트 매개변수 오버로딩 인스턴트멤버변수 초기화) -> new 일때 생성
	//정적멤버 변수 초기화 (정적블록영역) -> 클래스가 로더될때 실행
	static { 
		//a = 10;
		A.b = 10; 
		System.out.printf("A 클래스의 정적블록 초기화 %d\n", A.b);
	}
	//맴버함수(인스턴스 함수, 정적함수: 기능 get set 출력)
	//오버로딩 시그너처
	public void abc() {
		//A.a = 30; // 사용불가능
		this.a = 30;
		//this.b = 30; // 사용하지 말것
		A.b = 30; // 클래스 변수 이므로 이쪽 방법을 사용
		A.bcd();
	}
	public static void bcd() {
		//this.a = 10;
		A.b = 30;
		//abc(); 객체생성을 안했기떄문에 호출 불가
	}
	
}
