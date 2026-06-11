package practice00.run;

import java.util.Scanner;

import practice00.view.BookMenu;

public class Run {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean exitFlag = false;
		while (!exitFlag) {
			System.out.println("1:도서 , 2:학생정보 , 3:건강 , 4:종료");
			int no = Integer.parseInt(scan.nextLine());
			switch (no) {
			case 1:
				BookMenu bm = new BookMenu();

				break;
			case 2:
				System.out.println("roading");
				break;
			case 3:
				System.out.println("roading");
				break;
			case 4:
				System.out.println("thx");
				exitFlag = true;
				break;
			default:
				System.out.println("error");
				break;
			}
		}

		if (scan != null) {
			scan.close();
		}
		System.out.println("the end");
	}

}
