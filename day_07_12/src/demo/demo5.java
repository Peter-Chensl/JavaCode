package demo;

import java.io.File;

public class demo5 {
	public static void main(String[] args) {
		File file = new File("F:\\Javacode");
		File[] fileArr = file.listFiles(new MyFilter());
		for(File f : fileArr) {
			System.out.println(f);
		}
	}
}
