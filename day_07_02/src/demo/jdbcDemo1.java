package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class jdbcDemo1 {
	public int update(String sql,List<Object> args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","chl715480406");
			PreparedStatement ps = conn.prepareStatement(sql);
			if(args != null) {
				for(int i = 0; i < args.size();i++ ) {
					ps.setObject(i+1, args.get(i));
				}
			}
			
			int row = ps.executeUpdate();
			ps.close();
			conn.close();
			
			return row;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	public List <List<Object>> query(String sql,List<Object> list) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","chl715480406");
			PreparedStatement ps = conn.prepareStatement(sql);
			if(list != null) {
				for(int i = 0;i < list.size();i++) {
					ps.setObject(i+1, list.get(i));
				}
			}
			ResultSet rs = ps.executeQuery();
			List<List<Object>> table = new ArrayList<List<Object>>();
			while(rs.next()) {
				List<Object> row = new ArrayList<Object>();
				int columnCount = rs.getMetaData().getColumnCount();
				for(int i = 1;i <= columnCount;i++) {
					row.add(rs.getObject(i));
				}
				table.add(row);
			}
			rs.close();
			ps.close();
			conn.close();
			return table;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
