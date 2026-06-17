package chapter15.practice01.run;

import java.util.Scanner;

import chapter15.practice01.view.StundentMenu;

public class Run {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		StundentMenu sm = new StundentMenu();
		sm.studentDisplay();
		
		if(scan != null) {
			scan.close();
		}
		System.out.println("메인프로그램 종료.");
	}

}
