package chapter10.practice01;

public class Worker extends Human{
	@SuppressWarnings("unused")
	private int workerID;
		
//	public Worker() {
//		this(0, null, 0);
//	}
	
	public Worker(int workerID, String name, int age) {
		super(name, age);
		this.workerID = workerID;
	}

	void goToWork() {}
}
