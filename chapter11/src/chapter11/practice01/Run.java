package chapter11.practice01;

public class Run {

	public static void main(String[] args) {
		//Animal animal = new Animal();
		//다형성 부모객체배열 -> 자식객체번지저장
		//반복문
		
		Animal[] aArray = new Animal[] {new Cat(), new Dog()};
		
		for (int i = 0; i < aArray.length; i++) {
			aArray[i].cry();
		}
		
		Animal animal = new Animal() {
			@Override
			public void cry() {
				System.out.println("짹짹");
			}
		};
		
		animal.cry();
		
	}

}
