package homework;

import java.util.Scanner;

public class demo9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年：");
		int year = input.nextInt();
		System.out.println("请输入月：");
		int month = input.nextInt();
		System.out.println("请输入日：");
		int day = input.nextInt();
		int[] MONTH = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int nowDay = 0;
		if(year%4 == 0 && year % 100 !=0 || year % 400==0) {
			MONTH[2] = 29;
		}
		for(int i = 1;i < month;i++) {
			nowDay += MONTH[i];
		}
		nowDay += day; 
		System.out.println("这一天是" + year + "的第" + nowDay  + "天");
	}
}
