package test2.run;
import java.util.Scanner;
import test2.view.BookMenu;

public class Run {
	
	
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean exitFlag = false;
		while (!exitFlag) {
			System.out.println("1.도서,2.학생,3.주문,4.종료");
			int no = Integer.parseInt(scan.nextLine());
			switch (no) {
			case 1:
				book();
				break;
			case 2:
				System.out.println("해당 내용은 준비중입니다.");
				break;
			case 3:
				System.out.println("해당 내용은 준비중입니다.");
				break;
			case 4:
				System.out.println("종료합니다");
				exitFlag = true;
				break;
				

			default:
				System.out.println("잘못 입력하셨습니다 재입력 부탁드립니다.");
				break;
			}
		}
		
		if(scan != null) {
			scan.close();
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
	private static void book() {
		 BookMenu bm = new BookMenu();
		 bm.bookDisplay();
		
	}

}
