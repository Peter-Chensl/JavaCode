package demo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ʵ��TCPЭ��ķ�������
 * ��ʾ����������java.net.server
 */
public class TCPServer {
	public static void main(String[] args)throws IOException {
		ServerSocket server = new ServerSocket(8888);
		Socket socket = server.accept();
		System.out.println(socket);
		InputStream in = socket.getInputStream();
		byte[] data = new byte[1024];
		int len = in.read();
		System.out.println(new String(data,0,len));
		
		//��������ͻ��˻����ݣ��ֽ��������ͨ���ͻ����׽��ֶ����ȡ�ֽ������
		OutputStream out = socket.getOutputStream();
		out.write("�յ���лл�㣡".getBytes());
		
		socket.close();
		server.close();
	}
}
