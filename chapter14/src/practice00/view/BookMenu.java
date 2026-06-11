package practice00.view;

import practice00.control.BookController;

public class BookMenu {
	BookController bcm = new BookController();
	
    public BookMenu() {
        System.out.println("========== 도서 정보 출력 ==========");
        // 1. BookController의 printBook() 반환값을 활용해 모든 도서 정보 출력 (inform() 사용)

        System.out.println("========== 대여 통계 출력 ==========");
        // 2. BookController의 avgScore()와 유사한 avgRentCount()를 호출하여 대여 총합과 평균 출력

        System.out.println("========== 도서 등급 판별 ==========");
        // 3. 도서의 대여 횟수가 CUT_LINE(30회) 미만이면 "일반 도서", 이상이면 "인기 도서(Best Seller)"로 판별하여 출력
    }

	
}
