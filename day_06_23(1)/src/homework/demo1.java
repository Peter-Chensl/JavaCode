package homework;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		printNum();
	}
	public static void printNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����λ����������");
		int num = input.nextInt();
		int gewei = num%10;
		int shiwei = (num /10)%10;
		int baiwei = num /100;
		System.out.println(num + "�ĸ�λλ�ǣ�"+ gewei + "  ʮλ�ǣ�" + shiwei + "  ��λ�ǣ�" + baiwei);
	}
}
