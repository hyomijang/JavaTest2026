package abc;

public class A {
	public int a;
	protected int b;
	int c;
	private int d;
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getD() {return d;}
	public void setD(int d) {this.d = d;}

	public void print1() {
		System.out.printf("a = %d\n", a);
		System.out.printf("b = %d\n", b);
		System.out.printf("c = %d\n", c);
		System.out.printf("d = %d\n", d);
	}

}

class B {
	public void print1() {
		A a1 = new A();
		a1.a = 10;
		a1.b = 10;
		a1.c = 10;
//		a1.d = 10;
		a1.print1();
	}
}



