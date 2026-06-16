package chapter15.practice01.view;

import chapter15.practice01.controller.StundentController;
import chapter15.practice01.model.Stundent;
import chapter15.practice01.run.Run;

public class StundentMenu {
	StundentController st = new StundentController();

	public StundentMenu() {
	}

	public void studentDisplay() {

		boolean exitFlag = false;
		while (!exitFlag) {
			;
			System.out.println("1.입력,2출력,3.정렬,4.총합 ,5평균,6.검색,7.석차, 8.home");
			System.out.print(">>");
			int no = Integer.parseInt(Run.scan.nextLine());
			switch (no) {

			case 1:
				System.out.println("========== 입력 ==========");
				insertstudent();

				break;

			case 2:
				System.out.println("==========  출력 ==========");
				selectstudent();

				break;
			case 3:
				System.out.println("========== 대여 통계 출력 ==========");
				sortstundent();
				break;
			case 4:
				System.out.println("========== 도서 등급 판별 ==========");
				sumTotal();
				break;

			case 5:
				System.out.println("========== 책 정보 대여수 , 평균 ==========");
				avgTotal();
				break;
			case 6:
				System.out.println("========== 도서 정보 페이지 종료 ==========");
				searchStudenNoName();
				break;
			case 7:
				System.out.println("========== 도서 정보 페이지 종료 ==========");
				renkStundent();
				break;
			case 8:
				System.out.println("========== 도서 정보 페이지 종료 ==========");
				exitFlag = true;

			default:
				System.out.println("잘못된 입력값입니다.");
				break;

			}
		}

	}

	private void sumTotal() {
		int sum = st.sumTotal();
		System.out.println(sum);

	}

	private void searchStudenNoName() {
		System.out.println("검색할 이름");
		String name = Run.scan.nextLine();
		System.out.println("검색할 번호");
		String no = Run.scan.nextLine();
		Stundent student = st.searchStudenNoName(name, no);
		if (student != null) {
			System.out.printf("학생정보 %s \n", student.toString());
		} else {
			System.out.printf("없어요 \n");
		}
	}

	private void avgTotal() {
		double avg = st.avgTotal();
		System.out.printf("총합 : %4f \n", avg);

	}

	private void selectstudent() {
		Stundent[] sArr = st.seletsStudent();
		for (Stundent s : sArr) {
			System.out.println(s.toString());
		}

	}

	private void insertstudent() {
		st.insertStundent();
		System.out.println();
	}

	private void sortstundent() {
		Stundent[] stundent = st.sortStundent();
		for (Stundent s : stundent) {
			System.out.printf("%s \n", s.toString());

		}
	}

	private void renkStundent() {
		Stundent[] sArr = st.renkStundent();
		for (Stundent s : sArr) {
			System.out.println(s.toString());
		}

	}

}
