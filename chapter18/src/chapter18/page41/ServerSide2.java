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

public class ServerSide2 {
	public static void main(String[] args) throws IOException {
		System.out.println("서버사이드");
		//1. 서버소켓을 만든다.(3000포트번호 서버소켓을만든다.)
		ServerSocket serverSocket = null; 
		DataInputStream dis = null;
		DataOutputStream dos = null; 
		BufferedOutputStream bos = null; 
		
		try {
			serverSocket = new ServerSocket(3000);
			
			//2. 서버기다린다.(클라이언트 요청해오기를 기다림)
			//무한대기
			System.out.println("클아이언트 접속 대기중");
			Socket cSocket = serverSocket.accept();
			
			//3. clientSocket가지고 송, 수신기 만든다.
			//OutputStream(입), InputStream(귀)
			System.out.println("클라이언트 연결");
			System.out.printf("고객이름: %s 고객포트: %d \n",cSocket.getInetAddress(), cSocket.getPort());
			dis = new DataInputStream(new BufferedInputStream(cSocket.getInputStream()));
			dos = new DataOutputStream(new BufferedOutputStream(cSocket.getOutputStream()));
			
			//4.클라이언트 보낼 파일명 보낼때 까지 기다린다.
			String fileName = dis.readUTF();
			System.out.printf("받은파일명은: %s \n",fileName);
			
			//4. 저장하는 통역관 생성
			File file = new File("src/serverData/"+fileName);
			bos = new BufferedOutputStream(new FileOutputStream(file));  
			
			//5.클라이언트가 보내준 2048씩 반복해서 보내온것을 파일저장한다.
			byte[] imageData = new byte[2048];
			int length = 0; 
			
			while ((length = dis.readInt()) != -1) {
				dis.read(imageData); 
				bos.write(imageData, 0, length);
				bos.flush();
			}
			
			//6. 서버가 클라이언트 이미지 다 왔어 메세지 전송
			System.out.println("파일이미지 전송완료");
			dos.writeUTF("파일전송완료햇음");
			dos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			serverSocket.close();
			dis.close();
			dos.close();
			
		}
		
		
		System.out.println("서버소켓종료");
	}

}
