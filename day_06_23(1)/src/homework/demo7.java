package homework;

import java.util.Scanner;

public class demo7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个5位数！");
		int num = input.nextInt();
		if(num % 10 == num /10000 && num % 10000 / 1000 == num % 100 / 10) {
			System.out.println(num + "是回文数");
		}else {
			System.out.println(num + "不是是回文数");
		}
		
	}
}
