package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws FileNotFoundException{
		function();
	}
	
	public static void function()throws FileNotFoundException {
		File file = new File("F:\\1.text");
		PrintWriter pw = new PrintWriter(file);
		pw.println(100);
		pw.close();
	}
}
