package demo1;

import java.io.IOError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * ʵ��UDPЭ��ķ��Ͷ�
 * ʵ�ַ�װ���ݵ���java.net.DatagramPacket �����ݷ�װ
 * ʵ�����ݴ������java.net.DategramSocket �����ݰ����ͳ�ȥ
 * 
 * ʵ�ֲ���
 * 1.����Dategrampacket���󣬷�װ���ݣ����ܵĵ�ַ�Ͷ˿�
 * 2.����DategramSocket
 * 3.����DategramSocket�෽��send,�������ݰ�
 * 4.�ر���Դ
 */
public class UDPsend {
	
	public static void main(String[] args) throws IOException {
		//�������ݰ����󣬷�װҪ���͵����ݣ����ܶ�IP���˿�
		byte[] date = "��ã�".getBytes();
		//����һ��InetAdderss���󣬷�װ�Լ���IP��ַ
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(date, date.length, inet, 6000);
		//����DatagramSocket�������ݰ��ķ��ͺͽ��ն���
		DatagramSocket ds = new DatagramSocket();
		ds.send(dp);
		ds.close();
	}
}
