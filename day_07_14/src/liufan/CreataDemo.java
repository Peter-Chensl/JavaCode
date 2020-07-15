package liufan;

import java.io.File;
import java.io.IOException;

//创建文件夹
public class CreataDemo {
	public static void main(String[] args) throws IOException{
		File file = new File("F://Javacode\\homework");
		judgeDieExists(file);
	}
	public static void judgeDieExists(File file) {
		if(file.exists()) {
			System.out.println("文件夹已存在，创建失败");
		}else {
			boolean b = file.mkdir();
			if(b) {
				System.out.println("创建成功");
			}else {
				System.out.println("创建失败");
			}
		}
	}
}
