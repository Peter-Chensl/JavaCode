package liufan;

import java.io.File;
import java.io.IOException;

//�����ļ���
public class CreataDemo {
	public static void main(String[] args) throws IOException{
		File file = new File("F://Javacode\\homework");
		judgeDieExists(file);
	}
	public static void judgeDieExists(File file) {
		if(file.exists()) {
			System.out.println("�ļ����Ѵ��ڣ�����ʧ��");
		}else {
			boolean b = file.mkdir();
			if(b) {
				System.out.println("�����ɹ�");
			}else {
				System.out.println("����ʧ��");
			}
		}
	}
}
