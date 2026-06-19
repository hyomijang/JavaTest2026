package chapter18.page17;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Iterator;

public class Run2 {

	public static void main(String[] args) throws IOException {
		//InetAddress 객체생성 => 통신 (ip주소) "192.168.0.9"
		//1.도메인 주소를 가지고 InetAdress 만들기
		InetAddress ia1 = InetAddress.getByName("www.google.com");
		System.out.println(ia1);
		System.out.println("==================================");
		byte[] bArr = ia1.getAddress();
		System.out.println(Arrays.toString(bArr));
		ia1.getHostAddress();
		System.out.println("ia1.getHostAddress()="+ia1.getHostAddress());
		System.out.println("ia1.getHostName()="+ia1.getHostName());
		System.out.println("ia1.isReachable(100)="+ia1.isReachable(100));
		System.out.println("ia1.LoopbackAddress()="+ia1.isLoopbackAddress());
		System.out.println("ia1.isMulticastAddress()="+ia1.isMulticastAddress());
	}
}