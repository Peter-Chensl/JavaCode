package demo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * 实现TCP客户端，连接到服务器
 * 和服务器实现数据交换
 * 实现TCP客户端程序的类java.net.Socket
 * 
 * 
 */
public class TCPClient {
	public static void main(String[] args)throws IOException {
		Socket socket = new Socket("127.0.0.1", 8888);
		OutputStream out = socket.getOutputStream();
		out.write("服务器OK".getBytes());
		
		//读取服务器发回的数据
		InputStream in = socket.getInputStream();
		byte[] data = new byte[1024];
		int len = in.read(data);
		System.out.println(new String(data,0,len));
		socket.close();
	}
}
