package demo1;

import java.util.ArrayList;
import java.util.Scanner;

//��������
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
				System.out.println("�˳�����");
				return ;
			default:
				System.out.println("�޴˹��ܣ�");
			}
		}
		
	}
	/*
	 * ʵ�ֲ˵�
	 */
	public static int meau() {
		System.out.println("-------------��Ʒ��Ϣ----------------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3.�˳�");
		System.out.println("��ѡ��Ҫִ�еĲ�����");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		return number;
	}
	/*
	 * �޸Ŀ��
	 */
	public static void updata(ArrayList <Goods> array) {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < array.size();i++) {
			Goods g = array.get(i);
			System.out.println("������" + g.brand + "�Ŀ��");
			g.count = input.nextInt();
		}
	}
	/*
	 *���巽�����鿴����嵥 
	 */
	public static void printGoods(ArrayList<Goods> array) {
		System.out.println("-------------��Ʒ��Ϣ----------------");
		System.out.println("Ʒ�� \t                             �ߴ�\t     �۸�\t    �����");
		
		int totalCount = 0;
		double totalMoney = 0;
		
		for(int i = 0;i < array.size();i++) {
			Goods g = new Goods();
			System.out.println(g.brand + "      " + g.size + "       " + g.price + "      " + g.count);
			totalCount = totalCount + g.count;
			totalMoney = totalMoney + g.price*totalCount;
		}
		System.out.println("�ܿ������" + totalCount);
		System.out.println("�ܽ� " + totalMoney);
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
