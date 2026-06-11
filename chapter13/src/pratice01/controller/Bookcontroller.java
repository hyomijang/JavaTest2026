package pratice01.controller;

import practice01.model.Book;

public class Bookcontroller {
	private Book[] bArr;
	public static final int CUT_LINE;
	public static final int BOOK_COUNT;
	static {
		CUT_LINE = 30;
		BOOK_COUNT = 5;
	}

	public Bookcontroller() {
		bArr = new Book[BOOK_COUNT];
		bArr[0] = new Book("자바정석", "it", 45);
		bArr[1] = new Book("혼공 c 언어", "it", 15);
		bArr[2] = new Book("피프티피플", "소설", 50);
		bArr[3] = new Book("꿈벡화점", "소설", 35);
		bArr[4] = new Book("삼국지", "역사", 10);
	}

	public Book[] printBook() {
		return bArr;
	}

	public int sumRentCount() {
		int sum = 0;
		for (Book book : bArr) {
			sum += book.getRentCount();
		}
		return sum;
	}

	// [0] 합계 [1] 평균
	public double[] avgRentCount() {
		double[] sumAvgArr = new double[2];
		sumAvgArr[0] = sumRentCount();
		sumAvgArr[1] = sumAvgArr[0] / BOOK_COUNT;
		return sumAvgArr;
	}

	// 도서 대여 카운트 중심으로 내림차순으로 정렬하시오
	// 원본을 사용해서 정렬하는 방법으로 처리한다.
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
