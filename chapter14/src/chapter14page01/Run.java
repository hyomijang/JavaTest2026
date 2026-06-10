package chapter14page01;

import java.util.Scanner;

public class Run {
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		double value = 0.0;
		boolean exitFlag = false;
		while (!exitFlag) {
			System.out.println("숫자 입력하시오>> (0은 계산불가합니다.)");
			int num = Integer.parseInt(scan.nextLine());
		try {
			System.out.println("1000answkd 실행됨");
			value = 10 / num;
			exitFlag= true;
			System.out.println("sdfs");
		} catch (ArithmeticException e) {
			System.out.println("고객님이 입력하신 값으로 계산이 불가하여 종료합니다.");
			e.printStackTrace();
		}
		
		}
		
		if(scan!=null) {
			scan.close();
		}
		System.out.printf("%f",value);
		System.out.println("the end");
	}

}
