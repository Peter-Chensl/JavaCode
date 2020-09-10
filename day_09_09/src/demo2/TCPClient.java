package demo2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * ʵ��TCPͼƬ�ϴ��ͻ���
 * ʵ�ֲ��裺
 * 	1.Socket�׽������ӷ�����
 * 	2.ͨ��Socket��ȡ�ֽ������дͼƬ
 *  3.ʹ���Լ��������󣬶�ȡͼƬ����Դ
 *  	FileInputStream
 *  4.��ȡͼƬ��ʹ���ֽ����������ͼƬд��������
 *  �����ֽ�������л���
 *  5.ͨ��Socket�׽��ֻ�ȡ�ֽ�������
 *  6.�ر���Դ
 */
public class TCPClient {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1", 8000);
		//��ȡ�ֽ��������ͼƬд��������
		OutputStream out = socket.getOutputStream();
		FileInputStream fis = new FileInputStream("F:\\25.jpg");
		int len = 0;
		byte[] bytes = new byte[1024];
		while((len = fis.read(bytes))!= -1) {
			out.write(bytes,0,len);
		}
		socket.shutdownOutput();
		InputStream in = socket.getInputStream();
		len = in.read(bytes);
		System.out.println(new String(bytes,0,len));
		
		fis.close();
		socket.close();
	}
}
