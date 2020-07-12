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
	 * 传递file类型的父路径，字符串子路径
	 */
	public static void function2() {
		File parent = new File("F:");
		File file = new File(parent,"Javacode");
		System.out.println(file);
	}
	/*
	 * File(String parent,String child)
	 * 传递路径，传递字符串父路径，子路径
	 */
	public static void function1() {
		File file = new File("F:","Javacode");
		System.out.println(file);
	}
	/*
	 * File(String pathname)
	 * 传递路径：可以写到文件夹，可以写到一个文件
	 * C:\\abc C:\\abc\\Demo.java
	 * 将路径封装成File对象
	 */
	public static void function() {
		File file = new File("F:\\Javacode");
		System.out.println(file);
	}
}
