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
		Thread thread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("띵");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});

		// ToolKitTread2 tt2 = new ToolKitTread2();
		Thread thread2 = new Thread(() -> {
			Toolkit tk = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				tk.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});
		thread.start();
		thread2.start();
	}
}
