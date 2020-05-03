package demo;

import java.util.Scanner;

public class test {
	//输出1-50中所有的奇数。采用无参数返回值的方法
//	public static void PrintNum() {
//		int i = 1;
//		for(;i < 50;i++) {
//			if(i % 2 == 1) {
//				System.out.println(i);
//			}
//		}
//	}
//	
	//将十进制转化为二进制
//	public static void change() {
//		Scanner input = new Scanner(System.in);
//		System.out.print("请输入一个十进制正整数：");
//		int num = input.nextInt();
//		String info = " ";
//		while(num != 0) {
//			int x = num % 2;
//			info = x +info;
//			num /= 2; 
//		}
//		System.out.print(info);
//	}
	//计算1-100的和
//	public static int SumNum() {
//		int sum = 0;
//		for(int i = 1; i <= 100;i++) {
//			sum += i;
//		}
//		return sum;
//	}
	//编写一个方法，实现输出一个学生的身份信息（班级名称、性别、年龄、身高）
	public static void printStu(String className,String name,char sex,double height) {
		System.out.println("学生信息如下");
		System.out.println("班级：" + className);
		System.out.println("姓名：" + name);
		System.out.println("性别：" + sex);
		System.out.println("身高：" + height);
	}
	public static void main(String[] args) {
		//PrintNum();
		//change();
//		int num = SumNum();
//		System.out.print(num);
		Scanner input = new Scanner(System.in);
		System.out.print("请输入班级：");
		String className = input.next();
		System.out.print("请输入学生姓名：");
		String name = input.next();
		System.out.print("请输入性别：");
		char sex = input.next().charAt(0);
		System.out.print("请输入身高：");
		int height = input.nextInt();
		printStu(className,name,sex,height);
	}
}
