package demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 表是互联网中的IP地址
 */

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException{
		function();
	}
	public static void function() throws UnknownHostException{
		InetAddress inet = InetAddress.getLocalHost();
		System.out.println(inet.toString());
		String host = inet.toString();
		String[] str = host.split("/");
		for(String s:str) {
			System.out.println(s);
		}
	}
}
