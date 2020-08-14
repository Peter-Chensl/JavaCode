package demo2;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import JDBCutl.JDBCUtils;

public class JDBCDemo {
	public static void main(String[] args)throws Exception {
		Connection con = (Connection) JDBCUtils.getConnection();
		PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from dvd");
		ResultSet rs = ps.executeQuery();
		List <Sort>list = new ArrayList<Sort>();
		while(rs.next()) {
		Sort s = new Sort(rs.getInt("id"),rs.getString("name"),rs.getString("publish"));
		list.add(s);
		}
		JDBCUtils.close((Connection) con, ps, rs);
		for(Sort s:list) {
			System.out.println(s);
		}
		
		
		
	}
}
