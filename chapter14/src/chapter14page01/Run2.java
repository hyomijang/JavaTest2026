package chapter14page01;

import java.io.IOException;
import java.io.InputStreamReader;

public class Run2 {

	public static void main(String[] args) {
		//1.chacked Exception (InterruptedException)
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//2.chacked Exception (ClassNotFountException)
		try {
			Class cls = Class.forName("java");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//3.chacked Exception (IoException)
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			isr.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
