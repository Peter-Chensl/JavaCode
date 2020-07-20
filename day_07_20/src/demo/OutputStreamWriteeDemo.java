package demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 转换流
 */
public class OutputStreamWriteeDemo {
	public static void main(String[] args) throws IOException{
		// writerGBK();
		writerUTF();
	}
	public static void writerUTF() throws IOException{
		FileOutputStream fos = new FileOutputStream("F:\\UTF.text");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		osw.write("你好！");
		osw.close();
	}
	public static void writerGBK() throws IOException {
		FileOutputStream fos = new FileOutputStream("F:\\gbk.text");
		OutputStreamWriter ows = new OutputStreamWriter(fos);
		ows.write("你好！");
		ows.close();
	}
}
