package chapter14page01;

public class Run3 {

	public static void main(String[] args) {
		//unchecked NullPonintException
		
		String str = "asd";
		
		try {
			
			System.out.println(str.charAt(2));
		} catch (Exception e) {
			System.out.println("wake up");
		}finally {
			System.out.println("finally");
		}
		
		System.out.println("the end");
	}

}
