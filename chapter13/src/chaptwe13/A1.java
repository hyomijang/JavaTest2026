package chaptwe13;

public class A1 {
	//멤버변수
	public C c = new C() {
		
		@Override
		public void bcd() {
			System.out.println("이너 다형성구현");
			
		}
	};
//	//멤버 이너클래스
//	public class B implements C{
//
//		@Override
//		public void bcd() {
//			System.out.println("이너 다형성구현");
//			
//		}
//		
//		
//	}
	//메서드 함수
	public void abc() {
		c.bcd();
	}
	
}
