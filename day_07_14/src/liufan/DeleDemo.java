package liufan;

import java.io.File;

public class DeleDemo {
	public static void main(String[] args) {
		File file = new File("F://Javacode\\homework");
		DeleteFile(file);
	}
	public static void DeleteFile(File file) {
		if(file.exists()) {
			System.out.println(file.getAbsolutePath());
			boolean b = file.delete();
			if(b) {
				System.out.println("ɾ���ɹ���");
			}
		}else {
		System.out.println("�ļ��в����ڣ�ɾ��ʧ�ܣ�");
		}
	}
}
