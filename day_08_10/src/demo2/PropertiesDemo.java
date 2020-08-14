package demo2;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws Exception{
		/*FileInputStream fis = new FileInputStream("src/dvdsys.properties");
		System.out.println(fis);*/
		InputStream in = PropertiesDemo.class.getClassLoader().getResourceAsStream("dvdsys.properties");
		System.out.println(in);
		Properties pro = new Properties();
		pro.load(in);
		String driverClass = pro.getProperty("dirverClass");
		String url = pro.getProperty("url");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println(con);
	}
}
