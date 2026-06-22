package chapter18.page41;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSide {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("클라이언트 영역");
		Socket socket = null;
		// 서버주소와(127.0.0.1) 포트번호(3000)
		// 서버에 접속요청(socket : 서버와 통신할 수 있는 정보가 들어있다.)
//		socket = new Socket(InetAddress.getByName("localhost"), 3000);
		socket = new Socket(InetAddress.getByAddress(new byte[] {(byte)192,(byte)168,(byte)0,(byte)98}),3000);

		
		// 3.socket 가지고 송,수신기 만든다.`
		// outputStream , inputStream
		System.out.println("서버 접속완료");
		System.out.printf("서버이름 : %s 서버포트: %d \n", socket.getInetAddress(), socket.getPort());
		DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
		
		// 4번 서버에 보낼 파일이름(bg2.png)결정해서 전송한다.=>vkdlfrorcp
		File file =  new File("src/cat.jpg");
		//5.파일 보낼려면 파일 읽어주는 파일통역사 필요함
		BufferedInputStream bis =  new BufferedInputStream(new FileInputStream(file)); 
		System.out.printf("파일전송할 파일명 : %s \n",file.getName());
		//6.서버에 파일명을 전송한다.
		dos.writeUTF(file.getName());
		dos.flush();
		
		//5.서버에게 이미지 전체사이즈와 이미지 byte[] 전송한다.
		//byte[2048] [최대 2kb으로] 크기를 정한다.
		byte[] imagData = new byte[2048];
		int length = 0;
		//이미지 파일로부터 한번에 2048byte씩 읽는다.
		//반복문을 통해 모두 모든byte값을 가져올떄까지 반복 
		// (-1 :더이상 가져올 값이 없는 상태)
		while( (length = bis.read(imagData)) != -1) {
			dos.writeInt(length);
			dos.write(imagData);
			dos.flush();
		}
		dos.writeInt(-1);
		dos.flush();
		
		//6.서버가 보낸 메세지를 받아서 확인하고 종료한다.
		String message =  dis.readUTF();
		System.out.println(message);
		
		System.out.println("");
	}

}
