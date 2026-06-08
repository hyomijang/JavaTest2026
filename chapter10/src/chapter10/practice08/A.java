package chapter10.practice08;

public class A {
	private int age;
	private String name;
		
	public A() {
		this(0, null);
	}

	public A(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [age=" + age + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof A)) {
			System.out.printf("비교대상이 아님");
			return false;
		}
		A a = (A)obj;
		if (this.age == a.age && this.name.equals(a.name)) {
			return true;
		}
		return false;
					
	}
		
}
