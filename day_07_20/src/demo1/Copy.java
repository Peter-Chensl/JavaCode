package demo1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) throws IOException{
		long s = System.currentTimeMillis();
		copy2(new File("F:\\buffer.text"),new File("D:\\buffer.text"));
		long e = System.currentTimeMillis();
		System.out.println(e-s);
	}
	public static void copy4(File src ,File desc)throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
		int len = 0;
		byte[] bytes = new byte[1024];
		while((len = bis.read()) != -1) {
			bos.write(bytes,0,len);
		}
		bos.close();
		bis.close();
	}
	public static void copy3(File src ,File desc)throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
		int len = 0;
		while((len = bis.read()) != -1) {
			bos.write(len);
		}
		bos.close();
		bis.close();
		
	}
	public static void copy2(File src ,File desc)throws IOException{
		FileInputStream fis = new  FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(desc);
		int len = 0;
		byte[] bytes = new byte[1024];
		while((len = fis.read())!=-1) {
			fos.write(bytes,0,len);
			
		}
		fos.close();
		fis.close();
	}
	public static void copy1(File src,File desc) throws IOException{
		FileInputStream fis = new  FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(desc);
		int len = 0;
		while((len = fis.read())!=-1) {
			fos.write(len);
			
		}
		fos.close();
		fis.close();
	}
}
