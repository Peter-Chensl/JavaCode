package homework;

import java.util.Scanner;

public class demo6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		int num = input.nextInt();
		for(int i = 0;i < num;i++) {
			for(int k = num;k > i;k--) {
				System.out.print(" ");
			}
			System.out.print(" ");
			for(int j = 0;j < 2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
