package demo2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;



/*
 * TCPͼƬ�ϴ�������
 * 1.ServerSocket�׽��ֶ��󣬼����˿�8000
 * 2.����accept()��ȡ�ͻ��˵����Ӷ���
 * 3.�ͻ������Ӷ����ȡ�ֽ�����������ȡ�ͻ��˷���ͼƬ
 * 4.����File���󣬰��ϴ��ļ���
 * �ж��ļ����Ƿ���ڣ������ڣ������ļ���
 * 5.�����ֽ������������Ŀ��File���������ļ���
 * 6.�ֽ�����ȡͼƬ��д�뵽Ŀ���ļ�����
 * 7.���ϴ��ɹ���д�ͻ���
 * 8.�ر���Դ
 */
public class TCPServer {
	public static void main(String[] args)throws IOException {
		ServerSocket server = new ServerSocket(8000);
		Socket socket = server.accept();
		InputStream in = socket.getInputStream();
		File upload = new File("D:\\upload");
		if(!upload.exists())
			upload.mkdirs();
		
		FileOutputStream fos = new FileOutputStream(upload + "\\25.jpg");
		
		byte[] bytes = new byte[1024];
		int len = 0;
		while((len = in.read(bytes))!=-1) {
			fos.write(bytes,0,len);
		}
		
		socket.getOutputStream().write("�ϴ��ɹ���".getBytes());
		
		fos.close();
		socket.close();
		server.close();
	}
}
