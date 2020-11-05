package gjpAPPTools;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils {
	/*private static BasicDataSource datasoure = new BasicDataSource();
	static {
		datasoure.setDriverClassName("com.mysql.jdbc.Driver");
		datasoure.setUrl("jdbc:mysql://localhost:3306/gjp");
		datasoure.setUsername("root");
		datasoure.setPassword("chl715480406");
		datasoure.setMaxActive(10);
		datasoure.setMaxIdle(5);
		datasoure.setMinIdle(2);
		datasoure.setInitialSize(10);
	}
	public static DataSource getDatasoure() {
		return datasoure;
	}*/

    //创建BasicDataSource对象
	private static BasicDataSource datasource = new BasicDataSource();
	//静态代码块,实现必要参数设置
	static{
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/gjp");
		datasource.setUsername("root");
		datasource.setPassword("chl715480406");
		datasource.setMaxActive(10);
		datasource.setMaxIdle(5);
		datasource.setMinIdle(2);
		datasource.setInitialSize(10);
	}
	public static DataSource getDataSource(){
		return datasource;
	}
}
