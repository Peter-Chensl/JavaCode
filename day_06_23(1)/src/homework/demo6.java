package homework;

import java.util.Scanner;

public class demo6 {
	public static void main(String[] args) {
		System.out.println("请输入一个年份！");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		if(year%4 == 0 && year % 100 !=0 || year % 400==0) {
			System.out.println(year + "年有366天");
		}else {
			System.out.println(year + "年有365天");
		}
	}
}
