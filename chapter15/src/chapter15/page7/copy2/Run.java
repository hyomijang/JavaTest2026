package chapter15.page7.copy2;

import java.awt.Toolkit;

public class Run {
	// 메인 스레드
	public static void main(String[] args) throws InterruptedException { // 1. throws Exception 추가
		// 두가지 일을 동시에 진행하려고 한다.
		// 사운드 기능을 작동(1초마다 사운드를 발생, 5번 발생)
		// 숫자를 출력한다 (1~5까지)
		// 사운드 클래스
		// 임시객체로 만들어서 바로 실행하고 바로 제거한다.
		// PrintNumber2 pn2 = new PrintNumber2();
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("띵");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}

				}
			}
		});

		// ToolKitTread2 tt2 = new ToolKitTread2();
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit tk = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					tk.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		thread.start();
		thread.setName("스레드");
		thread2.start();
		thread2.setName("스레드2");
		
		//현재 작동되고 있는 스레드 수
		System.out.printf("현쟈 작동되고 있는 스레드 수 : %d \n",Thread.activeCount());
		//현재 작동되고 있는 스레드 이름
		System.out.printf("현쟈 작동되고 있는 스레드 이름 : %s \n", thread.getName());
		System.out.printf("현쟈 작동되고 있는 스레드 이름 : %s \n", thread2.getName());
		System.out.printf("스레드의 우선순위는? : %d \n",thread.getPriority());
		System.out.printf("스레드2의 우선순위는? : %d \n",thread2.getPriority());
	}
}
