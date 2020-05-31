package demo;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 超市管理系统
 * 实现：
 * 1.商品数据的初始化
 * 2.用户的选择菜单
 * 3.1 添加商品
 * 3.2 查看商品
 * 3.3 删除商品
 * 3.4 修改商品
 * 3.5 退出系统
 */
public class Shop {
	public static void main(String[] args) {
		//船舰ArrayList集合，存储商品类型，存储数据类型Friuoitem类型
		ArrayList<FruitItem> array = new ArrayList<FruitItem>();
		init(array);
		while(true) {
			meau();
			int choose = select();
			switch(choose) {
				case 1:
					print(array);
					break;
				case 2:
					addFruit(array);
					break;
				case 3:
					delete(array);
					break;
				case 4:
					set(array);
					break;
				case 5:
					System.out.println("退出程序！");
					//falg = false;
					break;
				default :
					System.out.println("没有此功能！请重新输入！");
					break;
			}
			
		}
	}
	/*
	 * 修改商品功能
	 */
	public static void set(ArrayList<FruitItem> array) {
		System.out.println("选择的是修改功能！");
		System.out.println("请输入商品编号：");
		
		Scanner input = new Scanner(System.in);
		
		int ID = input.nextInt();
		for(int i =0;i < array.size();i++) {
			FruitItem f = array.get(i);
			if(f.Id == ID) {
				System.out.println("请输入子女的商品编号：");
				f.Id = input.nextInt();
				
				System.out.println("请输入子女的商品名称：");
				f.name = input.next();
				
				System.out.println("请输入子女的商品价格：");
				f.price = input.nextDouble();
				System.out.println("修改成功！");
				return;
			}
		}
		System.out.println("您输入的编号不存在！");
		
	}
	/*
	 * 删除功能
	 */
	public static void delete(ArrayList<FruitItem> array) {
		System.out.println("删除功能1");
		System.out.println("请输入商品的编号：");
		Scanner input = new Scanner(System.in);
		
		int ID = input.nextInt();
		
		for(int i = 0;i < array.size();i++ ) {
			FruitItem f = array.get(i);
			if(f.Id == ID) {
				array.remove(i);
				System.out.println("删除成功！");
				return;
			}
		}
		System.out.println("您输入的ID不存在！");
	}
	/*
	 * 添加商品
	 */
	public static void addFruit(ArrayList<FruitItem> array) {
		System.out.println("添加商品：");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入商品编号：");
		int Id = input.nextInt();
		
		System.out.println("请输入商品名称：");
		String name = input.next();
		
		System.out.println("请输入商品价格：");
		double price = input.nextDouble();
		FruitItem f = new FruitItem();
		f.Id = Id;
		f.name = name;
		f.price = price;
		
		array.add(f);
	}
	/*
	 * 显示货物清单
	 */
	public static void print(ArrayList<FruitItem> array) {
		System.out.println("");
		System.out.println("===========商品库存清单==============" );
		System.out.println("商品编号  	商品名称			商品单价");
		for(int i = 0;i < array.size(); i++) {
			FruitItem f = array.get(i);
			System.out.println(f.Id + "    " + f.name + "                              " + f.price);
		}
	}
	/*
	 * 实现用户的选择
	 */
	public static int select() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	/*
	 * 主菜单功能
	 */
	public static void meau() {
		System.out.println("=============商店管理系统===============");
		System.out.println("=            1.货物清单                                                   =");
		System.out.println("=            2.添加货物                                                   =");
		System.out.println("=            3. 删除货物                                               =");
		System.out.println("=            4.修改货物                                                  =");
		System.out.println("=            2.退出                                                           =");
		System.out.println("===================================");
		System.out.println("请输入要执行的操作：");
	}
	/*
	 * 定义初始化方法init
	 */
	public static void init(ArrayList<FruitItem> array) {
		FruitItem f1 = new FruitItem();
		f1.Id = 9527;
		f1.name = "酥饼核桃";
		f1.price = 12.7;

		FruitItem f2 = new FruitItem();
		f2.Id = 9528;
		f2.name = "牡丹饼";
		f2.price = 5.6;
		
		FruitItem f3 = new FruitItem();
		f3.Id = 9529;
		f3.name = "哈密瓜";
		f3.price = 56.7;
		
		array.add(f1);
		array.add(f2);
		array.add(f3);
	}

}
