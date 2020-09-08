package cn.xuexi.gjp.service;

import java.util.List;

import cn.xuexi.gjp.dao.ZhangWuDao;
import cn.xuexi.gjp.domain.ZhangWu;

/*
 * ҵ�����
 * ������һ�㡣���Ʋ������
 */
public class ZhangWuService {
	private ZhangWuDao dao = new ZhangWuDao();
	/*
	 * ���巽��ʵ��ɾ������
	 */
	public void deleteZhangwu(int zwid) {
		// TODO Auto-generated method stub
		dao.deleteZhangwu(zwid);
	}

	/*
	 * ���巽��ʵ�ֱ༭����
	 */
	public void editZhangWu(ZhangWu zw) {
		// TODO Auto-generated method stub
		dao.editZhangWu(zw);
	}
	/*
	 * ���巽����ʵ�����������
	 */
	public void addZhangWu(ZhangWu zw) {
		dao.addZhangWu(zw);
	}
	
	/*
	 * ���巽����ʵ��������ѯ����
	 */
	public List<ZhangWu> select(String startDate,String endDate){
		return dao.select(startDate, endDate);
	}
	/*
	 * ���巽����ʵ�ֲ�ѯ���е���������
	 * �˷����ɿ��Ʋ���ã�ȥ����dao��ķ���
	 */
	public List<ZhangWu> selectAll() {
		return dao.selectAll();
	}
	
	
}
