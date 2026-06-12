package practice01.view;

import practice01.model.Book;
import practice01.run1.Run;
import pratice01.controller.Bookcontroller;



//컨트
public class BookMenu {
	private Bookcontroller bc = new Bookcontroller();
		public Book book = new Book();
		public void bookDisplay() {
			
    		boolean exitFlag = false;
    		while(!exitFlag) {
    			
    		System.out.println("1.도서정보출력,2.대여통계 출력,3.도서등급판별,4.도서정보정렬,5.메인화면");
    		System.out.print("1~5번선택>");
    		int no = Integer.parseInt(Run.scan.nextLine());
    		switch (no) {
    		case 1:
    			System.out.println("========== 도서 정보 출력 ==========");
    			Book[] book = bc.printBook();
    			for (int i = 0; i < book.length; i++) {
					System.out.println(book[i].toString());
				}
    			break;
    		case 2:
    			System.out.println("========== 대여 통계 출력 ==========");
    			double[] avgRentCount = bc.avgRentCount();
    			System.out.printf("도서정보랜트수합계:%5.0f \n",avgRentCount[0]);
    			System.out.printf("도서정보랜트수평균:%5.0f \n",avgRentCount[1]);
    			break;
    		case 3:{
    			System.out.println("========== 도서 등급 판별 ==========");
    			Book [] book1 = bc.printBook();
    			String grade = null;
    			for (int i = 0; i < book1.length; i++) {
					if(book1[i].getRentCount() >=50) {
						grade ="A";
					} else if (book1[i].getRentCount() >=40) {
						grade ="B";
					} else if (book1[i].getRentCount() >=30) {
						grade ="C";
					} else if (book1[i].getRentCount() >=20) {
						grade ="D";
					}
					
					System.out.println(book1[i].getTitle());
					System.out.printf("도서등급: %s \n",grade);
				}
    		}
    			break;
    			
    		case 4:
    			System.out.println("========== 도서 정보 정렬 ==========");
    			Book[] bArr = bc.bookRank();
    			for (Book book1 : bArr) {
					System.out.println(book1.toString());
				}
    			break;
    		case 5:
    			System.out.println("========== 도서 정보 페이지 종료 ==========");
    			break;
    		default:
    			System.out.println("잘못된 입력값입니다.");
    			break;
    		}
    		
    	
    }

    	

   
	}
}
