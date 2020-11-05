package gjpAPPview;



import java.util.List;
import java.util.Scanner;

import gjpAPPcontril.ZhangwuContril;
import gjpAPPdomain.ZhangWu;

public class MainView {
	private ZhangwuContril contril = new ZhangwuContril();
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("--------------管家婆家庭记账软件-------------------");
			System.out.println("-             1.添加账务                                                                               -");
			System.out.println("-             2.编辑账务                                                                               -");
			System.out.println("-             3.删除账务                                                                               -");
			System.out.println("-             4.查询账务                                                                               -");
			System.out.println("-             5.退出程序                                                                               -");
			System.out.println("请输入要执行的操作序号【1-5】：");
			int choose = sc.nextInt();
			switch(choose) {
			case 1:
			//	addZhangWu();
				break;
			case 2:
			//	editZhangWu();
				break;
			case 3:
				//hangWu();
				break;
			case 4:
				selectZhangWu();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("没有此选项，请重新输入！");
				break;
			}
		}
		
	}
	public void selectZhangWu() {
		System.out.println("1.查询所有   2.条件查询");
		Scanner sc = new Scanner(System.in);
		int selectChoose = sc.nextInt();
		
		switch(selectChoose) {
		case 1:
			selectAll();
			break;
		case 2:
			select();
			break;
		default:
			System.out.println("输入错误，请重新输入!");
			break;
		}
	}
	/*定义方法，实现查询所又得账务
	 * 
	 */
	public void selectAll() {
		//调用控制层中得方法，查询所有数据*/
		List<ZhangWu> list = contril.selectAll();
		System.out.println("ID\t类别\t账户\t金额\t时间\t说明");
		for(ZhangWu zw :list) {
			System.out.println(zw.getZwid()+ "\t"+zw.getFlname()+"\t"+zw.getZhanghu()+"\t"+zw.getMoney()+"\t"+zw.getCreatetime()+"\t"+zw.getDescription());
		}
	}
	/*定义方法，实现条件查询
	 * 
	 */
	public void select() {
		
	}
}
