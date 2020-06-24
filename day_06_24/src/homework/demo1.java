package homework;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		meau();
		boolean flag = true;
		do {
			System.out.println("请选择：");
			switch(input.nextInt()) {
			case 1:
				System.out.println("使用Java语言理解程序逻辑 ");
				break;
			case 2:
				System.out.println("使用Html语言理解程序逻辑");
				break;
			case 3:
				System.out.println("使用Sql Sever语言理解程序逻辑");
				break;
			case 4:
				System.out.println("使用C#语言理解程序逻辑 ");
				break;
			case 0:
				System.out.println("退出程序！");
				flag = false;
				break;
			default:
				System.out.println("选择错误请重新选择！");
				break;
				
			}
			
		}while(flag);
	}
	public static void meau() {
		System.out.println("|**课程名称**              |**课程代码**|");
		System.out.println("------------------      |---------|");
		System.out.println("|使用Java语言理解程序逻辑                      |    **1**|");
		System.out.println("|使用Html语言理解程序逻辑                      |    **2**|");
		System.out.println("|使用Sql Sever语言理解程序逻辑     |    **3**|");
		System.out.println("|使用C#语言理解程序逻辑                              |    **4**|");
	}
}
