package homework;

import java.util.Scanner;

public class demo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入毫秒：");
		int i = input.nextInt();
		int day = i/86400000;
		int hour = i%86400000/3600000;
		int min = i%86400000%3600000/60000;
		int sec = i%86400000%3600000%60000/1000;
		int minsec = i%86400000%3600000%60000%1000;
		System.out.println(day + " 天" + hour + "小时" + min + "分钟" + sec + "秒" + minsec + "毫秒");
	}
}
