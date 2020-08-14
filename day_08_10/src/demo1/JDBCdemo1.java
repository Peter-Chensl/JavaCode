package demo1;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class JDBCdemo1 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/dvdsys";
		String username = "root";
		String password = "chl715480406";
		java.sql.Connection con = DriverManager.getConnection(url,username,password);
		
		String sql = "select * from dvd";
		
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
		System.out.println(rs.getInt("id")+ "  " + rs.getString("name")+ "  "+rs.getString("publish"));	
		}
		rs.close();
		ps.close();
		con.close();
	}
}
