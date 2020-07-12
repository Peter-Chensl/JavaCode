package demo;

import java.io.File;

/*
 * File类的判断功能
 */
public class FileDemo3 {
	public static void main(String[] args) {
		function1();
	}
	/*
	 * 判断是不是目录（文件夹）
	 */
	public static void function1() {
		File file = new File("F:\\Javacode");
		if(file.exists()) {
		boolean b = file.isDirectory();
		System.out.println(b);
		}
	}
	/*
	 * 判断封装的路径是否存在
	 */
	public static void function() {
		File file = new File("F:\\Javacode");
		boolean b = file.exists();
		System.out.println(b);
	}
}
