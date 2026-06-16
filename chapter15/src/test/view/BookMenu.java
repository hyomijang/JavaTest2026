package test.view;

import java.util.Scanner;

import test.control.BookController;
import test.model.Book;

public class BookMenu {
	static BookController bcm = new BookController();

	public static void main(String[] args) {
		 Scanner scan2 = new Scanner(System.in);

		boolean exitFlag = false;
		while (!exitFlag) {
			System.out.println("도서 메뉴 : 1.도서정보출력 , 2.대여통계출력 , 3.도서등급판별,4.종료");
			System.out.print(">>");
			int no = Integer.parseInt(scan2.nextLine());
			switch (no) {
			case 1:
				System.out.println("========== 도서 정보 출력 ==========");
				printbook();
				break;
			case 2:
				System.out.println("========== 대여 통계 출력 ==========");
				avgRentCount();

				break;
			case 3:
				System.out.println("========== 도서 등급 판별 ==========");
				bookRank();
				break;
			case 4:
				System.out.println("========== 추천 도서 ==========");
				bookGrade();

				break;

			case 5:
				System.out.println("종료합니다.");
				exitFlag = true;
				break;

			default:
				System.out.println("잘못된 입력값입니다.");
				break;
			}

		}
		if (scan2 != null) {
			scan2.close();
		}
		System.out.println("end");
	}

	private static void bookGrade() {
		Book[] bArr = bcm.bookGrade();
		for (int i = 0; i < bArr.length; i++) {
			System.out.println(bArr[i].toString()+bArr[i].getGrade());
		}
	}

	private static void bookRank() {
		Book[] bArr = bcm.bookRank();
		for (int i = 0; i < bArr.length; i++) {
			System.out.println(bArr[i].toString());
		}
	}

	private static void avgRentCount() {
		double[] bca = bcm.avgRentCount();
		System.out.printf("전체 도서 대여 횟수 합계 :%d \n",(int)bca[0]);
		System.out.printf("전체 도서 대여 횟수 평균 :%f \n",bca[1]);
	}

	private static void printbook() {
		Book[] bArr = bcm.printbook();
		for (int i = 0; i < bArr.length; i++) {
			System.out.println(bArr[i].toString());
		}
	}

}
