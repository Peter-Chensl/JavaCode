package demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
 *实现UDP发送，键盘输入
 *输入完毕发送给接受端
 */
public class UDPsend {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		//创建DatagramSocket对象，数据包的发送和接收对象
		DatagramSocket ds = new DatagramSocket();
		//创建一个InetAdderss对象，封装自己的IP地址
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		while(true) {
			String message = sc.nextLine();
			//创建数据包对象，封装要发送的数据，接受端IP，端口
			byte[] date = message.getBytes();
			DatagramPacket dp = new DatagramPacket(date, date.length, inet, 6000);
			ds.send(dp);
		}
		//ds.close();
	}
}
