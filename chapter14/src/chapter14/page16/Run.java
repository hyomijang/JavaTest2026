package chapter14.page16;

public class Run {

	public static void main(String[] args) {
		//A객체를 생성,구형,자원반납처리까지
		try(A a = new A("홍길동")) {
			a.inputname();
			System.out.printf("당신이 입력한 이름은 %s \n",a.getName());
			a.getName();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("the end.");

	}

}
