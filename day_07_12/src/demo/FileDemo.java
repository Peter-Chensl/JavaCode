package demo;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		/*String separator = File.pathSeparator;
		System.out.println(separator);
		
		String separator2 = File.separator;
		System.out.println(separator2);*/
		function();
		function1();
		function();
		}
	/*
	 * File(File parent,String child)
	 * ����file���͵ĸ�·�����ַ�����·��
	 */
	public static void function2() {
		File parent = new File("F:");
		File file = new File(parent,"Javacode");
		System.out.println(file);
	}
	/*
	 * File(String parent,String child)
	 * ����·���������ַ�����·������·��
	 */
	public static void function1() {
		File file = new File("F:","Javacode");
		System.out.println(file);
	}
	/*
	 * File(String pathname)
	 * ����·��������д���ļ��У�����д��һ���ļ�
	 * C:\\abc C:\\abc\\Demo.java
	 * ��·����װ��File����
	 */
	public static void function() {
		File file = new File("F:\\Javacode");
		System.out.println(file);
	}
}
