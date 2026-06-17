package test2.control;

import test2.model.Book;

public class BookController {
	private Book[] bArr;
	public static final int CUT_LINE = 30;
	public static final int BOOK_COUNT = 5;

	public BookController() {
		bArr = new Book[BOOK_COUNT];
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
