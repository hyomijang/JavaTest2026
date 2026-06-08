package chapter10.practice05;

public class Member {
	String id;
	String password;
	String name;
	String phoneNumber;
	
	public Member(String id, String password, String name, String phoneNumber) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
		
	public String getId() {return id;}
	public String getName() {return name;}
	public String getPhoneNumber() {return phoneNumber;}
	public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public boolean checkPassword(String oldPw) {
		if(!this.getPassword().equals(oldPw)) return false;
		else return true;
	}	
	
	public void changePassword(String newPw) {
			this.setPassword(newPw);
	}
	
	public void changePhoneNumber(String newNum) {
			this.setPhoneNumber(newNum);
			System.out.printf("[%s]님, 전화번호가 %s(으)로 변경되었습니다.\n", this.getName(), this.getPhoneNumber());
	}
	
	public void displayInfo() {
		System.out.println("======= 회원 정보 =======");
		System.out.printf("아이디 : %s\n이름 : %s\n연락처 : %s\n", id, name, phoneNumber);
		System.out.println("=======================");
	}
}
