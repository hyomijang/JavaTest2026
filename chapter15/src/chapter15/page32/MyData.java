package chapter15.page32;


//공유 객체
public class MyData {
	//멤버변수 6가지
	private int data;
	//생성자. 4가지

	public MyData() {
		this(0);
	}
	public MyData(int data) {
		super();
		this.data = data;
	}
	//멤버함수 6가지
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	//멤버함수(기능) 자기멤버변수에 +1 함수
	public void plusData(){
		synchronized (this) {
			int bufferData = this.data;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.data = bufferData +1;
			
			
		}
	}
	
	
	

}
