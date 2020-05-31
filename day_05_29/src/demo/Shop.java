package demo;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ���й���ϵͳ
 * ʵ�֣�
 * 1.��Ʒ���ݵĳ�ʼ��
 * 2.�û���ѡ��˵�
 * 3.1 �����Ʒ
 * 3.2 �鿴��Ʒ
 * 3.3 ɾ����Ʒ
 * 3.4 �޸���Ʒ
 * 3.5 �˳�ϵͳ
 */
public class Shop {
	public static void main(String[] args) {
		//����ArrayList���ϣ��洢��Ʒ���ͣ��洢��������Friuoitem����
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
					System.out.println("�˳�����");
					//falg = false;
					break;
				default :
					System.out.println("û�д˹��ܣ����������룡");
					break;
			}
			
		}
	}
	/*
	 * �޸���Ʒ����
	 */
	public static void set(ArrayList<FruitItem> array) {
		System.out.println("ѡ������޸Ĺ��ܣ�");
		System.out.println("��������Ʒ��ţ�");
		
		Scanner input = new Scanner(System.in);
		
		int ID = input.nextInt();
		for(int i =0;i < array.size();i++) {
			FruitItem f = array.get(i);
			if(f.Id == ID) {
				System.out.println("��������Ů����Ʒ��ţ�");
				f.Id = input.nextInt();
				
				System.out.println("��������Ů����Ʒ���ƣ�");
				f.name = input.next();
				
				System.out.println("��������Ů����Ʒ�۸�");
				f.price = input.nextDouble();
				System.out.println("�޸ĳɹ���");
				return;
			}
		}
		System.out.println("������ı�Ų����ڣ�");
		
	}
	/*
	 * ɾ������
	 */
	public static void delete(ArrayList<FruitItem> array) {
		System.out.println("ɾ������1");
		System.out.println("��������Ʒ�ı�ţ�");
		Scanner input = new Scanner(System.in);
		
		int ID = input.nextInt();
		
		for(int i = 0;i < array.size();i++ ) {
			FruitItem f = array.get(i);
			if(f.Id == ID) {
				array.remove(i);
				System.out.println("ɾ���ɹ���");
				return;
			}
		}
		System.out.println("�������ID�����ڣ�");
	}
	/*
	 * �����Ʒ
	 */
	public static void addFruit(ArrayList<FruitItem> array) {
		System.out.println("�����Ʒ��");
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ʒ��ţ�");
		int Id = input.nextInt();
		
		System.out.println("��������Ʒ���ƣ�");
		String name = input.next();
		
		System.out.println("��������Ʒ�۸�");
		double price = input.nextDouble();
		FruitItem f = new FruitItem();
		f.Id = Id;
		f.name = name;
		f.price = price;
		
		array.add(f);
	}
	/*
	 * ��ʾ�����嵥
	 */
	public static void print(ArrayList<FruitItem> array) {
		System.out.println("");
		System.out.println("===========��Ʒ����嵥==============" );
		System.out.println("��Ʒ���  	��Ʒ����			��Ʒ����");
		for(int i = 0;i < array.size(); i++) {
			FruitItem f = array.get(i);
			System.out.println(f.Id + "    " + f.name + "                              " + f.price);
		}
	}
	/*
	 * ʵ���û���ѡ��
	 */
	public static int select() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	/*
	 * ���˵�����
	 */
	public static void meau() {
		System.out.println("=============�̵����ϵͳ===============");
		System.out.println("=            1.�����嵥                                                   =");
		System.out.println("=            2.��ӻ���                                                   =");
		System.out.println("=            3. ɾ������                                               =");
		System.out.println("=            4.�޸Ļ���                                                  =");
		System.out.println("=            2.�˳�                                                           =");
		System.out.println("===================================");
		System.out.println("������Ҫִ�еĲ�����");
	}
	/*
	 * �����ʼ������init
	 */
	public static void init(ArrayList<FruitItem> array) {
		FruitItem f1 = new FruitItem();
		f1.Id = 9527;
		f1.name = "�ֱ�����";
		f1.price = 12.7;

		FruitItem f2 = new FruitItem();
		f2.Id = 9528;
		f2.name = "ĵ����";
		f2.price = 5.6;
		
		FruitItem f3 = new FruitItem();
		f3.Id = 9529;
		f3.name = "���ܹ�";
		f3.price = 56.7;
		
		array.add(f1);
		array.add(f2);
		array.add(f3);
	}

}
