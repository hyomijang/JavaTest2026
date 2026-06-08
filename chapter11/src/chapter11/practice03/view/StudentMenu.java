package chapter11.practice03.view;

import chapter11.practice03.controller.StudentController;
import chapter11.practice03.model.Student;

public class StudentMenu {
	private StudentController ssm;

	public StudentMenu() {
		ssm = new StudentController();

		System.out.println("==========학생 정보 출력==========");
		Student[] studentArray = ssm.printStudent();
		
		for (int i = 0; i < studentArray.length; i++) {
			System.out.printf("%d번 %s\n", i, studentArray[i].toString());
		}
		
		System.out.println("==========학생 성적 출력==========");
		double[] avgArray = ssm.avgScore();
		System.out.printf("학생 점수 합계 : %5.1f\n", avgArray[0]);
		System.out.printf("학생 점수 평균 : %5.1f\n", avgArray[1]);
		
		System.out.println("==========성적 결과 출력==========");
		for (int i = 0; i < studentArray.length; i++) {
			String isPass = (studentArray[i].getScore() >= ssm.CUT_LINE) ? "합격" : "불합격";
			System.out.printf("%s 학생은 %s 입니다\n", studentArray[i].getName(), isPass);
		}

	}

}
