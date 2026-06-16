package practice.control;

import practice.model.Book;

public class Bookcontroller {
	// 1.book[]
	private Book[] bArr;
	private final int COUNT = 5;

	public Bookcontroller() {
		bArr = new Book[COUNT];
	}

	// 3.입력
	public void insertBook() {
		bArr[0] = new Book("자바정석", "it", 45);
		bArr[1] = new Book("혼공 c 언어", "it", 15);
		bArr[2] = new Book("피프티피플", "소설", 50);
		bArr[3] = new Book("꿈벡화점", "소설", 35);
		bArr[4] = new Book("삼국지", "역사", 10);
	}

	// 깊은 복사하기 생성자

	// 2.출력
	public Book[] selectBook() {
		return bArr;
	}

	// 4.정렬
	public Book[] sortBook() {
		// 1.새로운 Book[] 존재
		Book[] cbArr = new Book[COUNT];
		for (int i = 0; i < cbArr.length; i++) {
			cbArr[i] = new Book(bArr[i]);
		}
		// 5개 배열원소 [0] <[0] [0]<[1]
		for (int i = 0; i < cbArr.length - 1; i++) {
			for (int j = i; j < cbArr.length; j++) {
				if (cbArr[i].getRentCount() < cbArr[j].getRentCount()) {
					Book buffer = cbArr[i];
					cbArr[i] = cbArr[j];
					cbArr[j] = buffer;
				}
			}
		}
		return cbArr;
	}

	// 6.수정
	// 7.삭제
	// 7-1 검색
	public Book seachBookTitle(String title) {
		Book findBook = null;
		for (int i = 0; i < bArr.length; i++) {
			if (bArr[i].getTitle().contains(title) == true) {
				findBook = bArr[i];
				break;

			}
		}
		return findBook;

	}

	// 5.요청되는 계산
	public int sumRentCount() {
		int sum = 0;
		for (Book book : bArr) {
			sum += book.getRentCount();
		}
		return sum;
	}

	public double[] sumAvg() {
		double[] sumAvgArr = new double[2];
		sumAvgArr[0] = (double) sumRentCount();
		sumAvgArr[1] = sumRentCount() / COUNT;
		return sumAvgArr;
	}

}
