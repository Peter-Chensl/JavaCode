package demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
 *ʵ��UDP���ͣ���������
 *������Ϸ��͸����ܶ�
 */
public class UDPsend {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		//����DatagramSocket�������ݰ��ķ��ͺͽ��ն���
		DatagramSocket ds = new DatagramSocket();
		//����һ��InetAdderss���󣬷�װ�Լ���IP��ַ
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		while(true) {
			String message = sc.nextLine();
			//�������ݰ����󣬷�װҪ���͵����ݣ����ܶ�IP���˿�
			byte[] date = message.getBytes();
			DatagramPacket dp = new DatagramPacket(date, date.length, inet, 6000);
			ds.send(dp);
		}
		//ds.close();
	}
}
