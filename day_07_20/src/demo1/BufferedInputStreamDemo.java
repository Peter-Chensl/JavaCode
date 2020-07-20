package demo1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
	public static void main(String[] args)throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\buffer.text"));
		byte[] bytes = new byte[10];
		int len = 0;
		while((len = bis.read(bytes)) != -1) {
			System.out.print(new String(bytes,0,len));
		}
		bis.close();
	}
}
