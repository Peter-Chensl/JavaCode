package demo;

import java.io.File;
import java.io.FileFilter;

/*
 * �Զ��������
 */
public class MyFilter implements FileFilter {
	public boolean accept(File pathname) {
		return pathname.getName().endsWith(".zip");
	}
}
