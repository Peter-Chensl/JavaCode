package liufan;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {

			fis = new FileInputStream("F:\\b.text");
			fos = new FileOutputStream("D:\\b.text");
			byte[] bytes = new byte[1024];
			int len = 0;
			while((len = fis.read(bytes)) != 0) {
				fos.write(len);
			}
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			System.out.println(ex);
			throw new RuntimeException("�ļ�����ʧ��");
		}finally {
			try {
				if(fos != null) {
					fis.close();
			}
			}catch(IOException ex) {
				throw new RuntimeException("�ͷ���Դʧ�ܣ�");
			}
		}
	}
}
