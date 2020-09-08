package cn.xuexi.gjp.tools;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils {
	//创建BasicDateSource对象
	private static BasicDataSource datasource = new BasicDataSource();
	static {
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/gjp");
		datasource.setUsername("root");
		datasource.setPassword("chl715480406");
		datasource.setMaxActive(10);
		datasource.setMaxIdle(5);
		datasource.setMinIdle(2);
		datasource.setInitialSize(10);
	}
	public static DataSource getDataSource() {
		return datasource;
	}
}
