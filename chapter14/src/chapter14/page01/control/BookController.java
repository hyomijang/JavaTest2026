package chapter14.page01.control;

import chapter14.page01.model.Book;

public class BookController {
	private Book [] bArr;
	public static final int CUT_LINE =30;
	public static final int BOOK_COUNT =5;

	//북 배열 만들기
	// 스테딕 파이널 상수값
	//배열값 + 책 최대값주기
	
	public Bookcontroller() {
		bArr = new Book[BOOK_COUNT];
		bArr[0] = new Book() ;
	}
	//함수 프린트 만들기 /리턴 배열
	public Book[] printBook() {
		return bArr;
	}
	//총 대여 합계 합수 만들기 //바구니 인트 만들기 
	//포문 사용해서 배열값 불러오기 바구니 합산 리턴값주기.	
	
	//대여 평균값 구하는 함수 만들기 (정수가 아니니 더블 쓸것)
	//퍼블릭 더블 배열 함수명//더블배열 객체 선언
	//[0]합산 수 [1] 합산대여수 /최대상수값 리턴 값으로 배열 돌려줄것.	
		
		// [0] 합계 [1] 평균
	
	// 도서 대여 카운트 중심으로 내림차순으로 정렬하시오
	// 원본을 사용해서 정렬하는 방법으로 처리한다.
	// 정렬함수 만들기 // 포문으로 J I 비교하교 이프문으로 버퍼로 값을 옮겨 리턴값으로 배열줄것.
}
