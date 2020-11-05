package gjpAPPdao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import gjpAPPTools.JDBCUtils;
import gjpAPPdomain.ZhangWu;

public class ZhangwuDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	/*public List<ZhangWu> selectAll() {
		try {
			String sql = "select * from gjp_zhangwu";
			List <ZhangWu> list = qr.query(sql, new BeanListHandler<>(ZhangWu.class));
			return list;
		}catch(Exception ex) {
			System.out.println(ex);
			throw new RuntimeException("��ѯ��������ʧ�ܣ�");
		}
	}
}*/
	public List<ZhangWu> selectAll(){
		try{
		//��ѯ�������ݵ�SQL���
			String sql = "SELECT * FROM gjp_zhangwu";
			//����qr����ķ���,query����,�����BeanListHandler
			List<ZhangWu> list = qr.query(sql, new BeanListHandler<>(ZhangWu.class));
			return list;
		}catch(SQLException ex){
			System.out.println(ex);
			throw new RuntimeException("��ѯ��������ʧ��");
		}
	}
	
	
}
