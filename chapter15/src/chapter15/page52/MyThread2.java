package chapter15.page52;

//멤버변수 MyThread1 생성 (2-1 협업진행)
public class MyThread2 extends Thread{
	public MyThread1 mt1;
	
	public MyThread2(MyThread1 mt1) {
		this.mt1 = mt1;
	}

	@Override
	public void run() {
		//mt1 > mt2 join요청
		try {
			mt1.join(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//mt1 의 자료를받고 mt2 진행 
		for (long i = 0; i < Long.MAX_VALUE; i++){
			
		}
	}

}
