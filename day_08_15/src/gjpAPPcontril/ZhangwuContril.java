package gjpAPPcontril;

import java.util.List;

import gjpAPPdomain.ZhangWu;
import gjpAPPservice.ZhangWuService;

public class ZhangwuContril {
	 private ZhangWuService service = new ZhangWuService();
	/* /*
	  * 定义方法，实现查询所有数据
	  */
	/* public List<ZhangWu> selectAll() {
		return service.selectAll();
	 }*/

		/*
		 * 控制层类定义方法,实现查询所有的账务数据
		 * 方法由试图层调用,方法调用service层
		 */
		public List<ZhangWu> selectAll(){
			return service.selectAll();
		}
}
