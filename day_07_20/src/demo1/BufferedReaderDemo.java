package demo1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException{
		BufferedReader brf = new BufferedReader(new FileReader("F:\\a.text"));
		/*String line = brf.readLine();
		System.out.println(line);
		
		line = brf.readLine();
		System.out.println(line);*/
		String line = null;
		while((line = brf.readLine()) != null) {
			System.out.println(line);
		}
		brf.close();
	}
}
