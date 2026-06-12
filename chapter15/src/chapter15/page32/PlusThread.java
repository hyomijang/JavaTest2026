package chapter15.page32;

public class PlusThread extends Thread {
	
	private MyData myData;
	
	public PlusThread(MyData myData) {
		this.myData = myData;
	}



	@Override
	public void run() {
		myData.plusData();
		System.out.printf(
				"실행결과: %d",myData.getData());

	}
	
	
}
