package liufan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class JiamiJiemi {
	public static void main(String[] args) {
		File srcFile=new File("F:\\Javacode\\1.jpg");
		File encFile=new File("F:\\Javacode\\1.jpg");
		File decFile = new File("F:\\Javacode\\1.jpg");

		try {
			EncFile(srcFile, encFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void EncFile(File srcFile, File encFile) throws Exception {
		if(!srcFile.exists()){ System.out.println("源文件不存在");
		return;
		}

		if(!encFile.exists()){
			System.out.println("加密创建的文件");
			encFile.createNewFile();
		}
		InputStream fis = new FileInputStream(srcFile);
		OutputStream fos = new FileOutputStream(encFile);
 
		fis.close();
		fos.flush();
		fos.close();
	}

}
