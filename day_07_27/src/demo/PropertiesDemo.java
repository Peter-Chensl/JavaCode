package demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException{
		function2();
	}
	public static void function2() throws IOException {
		Properties pro = new Properties();
		pro.setProperty("a", "1");
		pro.setProperty("b", "2");
		pro.setProperty("c", "3");
		pro.setProperty("d", "4");
		FileWriter fw = new FileWriter("F:\\pro.text");
		pro.store(fw, " ");
		fw.close();
	}
	public static void function1 () throws IOException{
		Properties pro = new Properties();
		FileReader fr = new FileReader("F:\\pro.text");
		pro.load(fr);
		fr.close();
		System.out.println(pro);
	}
	public static void function() {
		Properties pro = new Properties();
		pro.setProperty("a", "1");
		pro.setProperty("b", "2");
		pro.setProperty("c", "3");
		pro.setProperty("d", "4");
		System.out.println(pro);
		
		String value = pro.getProperty("c");
		System.out.println(value);
		Set<String> set =pro.stringPropertyNames();
		for(String key:set) {
			System.out.println(key + "..." + pro.getProperty(key));
		}
	}
}
