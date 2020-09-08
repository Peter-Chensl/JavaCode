package demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * ʵ��UDP���ն�
 * 	ʵ�ַ�װ���ݰ�java.net.DatagramPacket �����ݷ�װ
 * 	ʵ���������    java.net.DatagramSocket ��������
 * 
 * ʵ�ֲ��裺
 * 	1.����DatagramPacket���󣬰󶨶˿ں�
 * 	2.�����ֽ����飬���շ���������
 * 	3.����DatagramSocket����
 * 	4.����Datagramsocket���󷽷�
 * 	  recelve(DatagramPacket dp)�������ݣ����ݷ������ݰ���
 *  5.�۰�
 *  	���͵�IP��ַ
 *  	���յ����ֽڸ���
 *  	���ͷ��Ķ˿ں�
 *  6.�ر���Դ
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
