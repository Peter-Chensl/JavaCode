package demo1;

import java.io.IOError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 实现UDP协议的发送端
 * 实现封装数据的类java.net.DatagramPacket 将数据封装
 * 实现数据传输的类java.net.DategramSocket 将数据包发送出去
 * 
 * 实现步骤
 * 1.创建Dategrampacket对象，封装数据，接受的地址和端口
 * 2.创建DategramSocket
 * 3.调用DategramSocket类方法send,发送数据包
 * 4.关闭资源
 */
public class UDPsend {
	
	public static void main(String[] args) throws IOException {
		//创建数据包对象，封装要发送的数据，接受端IP，端口
		byte[] date = "你好！".getBytes();
		//创建一个InetAdderss对象，封装自己的IP地址
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(date, date.length, inet, 6000);
		//创建DatagramSocket对象，数据包的发送和接收对象
		DatagramSocket ds = new DatagramSocket();
		ds.send(dp);
		ds.close();
	}
}
