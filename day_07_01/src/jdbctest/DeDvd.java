package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeDvd {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","chl715480406");
			Scanner input = new Scanner(System.in);
			System.out.println("请输入借阅编号！");
			int id = input.nextInt();
			System.out.println("请输入要借阅人的姓名：");
			String name = input.next();
			System.out.println("请输入借阅日期：");
			String date = input.next();
			PreparedStatement ps = conn.prepareStatement("update dvd set state = 1,borname = ?,borDate = ?,times = times+1 where id = ?");
			ps.setString(1, name);
			ps.setString(2, date);
			ps.setInt(3, id);
			int row = ps.executeUpdate();
			if(row >= 1) {
				System.out.println("借阅成功");
			}else {
				System.out.println("借阅失败");
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
