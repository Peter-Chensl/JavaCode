package demo;

import java.io.File;
import java.io.IOException;

/*
 * File��Ĵ�����ɾ������
 */

public class FileDemo1 {
	public static void main(String[] args) throws IOException{
		function2();
	}
	/*
	 * ɾ������
	 */
	public static void function2() {
		File file = new File("F:\\JavaDemo\\HolloWorld");
		boolean b = file.delete();
		System.out.println(b);
	}
	/*
	 * �����ļ���
	 */
	public static void function1() {
		File file = new File("F:\\JavaDemo\\HolloWorld");
		boolean b =file.mkdirs();
		System.out.println(b);
	}
	/*
	 * �����ļ�
	 */
	public static void function()throws IOException {
		File file = new File("F:\\JavaDemo.text");
		boolean b = file.createNewFile();//�����ļ�
		System.out.println(b);
	}
}
