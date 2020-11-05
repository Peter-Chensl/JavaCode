package gjpAPPservice;

import java.util.List;

import gjpAPPdao.ZhangwuDao;
import gjpAPPdomain.ZhangWu;

public class ZhangWuService {
	private ZhangwuDao dao = new ZhangwuDao();
	public List<ZhangWu> selectAll() {
		return dao.selectAll();
	}
}
