package demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObiectStreamDemo {
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		//function();
		function1();
	}
	public static void function1() throws IOException,ClassNotFoundException{
		FileInputStream fis = new FileInputStream("F:\\pro1.text");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		System.out.println(obj);
		ois.close();
	}
	
	public static void function() throws IOException{
		FileOutputStream fos = new FileOutputStream("F:\\pro1.text");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Person p = new Person("lisi",25);
		
		oos.writeObject(p);
	}
}
