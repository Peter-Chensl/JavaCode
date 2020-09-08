package cn.xuexi.gjp.service;

import java.util.List;

import cn.xuexi.gjp.dao.ZhangWuDao;
import cn.xuexi.gjp.domain.ZhangWu;

/*
 * 业务层类
 * 接受上一层。控制层的数据
 */
public class ZhangWuService {
	private ZhangWuDao dao = new ZhangWuDao();
	/*
	 * 定义方法实现删除功能
	 */
	public void deleteZhangwu(int zwid) {
		// TODO Auto-generated method stub
		dao.deleteZhangwu(zwid);
	}

	/*
	 * 定义方法实现编辑账务
	 */
	public void editZhangWu(ZhangWu zw) {
		// TODO Auto-generated method stub
		dao.editZhangWu(zw);
	}
	/*
	 * 定义方法，实现添加账务功能
	 */
	public void addZhangWu(ZhangWu zw) {
		dao.addZhangWu(zw);
	}
	
	/*
	 * 定义方法，实现条件查询账务
	 */
	public List<ZhangWu> select(String startDate,String endDate){
		return dao.select(startDate, endDate);
	}
	/*
	 * 定义方法，实现查询所有的账务数据
	 * 此方法由控制层调用，去调用dao层的方法
	 */
	public List<ZhangWu> selectAll() {
		return dao.selectAll();
	}
	
	
}
