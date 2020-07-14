package demo;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 流对象使用步骤
 * 1.创建该子类对象
 * 2.调用该对象的方法write
 * 3.colse释放资源
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("F:\\a.text");
		fos.write(100);
		
		byte[] bytes = {66,67,68};
		fos.write(bytes);
		fos.write(bytes,1,2);
		//写字符串
		fos.write("你好".getBytes());
		fos.close();
	}
}
