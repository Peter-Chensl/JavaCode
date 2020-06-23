package homework;

import java.util.Scanner;

public class demo5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个时间！");
		int time = input.nextInt(); 
		if(time >= 0 && time <= 6) {
			System.out.println("现在是凌晨！");
		}else if(time >= 7 && time <= 12) {
			System.out.println("现在是上午");
		}else if(time >=13 && time <= 18) {
			System.out.println("现在是下午");
		}else {
			System.out.println("现在是晚上");
		}
	}
}
