package chapter14.page16;

import java.util.Scanner;

public class A implements AutoCloseable{
	//멤변
	
	private String name;
	private Scanner scan; 
	//생성자
	public A() {
		this(null);
	}
	
	public A(String name) {
		super();
		name = new String(name);
		this.scan = new Scanner (System.in);
	}
	//멤버함수 (get,set,function,override(hashCode, equals,toString))
	public void inputname() throws Exception {
		System.out.println("name>>");
		this.name = scan.nextLine();
	}

	public String getName() {
		return this.name;
	}
	
	

	@Override
	public void close() throws Exception {
	if(this.scan != null) {
		this.scan.close();
	}	
	System.out.println("Auto close.");
	}



}
