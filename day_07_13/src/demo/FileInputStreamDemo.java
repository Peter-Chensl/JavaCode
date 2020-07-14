package demo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("F:\\b.text");
		
		byte[] b = new byte[2];
		int len = fis.read(b);
		System.out.println(new String(b));
		System.out.print(len);
		
		fis.close();
		
	}
}
