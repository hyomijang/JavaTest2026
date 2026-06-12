package practice01.run1;

import java.util.Scanner;

import practice01.view.BookMenu;



public class Run {
	public static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		boolean exitFlag = false;
		while(!exitFlag) {
			System.out.println("1:도서 , 2:학생정보 , 3:마트 , 4:종료");
			System.out.print("번호를 입력하시오>> ");
			int no = Integer.parseInt(scan.nextLine());
			switch (no) {
			case 1:
				BookMenu bm = new BookMenu();
				bm.bookDisplay();
				break;
			case 2:
				System.out.println("준비중");
				break;
			case 3:
				System.out.println("준비중");
				break;
			case 4:
				System.out.println("종료");
				exitFlag = true;
				break;
			default:
				System.out.println("다시 입력하시오.");
				break;
			}
		}
		
		try {
			if(scan !=null) {
				scan.close();
			}
		} catch (Exception e) {
		}finally {scan.close();}
		System.out.println("사이트를 이용해주셔서 감사합니다.");
	}
	

}
