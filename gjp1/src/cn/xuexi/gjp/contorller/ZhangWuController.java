package cn.xuexi.gjp.contorller;
/*
 * 控制层】接收视图层的数据
 */

import java.util.List;

import cn.xuexi.gjp.domain.ZhangWu;
import cn.xuexi.gjp.service.ZhangWuService;

public class ZhangWuController {
	private ZhangWuService service = new ZhangWuService();
	/*
	 * 实现删除功能
	 */
	public void deleteZhangwu(int zwid) {
		// TODO Auto-generated method stub
		service.deleteZhangwu(zwid);
	}
	/*
	 * 定义方法，实现账务编辑功能
	 * 由视图层调用，传递参数，zhangWu类型对象
	 */
	public void editZhangWu(ZhangWu zw) {
		service.editZhangWu(zw);
	}
	/*
	 * 实现账务的添加功能
	 * 由视图层调用，传递的参数是一个对象
	 */
	public void addZhangWu(ZhangWu zw) {
		service.addZhangWu(zw);
	}
	
	/*
	 * 定义方法，实现条件查查询功能
	 */
	public List<ZhangWu> select(String startDate,String endDate){
		return service.select(startDate, endDate);
	}
	/*
	 * 定义类方法，实现查询所有得账务数据
	 * 方法由试图层调用，方法调用service层
	 */
	public List<ZhangWu> selectAll() {
		return service.selectAll();
	}
	
}
