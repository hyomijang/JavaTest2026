package chapter13page19;

public class A {
	//정적 interface 
	static interface B{
		//상수 , 추상 메소드
		public abstract void bcd();
	}
}


class C implements A.B{

	@Override
	public void bcd() {
		System.out.println("다형성 구현 2");
		
	}
	
	
}
