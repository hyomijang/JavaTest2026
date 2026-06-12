package chapter15.page48;

import java.util.Iterator;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		//사용자가 정의한 스레드를 두개를 만든다.
		//모두 데몬 스레드다
		//사용자가 스레드 이름 부여한다
		//사용자가 한쪽 스레드 yield 진행하고 다른쪽 스레드 실행
		MyThread t1 = new MyThread();
		t1.setName("스레드 1");
		t1.setDaemon(true);
		t1.yieldFlag = false;
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("스레드 1");
		t2.setDaemon(true);
		t2.yieldFlag = true;
		t2.start();
		
		//메인 스레드는 5초 timeSleep
		//Thread.sleep(5000);
		//메인 스레드 6번 동안 두개의 스레드를 1초식 진행하고 양보하고 조절진행.
		for (int i = 0; i < 6; i++) {
			t1.yieldFlag = !t1.yieldFlag;
			t2.yieldFlag = !t2.yieldFlag;
			Thread.sleep(1000);
		}
		System.out.println("main out");
		
	}
}
