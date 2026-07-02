package test.singleton;

public class Run {

	public static void main(String[] args) {
		// 싱글톤을  이용해서 객체를 만들어서 활용

		//Singleton st = new Singleton();
		Singleton st = Singleton.getSingleton();
		

}
}