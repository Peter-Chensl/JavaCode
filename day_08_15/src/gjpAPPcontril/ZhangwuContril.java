package gjpAPPcontril;

import java.util.List;

import gjpAPPdomain.ZhangWu;
import gjpAPPservice.ZhangWuService;

public class ZhangwuContril {
	 private ZhangWuService service = new ZhangWuService();
	/* /*
	  * ���巽����ʵ�ֲ�ѯ��������
	  */
	/* public List<ZhangWu> selectAll() {
		return service.selectAll();
	 }*/

		/*
		 * ���Ʋ��ඨ�巽��,ʵ�ֲ�ѯ���е���������
		 * ��������ͼ�����,��������service��
		 */
		public List<ZhangWu> selectAll(){
			return service.selectAll();
		}
}
