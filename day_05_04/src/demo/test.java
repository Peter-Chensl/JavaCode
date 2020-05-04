package demo;

import java.util.Scanner;

public class test {
	//使用方法实现计算器的加减乘除
	/*第一种方法
	 public static double add(double num1,double num2) {
		return num1 + num2;
	}
	public static double sub(double num1,double num2) {
		return num1 - num2;
	}
	public static double mul(double num1,double num2) {
		return num1 * num2;
	}
	public static double div(double num1,double num2) {
		if(0 == num2) {
			return 0;
		}
		return num1 / num2;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个运算符（+、-、*、/）：");
		char operator = input.next().charAt(0);
		System.out.print("请输入两个数：");
		double num1 =input.nextDouble();
		double num2 = input.nextDouble();
		switch(operator) {
		case '+':
			System.out.println(add(num1,num2));
			break;
		case '-':
			System.out.println(sub(num1,num2));
			break;
		case '*':
			System.out.println(mul(num1,num2));
			break;
		case '/':
			System.out.println(div(num1,num2));
		}
	}*/
	//第二种方法
	public static double ope(double num1,char code,double num2) {
		double info = 0;
		switch(code) {
		case '+':
			info = num1 + num2;
			break;
		case '-':
			info = num1 - num2;
			break;
		case '*':
			info = num1 * num2;
			break;
		case '/':
			if(num2 == 0)
			{
				System.out.print("除数不能为0！");
			}
			info = num1 / num2;
			break;
		}
		return info;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入两个数:");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		System.out.print("请输入运算符：");
		char operator = input.next().charAt(0);
		System.out.print("计算结果为：" + ope(num1,operator,num2));
	}
}

