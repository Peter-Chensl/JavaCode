package demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamDemo2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("F:\\a.txt");
			fos.write(100);
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			System.out.println(ex.getMessage());
			throw new RuntimeException("文件写入失败！重试！");
		}finally {
			
			try {
				if(fos != null)
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException("关闭资源失败");
			}
		}
	}
}
