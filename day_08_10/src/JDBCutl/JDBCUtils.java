package JDBCutl;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class JDBCUtils {
	private JDBCUtils() {};
	private static java.sql.Connection con;
	
	static {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/dvdsys";
		String username = "root";
		String password = "chl715480406";
		con = DriverManager.getConnection(url,username,password);
		}catch(Exception ex) {
			throw new RuntimeException(ex+"数据库连接失败！");
		}
	}
	public static java.sql.Connection getConnection() {
		return con;
	}
	public static void close(Connection con,Statement st,ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			}catch(SQLException ex) {}
		}
		if(st!=null) {
			try {
				rs.close();
			}catch(SQLException ex) {}
		}
		if(con!=null) {
			try {
				rs.close();
			}catch(SQLException ex) {}
		}
	}
}
