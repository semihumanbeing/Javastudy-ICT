package mymain.multicast;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		try {
			InetAddress naverIP = InetAddress.getByName("www.naver.com");
			System.out.println(naverIP.getHostAddress());
			
			System.out.println("daum server IP");
			InetAddress[] daumIP = InetAddress.getAllByName("www.daum.net");
			for(InetAddress ia : daumIP) {
				System.out.println(ia.getHostAddress());
			}
			
			//global broadcast address (전역주소)
			InetAddress globalBroadcastIP = InetAddress.getByName("255.255.255.255");
			
			
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
