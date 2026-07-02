package test.singleton;

// 싱글톤(3가지 ->  생성자(private) ,(정적,private)멤버변수, (정적,private)멤버함수)
public class Singleton {
	private static Singleton singleton;

	private Singleton() {
		System.out.println("생성자");
	}
	
	public static Singleton getSingleton() {
		if(singleton == null) {
			singleton = new Singleton();
		
		}
		return singleton;
	}

	private void printAll() {
		System.out.println("싱글톤 함수");
	}
		
	
	

}
