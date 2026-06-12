package chapter15.page24;

public class Mythread extends Thread {

	@Override
	public void run() {
		// 5초간 일을 진행(계산하는)  스레드
		for (long i = 0L; i < 10_000_000_000_000L; i++) {
			
		}
		System.out.printf(" %s 스레드가 우선순위 : %d 일을 마침 \n",
				this.getName(),this.getPriority());
	}

}
