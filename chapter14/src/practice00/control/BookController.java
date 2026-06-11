package practice00.control;

import practice00.book.Book;

public class BookController {
	// bArr Book[] =new Book[5];
	private Book[] bArr;
	 public static final int CUT_LINE = 30;
	public BookController() {
		bArr = new Book[5];
		bArr[0] = new Book("자바의 정석","it",45);		
	}
	
}
