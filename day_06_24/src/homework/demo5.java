package homework;

import java.util.Scanner;

public class demo5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		int n = input.nextInt();
		int num = 0;
		while(n > 0) {
			num *=10;
			num += n %10;
			n /= 10;
			
		}
		System.out.println(num);
	}
}
