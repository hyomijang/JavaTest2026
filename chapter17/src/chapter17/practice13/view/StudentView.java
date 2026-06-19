package chapter17.practice13.view;

import java.util.List;
import java.util.Scanner;

import chapter17.practice13.control.StudentController;
import chapter17.practice13.model.StudentVO;

public class StudentView {
	public Scanner scan;
	private StudentController sc;

	public StudentView() {
		scan = new Scanner(System.in);
		sc = new StudentController();
	}

	public void display() {
		boolean exitFlag = false;
		while (!exitFlag) {
			System.out.println("***** 학생 성적 관리 메뉴 *****");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 전체 학생 목록 출력");
			System.out.println("3. 특정 학생 검색");
			System.out.println("4. 특정 학생 삭제");
			System.out.println("5. 특정 학생 정보 수정");
			System.out.println("6. 총점 내림차순 정렬 및 석차 부여");
			System.out.println("7. 이름 오름차순 정렬");
			System.out.println("8. Test용 더미 자료 입력");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호 선택 : >> ");

			int no = Integer.parseInt(scan.nextLine());

			switch (no) {
			case 0:
				exitFlag = true;
				break;
			case 1:
				addStudent();
				break;
			case 2:
				printAll();
				break;
			case 3:
				searchStudent();
				break;
			case 4:
				removeStudent();
				break;
			case 5:
				updateStudent();
				break;
			case 6:
				sortByTotalDesc();
				break;
			case 7:
				sortByNameAsc();
				break;
			case 8:
				addDummy();
				break;
			default:
				System.out.println("잘못된 번호 입력");
				break;
			}// end switch
		} // end while

		if (scan != null)
			scan.close();
		System.out.println("***** 프로그램종료 *****");
	} // end func (display)

	

	

	private void addStudent() {
		// int ad = sc.addStudent(StudentVO);
		System.out.println();
	}

	private void addDummy() {
		sc.addStudent(new StudentVO("홍길동1", 260601, 90, 19, 90));
		sc.addStudent(new StudentVO("홍길동2", 260602, 90, 80, 37));
		sc.addStudent(new StudentVO("홍길동3", 260603, 81, 54, 72));
		sc.addStudent(new StudentVO("홍길동4", 260604, 77, 67, 74));
		sc.addStudent(new StudentVO("홍길동5", 260605, 50, 90, 93));
	}

	private void printAll() {
		List<StudentVO> sl = sc.printAll();
		if (sl != null) {
			System.out.println(sl);
		} else {
			System.out.println("학생 정보를 불러올 수 없습니다.");
		}
	}

	private void searchStudent() {
		System.out.println("검색이름 >>");
		String name = scan.nextLine();
		System.out.println("검색 아이디 >>");
		int id = Integer.parseInt(scan.nextLine());
		StudentVO student = sc.searchStudent(name, id);
		if (student != null) {
			System.out.println(student);
		} else {
			System.out.println("검색하신 정보가 없습니다.");
		}
	}

	private void removeStudent() {
		System.out.println("삭제할 이름 >>");
		String name = scan.nextLine();
		System.out.println("삭제할 아이디 >>");
		int id = Integer.parseInt(scan.nextLine());
		StudentVO student = sc.removeStudent(name, id);

		if (student != null) {
			System.out.println(student);
		} else {
			System.out.println("삭제실패.");
		}
	}
	//update 기존아이디가 같으면 수정
	//기존 아이디가 틀리면 추가로 진행한다.
	private void updateStudent() {
		System.out.println("수정할 이름 >>");
		String name = scan.nextLine();
		System.out.println("수정할 아이디 >>");
		int id = Integer.parseInt(scan.nextLine());
		StudentVO stvo = new StudentVO(name,id, (int)(Math.random()*100),(int)(Math.random()*100), (int)(Math.random()*100));
		StudentVO student = sc.searchStudent(stvo.getName(),stvo.getId());
		if (student != null) {
			sc.updateStudent(id,name, stvo);
		} else {
			System.out.println("현재 업데이트 이용이 불가합니다. 재요청 부탁드립니다.");
		}
	}
	
	private void sortByTotalDesc() {
		List<StudentVO> sl = sc.sortByTotalDesc();
		if(sl !=null ) {
			System.out.println(sl);
		}else {
			System.out.println("정렬을 진행 할 수 없습니다.");
		}
		
	}
	
	private void sortByNameAsc() {
		List<StudentVO> sl = sc.sortByNameAsc();
		if(sl !=null ) {
			System.out.println(sl);
		}else {
			System.out.println("정렬을 진행 할 수 없습니다.");
		}
		
	}
}
