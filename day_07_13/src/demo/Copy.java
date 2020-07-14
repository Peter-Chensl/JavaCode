package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 将数据源F:\\b.text复制到D:\\b.text，绑定数据源
 */
public class Copy {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("F:\\a.text");
			fos = new FileOutputStream("D:\\a.text");
			int len = 0;
			while((len = fis.read()) != 0) {
				fos.write(len);
				}
			}catch(IOException ex) {
				System.out.println(ex);
				throw new RuntimeException("文件复制失败！");
			}finally {
				try {
					if(fis != null) {
						fis.close();
					}
					}catch(IOException ex) {
						throw new RuntimeException("释放资源失败！");
			}
		}
	}

}
