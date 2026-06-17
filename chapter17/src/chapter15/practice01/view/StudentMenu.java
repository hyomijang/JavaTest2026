package chapter15.practice01.view;

import java.util.Scanner;
import practice2.controller.Controller;
import practice2.model.Student;

public class StudentMenu {

    private Scanner scan = new Scanner(System.in);
    private StundentController sc = new StundentController();
    private Object avg;

    public void bookDisplay() {
        boolean exitFlag = false;
        while (!exitFlag) {
            System.out.println("\n========== 학생 관리 프로그램 ==========");
            System.out.println("1.입력, 2.출력, 3.정렬, 4.점수종합, 5.점수평균, 6.검색, 7.석차, 8.Home");
            System.out.print(">> ");
            int no = Integer.parseInt(scan.nextLine());

            switch (no) {
            case 1:
                insertStudent();
                break;
            case 2:
                selectStudent();
                break;
            case 3:
                sortStudents();
                break;
            case 4:
                sumTotal();
                break;
            case 5:
                sumavg();
                break;
            case 6:
                searchStudent();
                break;
            case 7:
                rankStudents();
                break;
            case 8:
                System.out.println("========== 프로그램 종료 ==========");
                exitFlag = true;
                break;
            default:
                System.out.println("잘못된 입력값입니다.");
                break;
            }
            System.out.println("올바른 숫자만 입력 가능합니다. 다시 시도해주세요.");
        }
    }
private void insertStudent() {
        sc.insertStudent();

    }

    private void selectStudent() {
        List<Student> sArr = sc.selextStudent();
        for (Student student : sArr) {
            System.out.println(student.toString());
        }

    }

    private void sortStudents() {
        List<Student> sArr = sc.sortStudents();
        for (Student student : sArr) {
            System.out.println(student.toString());
        }

    }

    private void sumTotal() {
    int sum = sc.sumTotal();
    System.out.printf("총 합계: %5d \n",sum);

    }

    private void sumavg() {
        double avg = sc.sumavg();
        System.out.printf("총 합계: %2d \n",avg);

    }

    private void searchStudent() {
        searchStudentNoName(String name, String no);

    }

    private void rankStudents() {

    }
}