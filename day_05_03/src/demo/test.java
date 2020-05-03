package demo;

import java.util.Scanner;

public class test {
	//求两个整数的最大公约数和最小公倍数
	public static int getMax(int num1,int num2) {
		if(num1 == num2) {
			return num1;
		}
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		for(int i = num1;i >= 1;i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入两个整数：");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int result = getMax(num1,num2);
		System.out.println(num1 + " " + num2 + "的最大公约数是:" + result);
		System.out.println(num1 + " " + num2 + "的最小公倍数是:" + num1*num2/result);
	}
}


