package demo1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException{
		//FileOutputStream fos = new FileOutputStream("F:\\buffer.txt");
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\buffer.text"));
		bos.write(55);
		byte[] bytes = "Hollo Wrold!".getBytes();
		bos.write(bytes);
		bos.write(bytes,3,2);
		bos.close();
	}
}
