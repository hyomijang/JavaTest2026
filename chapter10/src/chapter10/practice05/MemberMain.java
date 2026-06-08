package chapter10.practice05;

import java.util.Scanner;

public class MemberMain {	
	static Scanner scanner = new Scanner(System.in); 
	public static void main(String[] args) {
		
		boolean exitFlag = false;
		
		while (!exitFlag) {
			System.out.println("0:Exit, 1:실행");
			System.out.print("번호입력 : ");
			int select1 = Integer.parseInt(scanner.nextLine());
			
			switch (select1) {
				case 1: practice01(); break;
//				case 2: practice02(); break;
				case 0: System.out.println("프로그램 종료"); exitFlag = true; break;
				default: System.out.println("잘못된 값 입력"); break;
			}
		}
		if(scanner!=null) scanner.close();
	}
	
	private static void practice01() {
		// ======= 회원 정보 =======
		//아이디 : gildong123
		//이름 : 홍길동
		//연락처 : 000-0000-0000
		// =======================
		//[홍길동]님, 전화번호가 111-1111-1111(으)로 변경되었습니다.
		// ======= 회원 정보 =======
		//아이디 : adf
		//이름 : 홍길동
		//연락처 : 111-1111-1111
		// =======================
		final int MAX_MEM_NUMBER = 5;
		
		Member[] memArray = new Member[MAX_MEM_NUMBER];
		memArray[0] = new Member("tempid001", "0001", "임요환", "010-1111-1111");
		memArray[1] = new Member("tempid002", "0002", "홍진호", "010-2222-2222");
		memArray[2] = new Member("tempid003", "0003", "이윤열", "010-3333-3333");
		memArray[3] = new Member("tempid004", "0004", "최연성", "010-5555-5555");
		memArray[4] = new Member("tempid005", "0005", "마재윤", "010-4444-4444");

		boolean exitFlag = false;
		
		while (!exitFlag) {
			System.out.println("\n====== 전화번호수정 ======");
			System.out.println("0:프로그램종료");
			//System.out.println("1:임요환 2:홍진호, 3:이윤열, 4:최연성, 5:마재윤");
			for (int i = 0; i < memArray.length; i++) {
				System.out.printf("%d:%s ", i+1, memArray[i].getName());
			}
			System.out.print("\n번호입력 : ");
			int no = Integer.parseInt(scanner.nextLine());
			
			switch (no) {
				case 1: changeInfo(memArray[no-1]); break;
				case 2: changeInfo(memArray[no-1]); break;
				case 3: changeInfo(memArray[no-1]); break;
				case 4: changeInfo(memArray[no-1]); break;
				case 5: changeInfo(memArray[no-1]); break;
				case 0: System.out.println("프로그램 종료"); exitFlag = true; break;
				default: System.out.println("잘못된 값 입력"); break;
			}
		}

//		Member mem1 = new Member("gildong123", "0000", "홍길동", "010-1234-5678");
//		
//		mem1.displayInfo();
//		
//		System.out.print("비밀번호입력 : ");
//		String oldPw1 = scanner.nextLine();
//		
//		if(!mem1.checkPassword(oldPw1)) {
//			System.out.println("잘못된 비밀번호");
//		} else {
//			System.out.print("새로운 비밀번호입력 : ");
//			String newPw1 = scanner.nextLine();
//			mem1.changePassword(newPw1);
//		
//			System.out.print("새로운 전화번호입력 : ");
//			String newPhoneNum1 = scanner.nextLine();
//			mem1.changePhoneNumber(newPhoneNum1);
//		}
//		mem1.displayInfo();
		
	}
	
	private static void changeInfo(Member memArray) {
		memArray.displayInfo();
		
		System.out.print("비밀번호입력 : ");
		String oldPw1 = scanner.nextLine();
		
		if(!memArray.checkPassword(oldPw1)) {
			System.out.println("잘못된 비밀번호\n\n");
		} else {
			System.out.print("새로운 비밀번호입력 : ");
			String newPw1 = scanner.nextLine();
			memArray.changePassword(newPw1);
		
			System.out.print("새로운 전화번호입력 : ");
			String newPhoneNum1 = scanner.nextLine();
			memArray.changePhoneNumber(newPhoneNum1);
			
			memArray.displayInfo();
		}
	}

}
