package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		List<Customer> list = new ArrayList<Customer>();
		Scanner input = new Scanner(System.in);
		list.add(new Customer("孙悟空", 123, "123", "132456"));
		int select;
		do {
			System.out.println("1.新增客户");
			System.out.println("2.显示所有客户");
			System.out.println("3.删除客户");
			System.out.println("4.修改客户");
			System.out.println("0.退出");
			System.out.println("请输入【0-4】");
			select =input.nextInt();
			switch(select) {
			case 0:
			
				break;
			case 1:
				System.out.println("请输入客户的姓名：");
				String name = input.next();
				System.out.println("请输入用户的编号：");
				String id = input.next();
				System.out.println("请输入用户的电话：");
				String tel = input.next();
				System.out.println("请输入客户发让年龄：");
				int age = input.nextInt();
				Customer c = new Customer(name, age, id, tel);
				list.add(c);
				break;
			case 2:
				System.out.println("姓名\t" + "ID \t" + "年龄\t"+ "电话" );
				for(int i = 0;i < list.size();i++) {
					Customer c1 = list.get(i);
					System.out.println(c1.getName() +"\t" + c1.getId()+"\t"+ c1.getAge()+"\t"+c1.getTel());
				}
				break;
			case 3:
				System.out.println("请输入要删除的客户编号：");
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
					System.out.println("未找到编号！");
				}else {
					list.remove(delId);
				}
				break;
			case 4:
				System.out.println("请输入修改客户的编号：");
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
					System.out.println("未找到编号！");
				}else {
					Customer c1 = list.get(index);
					System.out.println("请输入客户的新姓名：");
					String name1 = input.next();
					c1.setName(name1);
					System.out.println("请输入客户的新ID：");
					String id1 = input.next();
					c1.setId(id1);
					System.out.println("请输入客户的新年龄：");
					int age1 = input.nextInt();
					c1.setAge(age1);
					System.out.println("请输入客户的新电话号码：");
					String tel1 = input.next();
					list.set(index, new Customer(name1, age1, id1, tel1));
					System.out.println("修改成功！");
				}
				break;
			default:
				System.out.println("输入错误，请重新输入！");
				break;
			}
		}while(select != 0);
		
		
	}

}
