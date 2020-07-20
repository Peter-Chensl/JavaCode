package demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * ת����
 */
public class OutputStreamWriteeDemo {
	public static void main(String[] args) throws IOException{
		// writerGBK();
		writerUTF();
	}
	public static void writerUTF() throws IOException{
		FileOutputStream fos = new FileOutputStream("F:\\UTF.text");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		osw.write("��ã�");
		osw.close();
	}
	public static void writerGBK() throws IOException {
		FileOutputStream fos = new FileOutputStream("F:\\gbk.text");
		OutputStreamWriter ows = new OutputStreamWriter(fos);
		ows.write("��ã�");
		ows.close();
	}
}
