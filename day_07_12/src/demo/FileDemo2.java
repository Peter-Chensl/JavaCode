package demo;

import java.io.File;

/*
 * File��Ļ�ȡ����
 */
public class FileDemo2 {
	public static void main(String[] args) {
		function3();
	}
	/*
	 * File��Ļ�ȡ����
	 */
	public static void function() {
		File file = new File("F:\\Javacode\\2.�������߰�װ������");
		String name = file.getName();
		System.out.println(name);
		
		String path = file.getPath();
		System.out.println(path);
	}
	public static void function1() {
		File file = new File("F:\\Javacode\\2.�������߰�װ������");
		long lenth = file.length();
		System.out.println(lenth);
	}
	public static void function2() {
		File file = new File("F:\\Javacode\\2.�������߰�װ������");
		File abs = file.getAbsoluteFile();
		System.out.println(abs);
	}
	public static void function3() {
		File file = new File("F:\\Javacode\\2.�������߰�װ������");
		File parent = file.getParentFile().getParentFile();
		System.out.println(parent);
	}
}
