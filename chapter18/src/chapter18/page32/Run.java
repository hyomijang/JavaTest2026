package chapter18.page32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Run {

	public static void main(String[] args) throws IOException {
		// 서버소켓
		System.out.println("<<Server>>");
		ServerSocket serverSoket = new ServerSocket(2000);

		// 접속대기 ,이용자 발생 전 까지 무한대기
		// soket : 이용자
		Socket soket = serverSoket.accept();
		// 서버화면 이용자 표시
		System.out.println("클라이언트 연결수락하였습니다.");
		System.out.printf("고객주소 : %s , 고객포트번호: %d \n", soket.getInetAddress(), soket.getPort());

		// 클라이언트와 통신체계만들기 In/Out putstream 생성.
		DataInputStream dis = new DataInputStream(new BufferedInputStream(soket.getInputStream()));
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(soket.getOutputStream()));
		// 1. 이용자가 서버 입장시 안내문구 출력.
		String sendmessage = "안녕하세요 고객님";
		dos.writeUTF("안녕하세요 고객님");
		System.out.println(sendmessage + "<<send>>");
		// 버퍼를 가득채워져야만 전송이 가능하나 바로 작성한 글을 보내고 싶은 경우 flush 이용.
		dos.flush();
		// 2. 고객이 주문할 내용을 읽기를 기다린다.(무한대기)
		String message = dis.readUTF();
		System.out.println(message + "<<new>>");
		// 3. 서버는 오더진행.
		dos.writeUTF(message + "<<Accept>>");
		dos.flush();
	}

}
