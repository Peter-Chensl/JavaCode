package demo;

import java.io.File;
import java.io.FileFilter;

/*
 * 自定义过滤器
 */
public class MyFilter implements FileFilter {
	public boolean accept(File pathname) {
		return pathname.getName().endsWith(".zip");
	}
}
