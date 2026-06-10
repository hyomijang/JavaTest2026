package chapter14.page10;

public class Run {
	
	public static void main(String[] args) {
		// 다중예외처리 
		
		try {
			int num = Integer.parseInt("10!");
			System.out.println(3/0);
		} catch (NumberFormatException e) {
			System.out.println("Numexception");
		} catch (ArithmeticException e) {
			System.out.println("Arithexception");
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}

	}

}
