package homework;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		printNum();
	}
	public static void printNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个三位数的整数：");
		int num = input.nextInt();
		int gewei = num%10;
		int shiwei = (num /10)%10;
		int baiwei = num /100;
		System.out.println(num + "的个位位是："+ gewei + "  十位是：" + shiwei + "  百位是：" + baiwei);
	}
}
