package demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * 实现UDP接收端
 * 	实现封装数据包java.net.DatagramPacket 将数据封装
 * 	实现输出传输    java.net.DatagramSocket 接收数据
 * 
 * 实现步骤：
 * 	1.创建DatagramPacket对象，绑定端口号
 * 	2.创建字节数组，接收发来的数据
 * 	3.创建DatagramSocket对象
 * 	4.调用Datagramsocket对象方法
 * 	  recelve(DatagramPacket dp)接收数据，数据放在数据包中
 *  5.折包
 *  	发送的IP地址
 *  	接收到的字节个数
 *  	发送方的端口号
 *  6.关闭资源
 */
public class UDPRecevie  {
	public static void main(String[] args) throws IOException{
		DatagramSocket ds = new DatagramSocket(6000);
			byte[] data = new byte[1024];
		
		DatagramPacket dp = new DatagramPacket(data, data.length);
		while(true) {
		ds.receive(dp);
		int port = dp.getPort();
		String ip = dp.getAddress().getHostAddress();
		int length = dp.getLength();
		System.out.println(new String(data,0,length)+"..."+ip+":"+port);
		}
	}
}
