package chapter14.page13;

import java.io.IOException;
import java.io.InputStreamReader;

public class Run {
	public static void main(String[] args) {
		// finally 이용한 자원반납처리 예외처리
		// 키보드, 파일, 네트워크전송 >1 byte 입력한 값을 2byte 변형 값을 읽겠다.
		// System.in => 키보드

		InputStreamReader isr = null;
		char[] buffer = new char[10];
		/*
		 * boolean exitFlag = false; while(!exitFlag) {
		 */

		System.out.println("문자를 입력하시오>>");
		try {
			isr = new InputStreamReader(System.in);
			char charValue = (char) isr.read();
			// int readCount = isr.read(buffer);
			System.out.printf(" 키보드로부터 받은 문자: %c \n", charValue);
		} catch (IOException e) {
			System.out.println("system.in 장치 문제 발생");
			e.printStackTrace();
			// exitFlag = true;
		} finally {
			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
