package demo;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������ʹ�ò���
 * 1.�������������
 * 2.���øö���ķ���write
 * 3.colse�ͷ���Դ
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("F:\\a.text");
		fos.write(100);
		
		byte[] bytes = {66,67,68};
		fos.write(bytes);
		fos.write(bytes,1,2);
		//д�ַ���
		fos.write("���".getBytes());
		fos.close();
	}
}
