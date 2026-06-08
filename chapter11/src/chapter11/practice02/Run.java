package chapter11.practice02;

public class Run {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Animal animal = new Dog();
		animal.cry();
		
//		System.out.println(animal.COUNT);
		System.out.printf("%d", ((Dog)animal).COUNT);
		
	}

}
