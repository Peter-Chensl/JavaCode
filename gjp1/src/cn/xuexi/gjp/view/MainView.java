package cn.xuexi.gjp.view;
/*
 * 视图层
 * 数据传递给Controller 层
 */

import java.util.List;
import java.util.Scanner;

import cn.xuexi.gjp.contorller.ZhangWuController;
import cn.xuexi.gjp.domain.ZhangWu;

public class MainView {
	private ZhangWuController controller = new ZhangWuController();
	
	public void run() {
		//创建Scanner对象
		Scanner sc = new Scanner(System .in);
		while(true) {
			System.out.println("----------------管家婆记账软件-----------------");
			System.out.println("1.添加服务           2.编辑服务       3.删除服务     4.查询服务      5.退出系统");
			System.out.println("请输入序号【1-5】：");
			//接收用户得选择
			int choose = sc.nextInt();
			switch(choose) {
			case 1:
				addZhangWu();
				break;
			case 2:
				editZhangWu();
				break;
			case 3:
				deleteZhangwu();
				break;
			case 4:
				selectZhangWu();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("没有此选项，请重新输入");
				break;
			}
		}
	}
	/*
	 * 定义方法实现删除帐务
	 */
	public void deleteZhangwu() {
		selectAll();
		System.out.println("选择的是删除功能，请输入要删除的Id:");
		Scanner sc = new Scanner(System.in);
		int zwid = sc.nextInt();
		controller.deleteZhangwu(zwid);
	}
	
	/*
	 * 定义方法，实现账务的编辑功能
	 */
	public void editZhangWu() {
		//调用查询所有账务数据的功能，显示出来
		selectAll();
		System.out.println("选择的是编辑功能，请输入数据");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入ID：");
		int zwid = sc.nextInt();
		System.out.println("输入分类名称：");
		String flname = sc.next();
		System.out.println("输入金额：");
		double money = sc.nextDouble();
		System.out.println("输入账户：");
		String zhanghu = sc.next();
		System.out.println("输入日期：格式XXXX-XX-XX");
		String createtime = sc.next();
		System.out.println("输入描述：");
		String descrition = sc.next();
		//将用户输入的数据封装
		ZhangWu zw = new ZhangWu(zwid, flname, money, zhanghu, createtime, descrition);
		//调用controller层中的方法实现编辑账务
		controller.addZhangWu(zw);
	}
	
	/*
	 * 定义方法addZhangWu
	 * 添加账务的方法
	 */
	public void addZhangWu() {
		System.out.println("选择的是添加账务功能，请输入以下内容：");
		Scanner sc = new Scanner(System.in);
		System.out.println("输入分类名称：");
		String flname = sc.next();
		System.out.println("输入金额：");
		double money = sc.nextDouble();
		System.out.println("输入账户：");
		String zhanghu = sc.next();
		System.out.println("输入日期：格式XXXX-XX-XX");
		String createtime = sc.next();
		System.out.println("输入描述：");
		String descrition = sc.next();
		ZhangWu zw = new ZhangWu(0, flname, money, zhanghu, createtime, descrition);
		controller.addZhangWu(zw);
		System.out.println("恭喜！添加账务成功！");
	}
	/*
	 * 定义方法selectZhangWu()
	 * 显示查寻得方式
	 */
	public void selectZhangWu() {
		System.out.println("1.查询所有  2.条件查询");
		Scanner sc = new Scanner(System.in);
		int selectChooser = sc.nextInt();
		switch(selectChooser) {
		case 1:
			//查询所有
			selectAll();
			break;
		case 2:
			//条件查询
			select();
			break;
		default:
			System.out.println("没有此选项，请重新输入！");
			break;
		}
	}
	/*
	 * 定义方法，实现查询所有得账务数据
	 */
	public void selectAll() {
		//调用控制层中的方法
		List<ZhangWu> list = controller.selectAll();
		print(list);
	}
	private void print(List<ZhangWu> list) {
		System.out.println("ID\t\t类别\t\t账户\t\t金额\t\t时间\t\t\t说明");
		for(ZhangWu zw :list) {
			System.out.println(zw.getZwid() + "\t\t"+zw.getFlname()+ "\t\t"+zw.getZhanghu()+ "\t\t"+zw.getMoney()+ "\t\t"+zw.getCreatetime()+ "\t\t"+zw.getDescrition());
		}
	}
	/*
	 * 定义方法实现条件查询数据
	 */
	public void select() {
		System.out.println("选择查询功能，请输入查询日期格式为XXXX-XX-XX");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入起始日期：");
		String startDate = sc.nextLine();
		System.out.println("请输入结束日期：");
		String endDate = sc.nextLine();
		List<ZhangWu> list = controller.select(startDate, endDate);
		if(list.size() != 0) {
			print(list);
		}else {
			System.out.println("没有查询到数据！");
		}
	}
}
