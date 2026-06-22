package chapter18.page41;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
	public static void main(String[] args) throws IOException {
		System.out.println("ServerSide");
		// 서버 소켓 만들기
	
		ServerSocket serverSocket = null;
		serverSocket = new ServerSocket(4500);

		// 2.서버대기 (클라이언트 요청)
		// 무한대기
		System.out.println("클라이언트 접속대기");
		Socket cSocket = serverSocket.accept();

		// 3.clientSocket 가지고 송,수신기 만든다.
		// outputStream , inputStream
		System.out.println("클라이언트 접속확인이 되었습니다");
		System.out.printf("고객이름 : %s 고객포트: %d \n", cSocket.getInetAddress(), cSocket.getPort());
		DataInputStream dis = new DataInputStream(new BufferedInputStream(cSocket.getInputStream()));
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(cSocket.getOutputStream()));
		
		//4.클라이언트 보낼 파일명을 보낼때 까지 기다린다.
		String fileName = dis.readUTF();
		System.out.println("받은 파일명"+fileName);
		
		//4-1.저장하는 통역관 생성
		File file = new File("src/serverData/" + fileName);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file)) ;
		
		//5.클라이언트가 보내준 byte값을 저장한다.
		byte[] imageData = new byte[2048];
		int length = 0;
		while((length = dis.readInt()) != -1) {
			dis.read(imageData);
			bos.write(imageData, 0, length);
			bos.flush();
		}
		//6.서버가 클라이언트 파일 전송완료 문구 출력
		System.out.println("파일이미지 전송완료");
		dos.writeUTF("파일전송 완료.");
		dos.flush();
		System.out.println("서버소켓종료.");
		
		dos.flush();
		
		if(cSocket != null && !cSocket.isClosed()) cSocket.close();
        if(bos != null) bos.close();
	}
}
