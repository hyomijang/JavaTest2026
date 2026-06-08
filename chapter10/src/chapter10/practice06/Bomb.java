package chapter10.practice06;

public class Bomb {
	
	int m = 1;
	public static int sm = 2;
	
	public void bomb() {
		System.out.println("Bomb 폭탄이 터집니다");
	}
	
	public static void sbomb() {
		System.out.println("Bomb : 정적맴버함수");
	}
}
