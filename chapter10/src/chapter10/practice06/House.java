package chapter10.practice06;

public class House extends Bomb {
	int m = 3;
	public static int sm = 4;
	
	@Override
	public void bomb() {
		System.out.println("House 폭탄이 터집니다");
	}
	
	public static void sbomb() {
		System.out.println("House : 정적맴버함수");
	}
}
