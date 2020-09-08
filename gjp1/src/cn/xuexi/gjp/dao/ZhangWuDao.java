package cn.xuexi.gjp.dao;
/*
 * ʵ����������ɾ�Ĳ����
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
			throw new RuntimeException("ɾ������ʧ�ܣ�");
		}
	}
	/*
	 * ���巽����ʵ������༭����
	 */
	
	public void editZhangWu(ZhangWu zw) {
		// TODO Auto-generated method stub
		try {
			String sql = "UPDATE gjp_zghangwu SET flname =?,money = ?,zhanghu=?,createtime=?,descrition=? where zwid = ?";
			Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescrition(),zw.getZwid()};
			qr.update(sql,params);
		}catch(SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("���ݸ���ʧ�ܣ�");
		}
	}
	/*
	 * ���巽��ʵ�����������
	 */
	public void addZhangWu(ZhangWu zw) {
		try {
			String sql = "INSERT INTO gjp_zhangwu(flname,money,zhanghu,createtime,descrition)VALUES(?,?,?,?,?)";
			//������������
			Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescrition()};
			qr.update(sql,params);
		}catch(SQLException ex) {
			System.out.println(ex);
			System.out.println("�������ʧ�ܣ�");
		}
	}
	
	/*
	 * ���巽����������ѯ���ݿ�����
	 */
	public List<ZhangWu> select(String startDate,String endDate){
		try {
		String sql = "SELECT * FROM gjp_zhangwu where createtime BETWEEN ? AND ?";
		Object[] params = {startDate,endDate};
		List<ZhangWu> list = qr.query(sql, new BeanListHandler<>(ZhangWu.class),params);
		return list;
		}catch(SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("������ѯ����ʧ�ܣ�");
		}
	}
	/*
	 * ���巽������ѯ���ݿ⣬��ȡ���е���������
	 * ������ҵ������
	 */
	public List<ZhangWu> selectAll() {
		try {
			//��ѯ�������ݵ�SQL���
			String sql = "SELECT * FROM gjp_zhangwu";
			//����qr���󷽷�
			List<ZhangWu> list = qr.query(sql, new BeanListHandler<>(ZhangWu.class));
			return list;
		}catch(SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("��ѯ��������ʧ�ܣ�");
		}
	}
	

	
}
