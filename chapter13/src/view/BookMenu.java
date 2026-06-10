package view;

import run.Run;

/*import java.awt.print.Book;*/

import page08.BookVO;
import page08.control.BookController;



	public class BookMenu {
	
	    // 멤버 필드로 BookController 객체 생성
	    private BookController bcm = new BookController();
	    
	    
	    	public void bookDisplay() {
	    		boolean exitFlag = false;
	    		while(!exitFlag) {
	    		System.out.println("1.도서정보출력,2.대여통계 출력,3.도서등급판별,4.도서정보정렬,5.메인화면");
	    		System.out.print("1~5번선택>");
	    		int no = Integer.parseInt(Run.scan.nextLine());
	    		switch (no) {
	    		case 1:
	    			System.out.println("========== 도서 정보 출력 ==========");
	    			BookVO[] book = bcm.printBook();
	    			for (int i = 0; i < book.length; i++) {
						System.out.println(book[i].infrom());
					}
	    			break;
	    		case 2:
	    			System.out.println("========== 대여 통계 출력 ==========");
	    			double[] avgRentCount = bcm.avgRentCount();
	    			System.out.printf("도서정보랜트수합계:%5.0f \n",avgRentCount[0]);
	    			System.out.printf("도서정보랜트수평균:%5.0f \n",avgRentCount[1]);
	    			break;
	    		case 3:{
	    			System.out.println("========== 도서 등급 판별 ==========");
	    			BookVO []  bookvo = bcm.printBook();
	    			String grade = null;
	    			for (int i = 0; i < bookvo.length; i++) {
						if(bookvo[i].getRentCount() >=50) {
							grade ="A";
						} else if (bookvo[i].getRentCount() >=40) {
							grade ="B";
						} else if (bookvo[i].getRentCount() >=30) {
							grade ="C";
						} else if (bookvo[i].getRentCount() >=20) {
							grade ="D";
						}
						
						System.out.println(bookvo[i].getTitle());
						System.out.printf("도서등급: %s \n",grade);
					}
	    		}
	    			break;
	    			
	    		case 4:
	    			System.out.println("========== 도서 정보 정렬 ==========");
	    			BookVO[] bvArr = bcm.bookRank();
	    			for (BookVO bookVO : bvArr) {
						System.out.println(bookVO.toString());
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

		
		
	/*	System.out.println("=======도서 정보 출력=======");

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
				System.out.printf("%s도서는 일반 도서입니다 \n", book.getTitle());
			}*/
		}
	


