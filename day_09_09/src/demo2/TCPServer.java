package demo2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;



/*
 * TCP图片上传服务器
 * 1.ServerSocket套接字对象，监听端口8000
 * 2.方法accept()获取客户端的连接对象
 * 3.客户端连接对象获取字节输入流，读取客户端发送图片
 * 4.创建File对象，绑定上传文件夹
 * 判断文件夹是否存在，不存在，创建文件夹
 * 5.创建字节输出流，数据目的File对象所在文件夹
 * 6.字节流读取图片，写入到目的文件夹中
 * 7.将上传成功回写客户端
 * 8.关闭资源
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
		
		socket.getOutputStream().write("上传成功！".getBytes());
		
		fos.close();
		socket.close();
		server.close();
	}
}
