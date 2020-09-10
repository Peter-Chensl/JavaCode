package demo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 实现TCP协议的服务器端
 * 表示服务器的类java.net.server
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
		
		//服务器向客户端回数据，字节输出流，通过客户端套接字对象获取字节输出流
		OutputStream out = socket.getOutputStream();
		out.write("收到，谢谢你！".getBytes());
		
		socket.close();
		server.close();
	}
}
