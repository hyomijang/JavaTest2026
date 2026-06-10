package view;

/*import java.awt.print.Book;*/

import page08.BookVO;
import page08.control.BookController;

public class BookMenu {
	BookController bcm;

	public BookMenu() {
		bcm = new BookController();
		System.out.println("=======도서 정보 출력=======");

		BookVO[] books = bcm.printBook();
		for (BookVO book : books) {
			System.out.println(book.infrom());
		}

		System.out.println("=======대여 통계 출력=======");

		double[] sumAvg = bcm.avgRentCount();
		System.out.printf("전체 도서 대여 횟수 합계 : %d \n", (int) sumAvg[0]);
		System.out.printf("전체 도서 대여 횟수 평균 : %.1f \n", sumAvg[1]);

		
		System.out.println("=======도서 등급 판별=======");
		for (BookVO book : books) {
			if (book.getRentCount() > BookController.CUT_LINE) {
				System.out.printf("%s도서는 인기 도서(Best Seller)입니다. \n", book.getTitle());
			}else {
				System.out.printf("%s도서는 일반 도서입니다. \n", book.getTitle());
			}
		}
	}

}
