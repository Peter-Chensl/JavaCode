package demo1;

import java.util.ArrayList;
import java.util.Scanner;

//库存管理案例
public class Shop {
	public static void main(String[] args) {
		ArrayList<Goods> array = new ArrayList<Goods>();
		
		addGoods(array);
		
		while(true) {
			int number = meau();
			switch(number) {
			case 1:
				printGoods(array);
				break;
			case 2:
				updata(array);
				break;
			case 3:
				System.out.println("退出程序！");
				return ;
			default:
				System.out.println("无此功能！");
			}
		}
		
	}
	/*
	 * 实现菜单
	 */
	public static int meau() {
		System.out.println("-------------商品信息----------------");
		System.out.println("1.查看库存清单");
		System.out.println("2.修改商品库存数量");
		System.out.println("3.退出");
		System.out.println("请选择要执行的操作：");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		return number;
	}
	/*
	 * 修改库存
	 */
	public static void updata(ArrayList <Goods> array) {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < array.size();i++) {
			Goods g = array.get(i);
			System.out.println("请输入" + g.brand + "的库存");
			g.count = input.nextInt();
		}
	}
	/*
	 *定义方法，查看库存清单 
	 */
	public static void printGoods(ArrayList<Goods> array) {
		System.out.println("-------------商品信息----------------");
		System.out.println("品牌 \t                             尺寸\t     价格\t    库存量");
		
		int totalCount = 0;
		double totalMoney = 0;
		
		for(int i = 0;i < array.size();i++) {
			Goods g = new Goods();
			System.out.println(g.brand + "      " + g.size + "       " + g.price + "      " + g.count);
			totalCount = totalCount + g.count;
			totalMoney = totalMoney + g.price*totalCount;
		}
		System.out.println("总库存量：" + totalCount);
		System.out.println("总金额： " + totalMoney);
	}
	public static void addGoods(ArrayList<Goods> array) {
		Goods g1 = new Goods();
		Goods g2 = new Goods();
		
		g1.brand = "Macbppk";
		g1.size = 13.3;
		g1.price = 9999.99;
		g1.count = 13;
		
		g2.brand = "Macbook";
		g2.size = 13.3;
		g2.price = 9989.99;
		g2.count = 1;
		
		array.add(g1);
		array.add(g2);
	}
}
