package demo;

import java.io.File;
import java.io.IOException;

/*
 * File类的创建和删除功能
 */

public class FileDemo1 {
	public static void main(String[] args) throws IOException{
		function2();
	}
	/*
	 * 删除功能
	 */
	public static void function2() {
		File file = new File("F:\\JavaDemo\\HolloWorld");
		boolean b = file.delete();
		System.out.println(b);
	}
	/*
	 * 创建文件夹
	 */
	public static void function1() {
		File file = new File("F:\\JavaDemo\\HolloWorld");
		boolean b =file.mkdirs();
		System.out.println(b);
	}
	/*
	 * 创建文件
	 */
	public static void function()throws IOException {
		File file = new File("F:\\JavaDemo.text");
		boolean b = file.createNewFile();//创建文件
		System.out.println(b);
	}
}
