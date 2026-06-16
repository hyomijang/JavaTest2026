package practice.view;

import practice.control.Bookcontroller;
import practice.model.Book;
import practice.run.Run;

public class BookMenu {
	private Bookcontroller bc = new Bookcontroller();
	public Book book = new Book();

	public void bookDisplay() {

		boolean exitFlag = false;
		while (!exitFlag) {
			;
			System.out.println("1.정보입력,2.책정보출력,3.정렬,4.총대여수 ,5.대여수와 평균,6.검색 , 7.home");
			System.out.print(">>");
			int no = Integer.parseInt(Run.scan.nextLine());
			switch (no) {

			case 1:
				System.out.println("========== 도서 정보 입력 ==========");
				insertbook();

				break;

			case 2:
				System.out.println("========== 도서 정보 출력 ==========");
				selectbook();

				break;
			case 3:
				System.out.println("========== 대여 통계 출력 ==========");
				sortbook();
				break;
			case 4:
				System.out.println("========== 도서 등급 판별 ==========");
				sumRentCount();
				break;

			case 5:
				System.out.println("========== 책 정보 대여수 , 평균 ==========");
				sumAvg();
				break;
			case 6:
				System.out.println("========== 도서 정보 페이지 종료 ==========");
				seachBookTitle();
				break;
			case 7:
				System.out.println("========== 도서 정보 페이지 종료 ==========");
				exitFlag = true;

			default:
				System.out.println("잘못된 입력값입니다.");
				break;

			}
		}

	}

	private void sumAvg() {
		double[] sumAvgArr = bc.sumAvg();
		System.out.printf("총 대여수 : %f \n", sumAvgArr[0]);
		System.out.printf("총 대여수 평균: %f \n", sumAvgArr[1]);
	}

	private void sumRentCount() {
		int sum = bc.sumRentCount();
		System.out.printf("총 대여수 : %d \n", sum);
	}

	private void sortbook() {
		Book[] bArr = bc.sortBook();
		for (Book book : bArr) {
			System.out.println(book.toString());
		}
	}

	private void insertbook() {
		bc.insertBook();
	}

	private void selectbook() {
		Book[] bArr = bc.selectBook();
		for (Book book : bArr) {
			System.out.println(book.toString());
		}
	}

	private void seachBookTitle() {
		System.out.println("검색할 책 제목입력 >>");
		String title = Run.scan.nextLine();
		
		Book book = bc.seachBookTitle(title);
		if(book != null) {
			System.out.printf("책제목: %s 찾았습니다. \n 책정보: %s \n",title,book.toString());
		}else {
			System.out.printf("책제목: %s 없습니다.\n ",title);
		}
	}
}
