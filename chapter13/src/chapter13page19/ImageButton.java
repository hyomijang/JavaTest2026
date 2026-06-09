package chapter13page19;

public class ImageButton {
	//인터페이스 설계(이벤트 처리방법)
	
	 private OnDragListener odc;
	static interface OnDragListener{
		public abstract void onDrag();
	}
	public void setOnDragListener(OnDragListener odc) {
		this.odc = odc;
	}

	public void Drag() {
		this.odc.onDrag();
	}
	
	
}
