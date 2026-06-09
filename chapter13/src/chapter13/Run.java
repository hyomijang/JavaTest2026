package chapter13;

public class Run extends A {
	public static void main(String[] args) {
		A aobj = new A();
		System.out.println(aobj.a);
		
		A.B bobj = aobj.new B();
		bobj.bcd();
		
		/*
		 * A. cobj = aobj.new A C(); cobj.bcd();
		 */
	}
	//인스턴스 내부클래스 B사용하려고 한다.
	//인스턴스 멤버변수를 a,b,c,d사용하려고 한다.
	
}