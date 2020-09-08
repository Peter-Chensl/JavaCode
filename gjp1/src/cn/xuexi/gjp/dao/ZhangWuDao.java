package cn.xuexi.gjp.dao;
/*
 * 实现账务表的增删改查操作
 */

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.xuexi.gjp.domain.ZhangWu;
import cn.xuexi.gjp.tools.JDBCUtils;

public class ZhangWuDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	public void deleteZhangwu(int zwid) {
		// TODO Auto-generated method stub
		try {
			String sql = "DELETE from gjp_zhangwu where zwid = ?";
			qr.update(sql,zwid);
		}catch(SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("删除数据失败！");
		}
	}
	/*
	 * 定义方法，实现账务编辑功能
	 */
	
	public void editZhangWu(ZhangWu zw) {
		// TODO Auto-generated method stub
		try {
			String sql = "UPDATE gjp_zghangwu SET flname =?,money = ?,zhanghu=?,createtime=?,descrition=? where zwid = ?";
			Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescrition(),zw.getZwid()};
			qr.update(sql,params);
		}catch(SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("数据更新失败！");
		}
	}
	/*
	 * 定义方法实现添加账务功能
	 */
	public void addZhangWu(ZhangWu zw) {
		try {
			String sql = "INSERT INTO gjp_zhangwu(flname,money,zhanghu,createtime,descrition)VALUES(?,?,?,?,?)";
			//创建对象数组
			Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescrition()};
			qr.update(sql,params);
		}catch(SQLException ex) {
			System.out.println(ex);
			System.out.println("添加数据失败！");
		}
	}
	
	/*
	 * 定义方法，条件查询数据库数据
	 */
	public List<ZhangWu> select(String startDate,String endDate){
		try {
		String sql = "SELECT * FROM gjp_zhangwu where createtime BETWEEN ? AND ?";
		Object[] params = {startDate,endDate};
		List<ZhangWu> list = qr.query(sql, new BeanListHandler<>(ZhangWu.class),params);
		return list;
		}catch(SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("条件查询数据失败！");
		}
	}
	/*
	 * 定义方法，查询数据库，获取所有的账务数据
	 * 方法由业务层调用
	 */
	public List<ZhangWu> selectAll() {
		try {
			//查询账务数据的SQL语句
			String sql = "SELECT * FROM gjp_zhangwu";
			//调用qr对象方法
			List<ZhangWu> list = qr.query(sql, new BeanListHandler<>(ZhangWu.class));
			return list;
		}catch(SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("查询所有账务失败！");
		}
	}
	

	
}
