package demo2;

import java.sql.Connection;
import demo2.JDBCUtilsConfig;

public class TestJDBCUtils {
	public static void main(String[] args) {
		Connection con = JDBCUtilsConfig.getConnection();
		System.out.println(con);
	}
}
