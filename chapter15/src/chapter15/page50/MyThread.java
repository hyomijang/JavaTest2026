package chapter15.page50;

public class MyThread implements Runnable{

	@Override
	public void run() {
		// 4초동안 일시정지.
		// 정지도중 intereupt 발생시 메세지,시간지현구현
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println(e.toString());
			for (long i = 0; i < 100000000; i++) {
				
			}
		}
	}

}
