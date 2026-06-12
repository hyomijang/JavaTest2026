package chapter15.page32;

public class Run {
	
	public static void main(String[] args) {
		//1.공유객체를 만든다.
		MyData myData = new MyData(3);
		//2.스레드 1을 만들고 진행
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();

		//3.스레드 2를 만들고 진행
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
		
	}

}
