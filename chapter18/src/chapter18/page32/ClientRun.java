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
		Socket soket = new Socket(InetAddress.getByName("localhost"),2000);
		
		System.out.println("서버 접속완료.");
		System.out.printf("서버주소 : %s , 서버포트번호: %d \n", soket.getInetAddress(), soket.getPort());

		
		// 서버 와 통신체계만들기 In/Out putstream 생성.
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(soket.getOutputStream()));
		DataInputStream dis = new DataInputStream(new BufferedInputStream(soket.getInputStream()));
		
		// 1. 서버 메세지 확인 .무한대기
		String sendmessage = "안녕하세요 고객님";
		String receiveMessage = dis.readUTF();
		
		//1-2. 서버에 오더넣기
		dos.writeUTF("거 누구 없소.");
		dos.flush();
		// 버퍼를 가득채워져야만 전송이 가능하나 바로 작성한 글을 보내고 싶은 경우 flush 이용.
		dos.flush();
		// 2. 고객이 주문할 내용을 읽기를 기다린다.(무한대기)
		String message = dis.readUTF();
		System.out.println(message + "<<new>>");
		// 3. 서버는 오더진행.
		
	}
}
