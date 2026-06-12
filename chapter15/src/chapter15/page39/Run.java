package chapter15.page39;

public class Run {

	public static void main(String[] args) {
		// 공유객체
		MyData myData = new MyData();
		// 3개의 스레드를 만든다.(3번방식)
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				myData.abc("스레드");
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				myData.def("스레드 2");
			}
		});
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				myData.ghi("스레드 3");
			}
		});
		t1.start();
		t2.start();
		t3.start();

	}

}
