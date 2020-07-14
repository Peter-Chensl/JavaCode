package demo;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("F:\\1.text");
		
		fw.write(100);
		fw.flush();
		char[] c = {'a','b','c','d'};
		fw.write(c);
		fw.flush();
		
		fw.write("hello");
		fw.flush();
		
		fw.close();
	}
}
