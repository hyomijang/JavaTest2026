package chapter15.practice02.view;

import chapter15.practice02.controller.BookController;
import chapter15.practice02.model.Book;
import chapter15.practice02.run.Run;

public class BookMenu {
	BookController bc = new BookController();
	Book bk = new Book();

	public void bookDisplay() {

		boolean exitFlag = false;
		while (!exitFlag) {
			System.out.println("1.출력,2.입력,3.추천도서,4.검색,5.정렬,6.home");
			int no = Integer.parseInt(Run.scan.nextLine());
			switch (no) {
			case 1:
				printBook();
				break;
			case 2:
				printBook();
				break;
			case 3:
				printBook();
				break;
			case 4:
				printBook();
				break;
			case 5:
				bookseach();
				break;
			case 6:
				exitFlag = true;
				break;

			default:
				break;
			}
		}
	}



	private void bookseach() {
		// TODO Auto-generated method stub
		
	}



	private void printBook() {
		// TODO Auto-generated method stub
		
	}

}
