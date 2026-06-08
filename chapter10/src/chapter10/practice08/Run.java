package chapter10.practice08;

public class Run {

	public static void main(String[] args) {
		A a1 = new A(30, "철수"); 
		A a2 = new A(30, "철수");
		
		System.out.printf("a1 = %s\n", a1.toString());
		System.out.printf("a2 = %s\n", a2.toString());
		
		if(a1.equals(a2)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		
		
		
		
	}

}
