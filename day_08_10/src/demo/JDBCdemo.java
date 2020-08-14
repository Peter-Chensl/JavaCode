package demo;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import JDBCutl.JDBCUtils;

public class JDBCdemo {
	public static void main(String[] args) throws Exception{
		java.sql.Connection con = JDBCUtils.getConnection();
		PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from dvd");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("id")+ "  " + rs.getString("name")+ "  "+rs.getString("publish"));
		}
		JDBCUtils.close((Connection) con, ps, rs);
	}
}
