package chapter13page19;

import chapter13page19.A.B;

public class Run {

	public static void main(String[] args) {
		// 내부에있는 interface를 사용해보자
		
//		A a = new A;
		A.B b = new A.B() {
			
			@Override
			public void bcd() {
				System.out.println("다형성 구현");
			}
		};
		b.bcd();
		//====================================
		C c = new C();
		//부자관계
		A.B b2 = c;
		b2.bcd();
		
		//이미지 버튼을 이벤트 핸들러 등록 처리까지 진행
		ImageButton ib = new ImageButton();
		ib.setOnDragListener(new ImageButton.OnDragListener() {
			
			@Override
			public void onDrag() {
				System.out.println("이미지 처리완료");
			}
		});
		ib.Drag();
	}
	

}
