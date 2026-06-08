package chapter11.practice01;


//추상클래스 => 일반클래스+추상1 (self new 불가): 맴버함수중에 1개이상 추상 메서드 존해해야함
//
public abstract class Animal extends Object{
	@SuppressWarnings("unused")
	private int price;
	@SuppressWarnings("unused")
	private String name;
	
	public Animal() {
		this(0, null);
	}

	public Animal(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	public abstract void cry();
	
	
	
}
