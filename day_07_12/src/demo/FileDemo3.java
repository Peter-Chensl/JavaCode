package demo;

import java.io.File;

/*
 * File����жϹ���
 */
public class FileDemo3 {
	public static void main(String[] args) {
		function1();
	}
	/*
	 * �ж��ǲ���Ŀ¼���ļ��У�
	 */
	public static void function1() {
		File file = new File("F:\\Javacode");
		if(file.exists()) {
		boolean b = file.isDirectory();
		System.out.println(b);
		}
	}
	/*
	 * �жϷ�װ��·���Ƿ����
	 */
	public static void function() {
		File file = new File("F:\\Javacode");
		boolean b = file.exists();
		System.out.println(b);
	}
}
