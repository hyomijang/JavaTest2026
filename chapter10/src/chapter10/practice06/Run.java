package chapter10.practice06;

public class Run {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		//bomb 객제 만들기
//		Bomb b0 = new Bomb();
//		b1.bomb();
//		
//		Bomb b1 = new Car();
//		b2.bomb();
		
		//오버라이딩
		Bomb[] bArray = new Bomb[] {new Car(), new Tree(), new House(), new Building()};
		
		for (int i = 0; i < bArray.length; i++) {
			bArray[i].bomb();
//			Thread.sleep(1000);
		}
		
		//멤버변수를 부모객체로 진입 - 자식객체 / 부모객체.m
		
		Bomb b2 = new House();	
		System.out.printf("b3.m = %d\n", ((House)b2).m);
		b2.bomb();
		
		//정적맴버변수 상속시 접근방법
		Bomb b3 = new Bomb();
		System.out.println(b3.sm);
		System.out.println(Bomb.sm);

		House h1 = new House();
		System.out.printf("%s\n", "=".repeat(20));
		System.out.println(h1.sm);
		System.out.println(House.sm);

		System.out.printf("%s\n", "=".repeat(20));
		Bomb b4 = new Bomb();
		b4.sbomb();
		Bomb.sbomb();
		
		System.out.printf("%s\n", "=".repeat(20));
		House h2 = new House();
		h2.sbomb();
		House.sbomb();
		
		System.out.printf("%s\n", "=".repeat(20));
		Bomb b5 = new House();
		b5.sbomb();
		((House)b5).sbomb();
		

		
	}

}
