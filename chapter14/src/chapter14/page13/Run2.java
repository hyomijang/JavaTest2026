package chapter14.page13;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Run2 {

	public static void main(String[] args) {

		try (InputStreamReader isr = new InputStreamReader(System.in);) {
			char charValue = (char) isr.read();
			System.out.printf(" 키보드로부터 받은 문자: %c \n", charValue);
		} catch (Exception e) {
			System.out.println("system.in 장치 문제 발생");
			e.printStackTrace();
		}
	}
}