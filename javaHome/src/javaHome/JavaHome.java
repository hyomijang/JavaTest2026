package javaHome;

import java.util.Scanner;

public class JavaHome {
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {

		boolean exitFlag = false;
		while(!exitFlag) {
			System.out.println("1:1 , 2:2, 3:3, 4:exit");
			int no = Integer.parseInt(scan.nextLine());
			switch (no) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				exitFlag=true;
				System.out.println("exit");
				break;

			default:
				System.out.println("wake up");
				break;
			}
			
			
		}// while end
		
		if(scan !=null) {
			scan.close();
		}
		System.out.println("The end");
		
	}

}
