package test.control;

import test.model.Book;

public class BookController {
	// Book book = new Book();
	Book[] bArr;
	public static final int CUT_LINE = 30;
	public static final int BOOK_COUNT = 5;

	public BookController() {
		// Book[] = new [BOOK_COUNT];
		bArr = new Book[BOOK_COUNT];
		bArr[0] = new Book("자바의 정석", "it", 45);
		bArr[1] = new Book("혼공 c언어", "it", 15);
		bArr[2] = new Book("피프티 피플", "소설", 50);
		bArr[3] = new Book("꿈 백화점", "소설", 35);
		bArr[4] = new Book("삼국지", "역사", 10);
	}

	public Book[] printbook() {
		return bArr;
	}

	// 반복문
	public int sumRentCount() {
		int sum = 0;
		for (int i = 0; i < bArr.length; i++) {
			sum += bArr[i].getRentCount();
		}
		// sum = sum + getRentCount();
		return sum;
	}

	public double[] avgRentCount() {
		// double arc [] = new double[2];
		double[] arc = new double[2];
		arc[0] = sumRentCount();
		arc[1] = sumRentCount() / (double) BOOK_COUNT;
		return arc;
	}

	public Book[] bookRank() {
		// int buffer = 0;
		for (int i = 0; i < bArr.length-1; i++) {
			for (int j = i; j < bArr.length; j++) {
				if(bArr[i].getRentCount()<bArr[j].getRentCount()) {
					Book  buffer = bArr[i];
					//buffer = bArr[i];
					bArr[i] = bArr[j];
					bArr[j] = buffer;
				}
			}
		}
		return bArr;		
	 }

		public Book[] bookGrade() {
			for (int i = 0; i < bArr.length; i++) {
				if(bArr[i].getRentCount()> CUT_LINE) {
					bArr[i].setGrade("bestseller.");
				}
			}
			return bArr;
		}

}

//if(bArr>CUT_LINE)?(System.out.println("(Best Seller)");):(System.out.println("(nomal Seller)");