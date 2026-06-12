package chapter15.page50;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		//내가 만든 스레드 작동
		MyThread mt = new MyThread();
		Thread th = new Thread(mt);
		th.start();
		
		
		//메인스레드를 0.1초동안 일시정지 및 상태점검.
		Thread.sleep(100);
		System.out.printf("state: %s ",th.getState());
		
		//내가 만든 스레드를 메인스레드에서 인터럽트 걸어준다.
		th.interrupt();
		Thread.sleep(100);
		
		//스레드 상태점검.
		System.out.printf("state: %s ",th.getState());
	}

}
