package cn.xuexi.gjp.contorller;
/*
 * ���Ʋ㡿������ͼ�������
 */

import java.util.List;

import cn.xuexi.gjp.domain.ZhangWu;
import cn.xuexi.gjp.service.ZhangWuService;

public class ZhangWuController {
	private ZhangWuService service = new ZhangWuService();
	/*
	 * ʵ��ɾ������
	 */
	public void deleteZhangwu(int zwid) {
		// TODO Auto-generated method stub
		service.deleteZhangwu(zwid);
	}
	/*
	 * ���巽����ʵ������༭����
	 * ����ͼ����ã����ݲ�����zhangWu���Ͷ���
	 */
	public void editZhangWu(ZhangWu zw) {
		service.editZhangWu(zw);
	}
	/*
	 * ʵ���������ӹ���
	 * ����ͼ����ã����ݵĲ�����һ������
	 */
	public void addZhangWu(ZhangWu zw) {
		service.addZhangWu(zw);
	}
	
	/*
	 * ���巽����ʵ���������ѯ����
	 */
	public List<ZhangWu> select(String startDate,String endDate){
		return service.select(startDate, endDate);
	}
	/*
	 * �����෽����ʵ�ֲ�ѯ���е���������
	 * ��������ͼ����ã���������service��
	 */
	public List<ZhangWu> selectAll() {
		return service.selectAll();
	}
	
}
