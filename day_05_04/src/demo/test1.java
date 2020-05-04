package demo;

import java.util.Scanner;

public class test1 {
	//判断一个数是不是回文数
	public static boolean isflag(int num) {
		int sum = 0;
		int num1 = num;
		while (num != 0) {
			int x = num % 10;
			sum = sum * 10 + x;
			num /= 10;
		}
		return sum == num1;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int num = input.nextInt();
		if(isflag(num)) {
			System.out.print(num + "是回文数");
		}
		else {
			System.out.print(num + "不是回文数");
		}
		
	}

}
