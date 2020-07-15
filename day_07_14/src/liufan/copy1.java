package liufan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy1 {
	public static void main(String[] args) {
        File src = new File("F:\\Javacode\\homework1");
        File des = new File("F:\\Javacode\\homework2");
        copy(src, des);
        System.out.println("拷贝创建文件夹成功！");
        }
public static void copy(File src, File des) {
        File[] fileArray = src.listFiles();
        if(fileArray != null) {
            for(File src1 : fileArray) {
                File des1 = new File(des, src1.getName());
                if(src1.isDirectory()) {
                    des1.mkdir();
                    copy(src1, des1);
                }else {
                    write(src1, des1);
                }
            }
        }
    }
public static void write(File src, File des) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {fis = new FileInputStream(src);
            fos = new FileOutputStream(des);
            byte[] bys = new byte[1024];
            int len = 0;
            while((len = fis.read(bys)) != -1) {
                fos.write(bys, 0, len);
            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {fis.close();
                fos.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}


