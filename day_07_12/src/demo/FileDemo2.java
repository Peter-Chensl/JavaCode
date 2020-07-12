package demo;

import java.io.File;

/*
 * File类的获取功能
 */
public class FileDemo2 {
	public static void main(String[] args) {
		function3();
	}
	/*
	 * File类的获取功能
	 */
	public static void function() {
		File file = new File("F:\\Javacode\\2.开发工具安装及配置");
		String name = file.getName();
		System.out.println(name);
		
		String path = file.getPath();
		System.out.println(path);
	}
	public static void function1() {
		File file = new File("F:\\Javacode\\2.开发工具安装及配置");
		long lenth = file.length();
		System.out.println(lenth);
	}
	public static void function2() {
		File file = new File("F:\\Javacode\\2.开发工具安装及配置");
		File abs = file.getAbsoluteFile();
		System.out.println(abs);
	}
	public static void function3() {
		File file = new File("F:\\Javacode\\2.开发工具安装及配置");
		File parent = file.getParentFile().getParentFile();
		System.out.println(parent);
	}
}
