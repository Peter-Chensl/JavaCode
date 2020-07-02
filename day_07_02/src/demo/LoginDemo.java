package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LoginDemo {
	public static void main(String[] args) {
		//1.加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//2.获取连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","chl715480406");
			//3.预执行
			Scanner input = new Scanner(System.in);
			System.out.println("请输入用户名");
			String name = input.next();
			System.out.println("请输入密码");
			String password = input.next();
			PreparedStatement ps = conn.prepareStatement("select * from users where username = ? and password = ?");
			ps.setString(1, name);
			ps.setString(2,password);
			//执行executeUpdate(增删改),executeQuery(查)
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("登录成功！");
				if(0 == rs.getInt(4)) {
					System.out.println("普通用户，查看dvd,借阅dvd，归还dvd,排行榜");
				}else {
					System.out.println("管理员，新增dvd,删除dvd,查看dvd,排行榜");
				}
			}else{
				System.out.println("登录失败！");
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
