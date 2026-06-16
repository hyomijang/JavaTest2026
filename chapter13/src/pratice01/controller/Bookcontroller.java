package pratice01.controller;

import practice01.model.Book;
//북 배열 만들기
// 스테딕 파이널 상수값

public class Bookcontroller {
	private Book[] bArr;
	public static final int CUT_LINE;
	public static final int BOOK_COUNT;
	static {
		CUT_LINE = 30;
		BOOK_COUNT = 5;
	}
//배열값 + 책 최대값주기
	public Bookcontroller() {
		bArr = new Book[BOOK_COUNT];
		bArr[0] = new Book("자바정석", "it", 45);
		bArr[1] = new Book("혼공 c 언어", "it", 15);
		bArr[2] = new Book("피프티피플", "소설", 50);
		bArr[3] = new Book("꿈벡화점", "소설", 35);
		bArr[4] = new Book("삼국지", "역사", 10);
	}
//함수 프린트 만들기 /리턴 배열
	public Book[] printBook() {
		return bArr;
	}
//총 대여 합계 합수 만들기 //바구니 인트 만들기 
//포문 사용해서 배열값 불러오기 바구니 합산 리턴값주기.	
	public int sumRentCount() {
		int sum = 0;
		for (Book book : bArr) {
			sum += book.getRentCount();
		}
		return sum;
	}
//대여 평균값 구하는 함수 만들기 (정수가 아니니 더블 쓸것)
//퍼블릭 더블 배열 함수명//더블배열 객체 선언
//[0]합산 수 [1] 합산대여수 /최대상수값 리턴 값으로 배열 돌려줄것.	
	
	// [0] 합계 [1] 평균
	public double[] avgRentCount() {
		double[] sumAvgArr = new double[2];
		sumAvgArr[0] = sumRentCount();
		sumAvgArr[1] = sumAvgArr[0] / BOOK_COUNT;
		return sumAvgArr;
	}

// 도서 대여 카운트 중심으로 내림차순으로 정렬하시오
// 원본을 사용해서 정렬하는 방법으로 처리한다.
// 정렬함수 만들기 // 포문으로 J I 비교하교 이프문으로 버퍼로 값을 옮겨 리턴값으로 배열줄것.
	
	public Book[] bookRank() {
		for (int j = 0; j < bArr.length - 1; j++) {
			for (int i = j; i < bArr.length; i++) {
				if (bArr[j].getRentCount() < bArr[i].getRentCount()) {
					Book buffer = bArr[j];
					bArr[j] = bArr[i];
					bArr[i] = buffer;
				}
			}

		}
		return bArr;
	}
}
