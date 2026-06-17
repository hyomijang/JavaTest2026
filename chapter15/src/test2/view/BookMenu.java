package test2.view;

import java.util.concurrent.BrokenBarrierException;

import test2.control.BookController;
import test2.model.Book;
import test2.run.Run;

public class BookMenu {
	Book bk = new Book();
	BookController bc = new BookController();

	public void bookDisplay() {

		boolean exitFlag = false;
		while (!exitFlag) {
			System.out.println("1.정보출력,2.합산,3.평균,4.등급판별,5.정렬,6.검색,7.home");
			int no = Integer.parseInt(Run.scan.nextLine());
			switch (no) {
			case 1:
				System.out.println("========== 도서 정보 출력 ==========");
				printBook();
				break;
			case 2:
				System.out.println("========== 대여 합산 출력 ==========");
				sumRentCount();
				break;
			case 3:
				System.out.println("========== 대여 평균 출력 ==========");
				avgRentCount();
				break;
			case 4:
				System.out.println("========== 등급판별 ==========");
				bookseller();
				break;
			case 5:
				System.out.println("========== 정렬 ==========");
				bookRank();
				break;
			case 6:
				System.out.println("========== 검색 ==========");
				bookSeach();
				break;
			case 7:
				System.out.println("========== 메인화면으로 돌아갑니다 ==========");
				exitFlag = true;
				break;

			default:
				System.out.println("잘못 입력하셨습니다 재입력 부탁드립니다.");
				break;
			}
		}
	}

	private void bookseller() {
		Book[] seller = bc.bookSeller();
		for (Book book : seller) {
			if (book != null) {
				System.out.printf("도서명: %s || 등급 :%s \n",book.getTitle(),book.getBmSeller());

			}
		}
	}

	private void printBook() {
		Book[] book = bc.printBook();
		for (Book book2 : book) {
			System.out.println(book2.toString());
		}
	}

	private void sumRentCount() {
		int sum = bc.sumRentCount();
		System.out.printf("총 대여수 :%d \n", sum);
	}

	private void avgRentCount() {
		double[] avgArr = bc.avgRentCount();
		System.out.printf("총 대여수 평균 :%5.1f \n", avgArr[1]);
	}

	private void bookRank() {
		Book[] bookRank = bc.bookRank();
		for (Book book : bookRank) {
			System.out.println(book.toString());
		}
	}

	private void bookSeach() {
		System.out.println("검색하실 책을 입력해주세요");
		String title = Run.scan.nextLine();
		Book bo = bc.bookSeach(title);
		if (bo == null) {
			System.out.println("책을 찾을 수 없습니다.\n");
		} else {
			System.out.printf("%s \n", bo.toString());

		}

	}

}
