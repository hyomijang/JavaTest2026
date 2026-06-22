package chapter18.page32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientRun {
	public static void main(String[] args) throws IOException {
		//클라이언트 소켓
		System.out.println("<<Client>>");
		//서버 소캣(서버주소, 공유포트)
		//서버요청시 서버 Accept하면 소켓정보를 받는다.
		Socket socket = new Socket(InetAddress.getByAddress(new byte[] {(byte)192,(byte)168,(byte)0,(byte)9}),3000);
		
		System.out.println("서버 접속완료.");
		System.out.printf("서버주소 : %s , 서버포트번호: %d \n", socket.getInetAddress(), socket.getPort());

		
		// 서버 와 통신체계만들기 In/Out putstream 생성.
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
		DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		
		
		String receiveMessage = dis.readUTF();
		System.out.println("++"+receiveMessage);
		
		//1-2. 서버에 오더넣기
		dos.writeUTF("거 누구 없소.");
		dos.flush();
		
		// 2. 고객이 주문할 내용을 읽기를 기다린다.(무한대기)
		String message = dis.readUTF();
		System.out.println(message + "<<new>>");
		// 3. 서버는 오더진행.
		
	}
}
