package demo;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamSemo {
	public static void main(String[] args)throws IOException {
		FileInputStream fis = new FileInputStream("F:\\b.text");
		/*int i = fis.read();
		System.out.println((char)i);
		 i = fis.read();
		System.out.println(i);
		 i = fis.read();
		System.out.println(i);*/
		int len = 0;
		while((len = fis.read()) != -1) {
			System.out.print((char)len);
		}
		fis.close();
	}
}
