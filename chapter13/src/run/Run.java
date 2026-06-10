package run;

import java.util.Scanner;

import view.BookMenu;

public class Run {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		boolean exitFlag = false;
		int no = 0;
		while(!exitFlag) {
		System.out.println("1.도서,2.판매,3.회원관리,4.종료");
		 no = Integer.parseInt(scan.nextLine());
		 switch (no) {
		case 1:
			BookMenu bcm = new BookMenu();
			bcm.bookDisplay();
			break;
		case 2:
			System.out.println("도서판매는 작업중");
			break;
		case 3:
			System.out.println("회원관리는 작업중");
			break;
		case 4:
			System.out.println("종료");
			exitFlag=true;
			break;
		default:
			System.out.println("고객님 메뉴에 있는 번호를 선택해주세요.");
			break;
		}
		
		
		}
		if(scan != null) {
			scan.close();
		}
		System.out.println("저희 사이트를 장문해주셔서 감사합니다");
	}

}
