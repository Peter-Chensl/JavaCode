package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������ԴF:\\b.text���Ƶ�D:\\b.text��������Դ
 */
public class Copy {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("F:\\a.text");
			fos = new FileOutputStream("D:\\a.text");
			int len = 0;
			while((len = fis.read()) != 0) {
				fos.write(len);
				}
			}catch(IOException ex) {
				System.out.println(ex);
				throw new RuntimeException("�ļ�����ʧ�ܣ�");
			}finally {
				try {
					if(fis != null) {
						fis.close();
					}
					}catch(IOException ex) {
						throw new RuntimeException("�ͷ���Դʧ�ܣ�");
			}
		}
	}

}
