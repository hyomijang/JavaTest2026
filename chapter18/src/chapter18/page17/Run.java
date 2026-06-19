package chapter18.page17;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;

public class Run {

	public static void main(String[] args) throws UnknownHostException {
		//InetAddress 객체생성 => 통신 (ip주소) "192.168.0.9"
		//1.도메인 주소를 가지고 InetAdress 만들기
		InetAddress ia1 = InetAddress.getByName("www.google.com");
		System.out.println(ia1);
		//2."192.168.0.9"
		InetAddress ia2  = InetAddress.getByAddress(new byte[] {(byte)192,(byte)168,(byte)0,(byte)9});
		System.out.println(ia2);
		//3. 도메인 이름과 내가정한 ip로 inetaddress
		InetAddress ia3  = InetAddress.getByAddress("www.himedia.com", (new byte[] {(byte)192,(byte)168,(byte)0,(byte)9}));
		//4.로컬 호스트 : 자기 컴퓨터에 할달된 주소
		System.out.println(ia3);
		InetAddress ia4 = InetAddress.getLocalHost();
		System.out.println(ia4);
		//5.루프백 호스트 : 127.0.0.1
		InetAddress ia5 = InetAddress.getLoopbackAddress();
		System.out.println(ia5);
		//6. ip주소가 2개이상 있는 회사가 많다.
		InetAddress[] ia6 = InetAddress.getAllByName("www.google.com");
		for (InetAddress ia : ia6) {
			System.out.println(ia);
			
		} 
		InetAddress[] ia7 = InetAddress.getAllByName("www.naver.com");
		for (InetAddress ia : ia7) {
			System.out.println(ia);
			
		} 
	}

}
