package demo;

import java.io.File;

/*
 * File��Ļ�ȡ
 */
public class FileDemo4 {
	public static void main(String[] args) {
		function1();
	}
	/*
	 * ��ȡ��File��װ���ļ����ļ���
	 */
	public static void function() {
		File file = new File("F:");
		String[] str = file.list();
		for(String str1:str) {
			System.out.println(str1);
		}
	}
	public static void function1() {
		File file = new File("F:\\Javacode");
		File[] fileArr = file.listFiles();
		for(File f : fileArr) {
			System.out.println(f);
		}
	}
}
