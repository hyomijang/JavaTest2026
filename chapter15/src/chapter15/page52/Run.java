package chapter15.page52;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		// 내가 만든 두개스레드 작동시킨다.
		//상태값 확인할것
		MyThread1 mt1 = new MyThread1();
		mt1.start();
		MyThread2 mt2 = new MyThread2(mt1);
		mt2.start();
		
		System.out.printf("state: %s \n",mt1.getState());
		System.out.printf("state: %s \n",mt2.getState());
		
		//메인스레드
		mt2.interrupt();
		Thread.sleep(100);
		
		System.out.printf("state: %s \n",mt1.getState());
		System.out.printf("state: %s \n",mt2.getState());
	}

}
