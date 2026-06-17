package chapter15.practice02.controller;

import chapter15.practice02.model.Book;

public class BookController {
	//
	private Book[] bArr;
	private static final int COUNT = 5;
	private static final int CUT_LINE = 30;

	public BookController() {
		bArr = new Book[COUNT];
		bArr[0] = new Book("자바", "소설", 45);
		bArr[1] = new Book("자바", "소설", 35);
		bArr[2] = new Book("자바", "소설", 00);
		bArr[3] = new Book("자바", "소설", 50);
		bArr[4] = new Book("자바", "소설", 70);
	}

	public Book[] printBook() {
		return bArr;
	}

	public int sumRent() {
		int sum = 0;
		for (Book book : bArr) {
			sum += book.getRentCount();
		}
		return sum;
	}

	public double[] avgRent() {
		double[] avgArr = new double[2];
		avgArr[0] = (double) sumRent();
		avgArr[1] = (double) sumRent() / COUNT;
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
			String bs = (book.getRentCount() >= CUT_LINE) ? ("Best Seller") : ("NomalSeller");
		}
		return bArr;
	}

	public Book bookseach(String title) {
		Book findbook = null;

		for (Book book : bArr) {
			if (book != null && book.getTitle() != null) {
				if (book.getTitle().contains(title) == true) {
					findbook = book;
					break;
				}
			}
		}
		return findbook;
	}
}
