package page08.control;

import page08.BookVO;

import 
public class BookController {
	//데이타 베이스 자료를 가져온다.
	private BookVO[] bArr;
	
	public BookController () {
		bArr =new BookVO[5];
		bArr[0] = new BookVO("자바정석","it",45);
		bArr[1] = new BookVO("혼공 c 언어","it",15);
		bArr[2] = new BookVO("피프티피플","소설",50);
		bArr[3] = new BookVO("꿈벡화점","소설",35);
		bArr[4] = new BookVO("삼국지","역사",10);
		
	}
	//책 정보출력
	public BookVO[] printBook() {
		return bArr;
	}
	//rentCount 합계
	public int sunRentCount() {
		int sum =0;
		for (int i = 0; i < bArr.length; i++) {
			sum +=bArr[i].getRentCount();
		}
		return 0;
	}
	//총계와 평균값을 double[]
	public double[] avgRentCount() {
		double[] sumAndAvg = new double[2];
		sumAndAvg[0] = (double)sumRentCount();
		sumAndAvg[1] = (double)sumRentCount()/ bArr.length;
		return sumAndAvg;
	}
		
	
	
	
}
