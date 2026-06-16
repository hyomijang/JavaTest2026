package chapter15.practice02.controller;

import chapter15.practice02.model.Book;

public class BookController {
	//
	Book[]  bArr;
	private static final int COUNT = 5;
	private static final int CUT_LINE = 30;
	
	public BookController() {
		bArr = new Book[COUNT];
		bArr[0] = new Book("자바","소설","45");
		bArr[1] = new Book("자바","소설","45");
		bArr[2] = new Book("자바","소설","45");
		bArr[3] = new Book("자바","소설","45");
		bArr[4] = new Book("자바","소설","45");
	}
}
