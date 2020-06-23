package homework;

import java.util.Scanner;

public class demo11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入当月利润：");
		int a = input.nextInt();	
		double money = 0.0;
		if(a <= 10) {
			money = a*0.1;
		}
		if(a < 20 && a >= 10) {
			money = 10 * 0.01 + (a-10) * 0.075;
			
		}
		if(a < 40 && a >=20) {
			money = 10 * 0.01 + 10 * 0.075 + (a - 20) * 0.05;
		}
		if(a < 60 && a >= 40) {
			money = 10 * 0.01 + 10 * 0.075 + 20 * 0.05 + (a - 40) * 0.03;
		}
		if(a < 100 && a >= 60) {
			money = 10 * 0.01 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + (a - 60) * 0.15;
		}
		if(a >= 100) {
			money = 10 * 0.01 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + 40 * 0.15 + (a-100) * 0.1;
		}
		System.out.println(money + "万元");
	}
}
