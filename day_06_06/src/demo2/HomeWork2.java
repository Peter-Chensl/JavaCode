package demo2;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		String str = "nihaonishinide";
		seacherCount(str);
	}
	
	public static void seacherCount(String str) {
		int count = 0;
		int index = 0;
		System.out.println("请输入要查找的字符");
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		while((index = str.indexOf(str1))!=-1) {
			count++;
			str = str.substring(index + str1.length());
		}
		System.out.println(count);
	}
}
