package test2.control;

import test2.model.Book;

public class BookController {
	private Book[] bArr;
	private Book[] cbArr;
	public static final int CUT_LINE = 30;
	public static final int BOOK_COUNT = 5;

	public BookController() {
		bArr = new Book[BOOK_COUNT];
		cbArr = new Book[BOOK_COUNT];
	}

	public void insertBook() {
		bArr[0] = new Book("자바의 정석", "it", 45);
		bArr[1] = new Book("혼공 C언어", "it", 15);
		bArr[2] = new Book("피프티 피플", "소설", 50);
		bArr[3] = new Book("꿈 백화점", "소설", 35);
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

	public double[] avgRentCount() {
		double[] avgArr = new double[2];
		avgArr[0] = (double) sumRentCount();
		avgArr[1] = (double) sumRentCount() / BOOK_COUNT;
		return avgArr;
	}

	// 깊은복사복으로 만들기
	public Book[] bookRank() {
		for (int q = 0; q < bArr.length; q++) {
			if(bArr != null) {
			cbArr[q] = new Book(cbArr[q]);

		for (int j = 0; j < cbArr.length - 1; j++) {
			for (int i = j; i < cbArr.length; i++) {
				if (cbArr[j].getRentCount() < cbArr[i].getRentCount()) {
					Book buffer = cbArr[j];
					cbArr[j] = cbArr[i];
					cbArr[i] = buffer;
					
				}
				}
				}
			}
		}
		return cbArr;
	}

	public Book[] bookSeller() {
		for (Book book : bArr) {
			String mesege = (book.getRentCount() >= CUT_LINE) ? ("best seller") : ("nomal seller");
			book.setBmSeller(mesege);
		}
		return bArr;
	}

	public Book bookSeach(String title) {
		Book findseach = null;
		for (Book book : bArr) {
			if (book.getTitle().contains(title) == true) {
				findseach = book;
				break;
			}
		}
		return findseach;
	}
}
