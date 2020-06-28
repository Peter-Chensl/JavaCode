package homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 1、新增整数
2、删除整数
3、修改整数
4、显示所有整数
5、排行榜
0、退出系统
 */
public class demo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List array = new ArrayList();
		array.add(1);
		array.add(3);
		array.add(4);
		array.add(5);
		int num;
		do {
			System.out.println("0.退出");
			System.out.println("1.新增整数");
			System.out.println("2.删除整数");
			System.out.println("3.修改整数");
			System.out.println("4.显示所有整数");
			System.out.println("5.排行榜");
			System.out.println("请选择：");
			num = input.nextInt();
			switch(num) {
			case 0:
				break;
			case 1:
				System.out.println("请输入你要增加的整数：");
				int myNum = input.nextInt();
				array.add(myNum);
				break;
			case 2:
				System.out.println("请输入你要删除的数字：");
				int delNum = input.nextInt();
				array.remove(new Integer(delNum));
				break;
			case 3:
				System.out.println("请输入修改前的数字：");
				int oldNum = input.nextInt();
				if(array.contains(oldNum)) {
					System.out.println("请输入修改后的数字：");
					int newNum = input.nextInt();
					int index = array.indexOf(oldNum);
					array.set(index, newNum);
				}else {
					System.out.println("修改的数字不存在！");
				}
				
				break;
			case 4:
				for(int i = 0;i < array.size();i++) {
					System.out.print(array.get(i) + " ");
				}
				System.out.println();
				break;
			case 5:
				Collections.sort(array);
				break;
			default:
				System.out.println("输入错误，请重新输入！");
				break;
			}
		}while(num!=0);
	}
}
