package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		//1.加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//2.获取连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","chl715480406");
			//3.预处理（准备sql语句）
			Scanner input = new Scanner(System.in);
			System.out.println("请输入dvd的名字");
			String name = input.next();
			System.out.println("请输入dvd的价格");
			double price = input.nextDouble();
			System.out.println("请输入dvd的出版社");
			String publish = input.next();
			PreparedStatement ps = conn.prepareStatement("insert into dvd values(null,?,?,?,0,'',null,0)");
			ps.setString(1, name);
			ps.setDouble(2, price);
			ps.setString(3, publish);
			//4.执行
			int row = ps.executeUpdate();//执行sql:只能	执行增删改		
			if(1 == row) {
				System.out.println("新增成功！");
			}else {
				System.out.println("新增失败！");
			}
			//5.释放资源
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
