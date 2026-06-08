package chapter10.practice07;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new A();
		//System.out.printf("a.toString() = %s\n", a.toString());

		Object o = new A();
		System.out.printf("a.toString() = %s\n", o.toString());
		
		//문자열 비교
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = new String("홍길동");
		System.out.printf("String name1 = %d\n", System.identityHashCode(name1));
		System.out.printf("String name2 = %d\n", System.identityHashCode(name2));
		System.out.printf("String name3 = %d\n", System.identityHashCode(name3));

		
		if(name1.equals(name3)) {
			System.out.println("내용이 같음");
		}
		else {
			System.out.println("내용이 다름");
		}
		
		
	}

}
