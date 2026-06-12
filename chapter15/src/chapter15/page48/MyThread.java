package chapter15.page48;

public class MyThread extends Thread{
	public  boolean exitFlag = false;
	public  boolean yieldFlag = false;
	@Override
	public void run() {
		//무한루프 도중 yield상태와 Runnable 상태 테스팅
		while(!exitFlag) {
			//조건에 따라 yield상태 실행상태를 진행한다
			if (yieldFlag) {
				Thread.yield();
			} else {
				System.out.printf("%s 스레드가 실행중 \n",this.getName());
				for (long i = 0; i < 100_000L; i++) {
					
				}
			}
			
		}//while end
	}//end of run
}
