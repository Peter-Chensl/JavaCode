package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		List<Customer> list = new ArrayList<Customer>();
		Scanner input = new Scanner(System.in);
		list.add(new Customer("�����", 123, "123", "132456"));
		int select;
		do {
			System.out.println("1.�����ͻ�");
			System.out.println("2.��ʾ���пͻ�");
			System.out.println("3.ɾ���ͻ�");
			System.out.println("4.�޸Ŀͻ�");
			System.out.println("0.�˳�");
			System.out.println("�����롾0-4��");
			select =input.nextInt();
			switch(select) {
			case 0:
			
				break;
			case 1:
				System.out.println("������ͻ���������");
				String name = input.next();
				System.out.println("�������û��ı�ţ�");
				String id = input.next();
				System.out.println("�������û��ĵ绰��");
				String tel = input.next();
				System.out.println("������ͻ��������䣺");
				int age = input.nextInt();
				Customer c = new Customer(name, age, id, tel);
				list.add(c);
				break;
			case 2:
				System.out.println("����\t" + "ID \t" + "����\t"+ "�绰" );
				for(int i = 0;i < list.size();i++) {
					Customer c1 = list.get(i);
					System.out.println(c1.getName() +"\t" + c1.getId()+"\t"+ c1.getAge()+"\t"+c1.getTel());
				}
				break;
			case 3:
				System.out.println("������Ҫɾ���Ŀͻ���ţ�");
				String delId = input.next();
				int delIndex = -1;
				for(int i = 0;i < list.size();i++) {
					Customer c1 = list.get(i);
					if( delId.equals(c1.getId())) {
						delIndex = i;
						break;
					}
				}
				if(delIndex == -1) {
					System.out.println("δ�ҵ���ţ�");
				}else {
					list.remove(delId);
				}
				break;
			case 4:
				System.out.println("�������޸Ŀͻ��ı�ţ�");
				String setIndex = input.next();
				int index = -1;
				for(int i = 0; i < list.size();i++) {
					Customer c1 = list.get(i);
					if( setIndex.equals(c1.getId())) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("δ�ҵ���ţ�");
				}else {
					Customer c1 = list.get(index);
					System.out.println("������ͻ�����������");
					String name1 = input.next();
					c1.setName(name1);
					System.out.println("������ͻ�����ID��");
					String id1 = input.next();
					c1.setId(id1);
					System.out.println("������ͻ��������䣺");
					int age1 = input.nextInt();
					c1.setAge(age1);
					System.out.println("������ͻ����µ绰���룺");
					String tel1 = input.next();
					list.set(index, new Customer(name1, age1, id1, tel1));
					System.out.println("�޸ĳɹ���");
				}
				break;
			default:
				System.out.println("����������������룡");
				break;
			}
		}while(select != 0);
		
		
	}

}
