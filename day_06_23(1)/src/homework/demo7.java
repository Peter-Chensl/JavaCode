package homework;

import java.util.Scanner;

public class demo7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��5λ����");
		int num = input.nextInt();
		if(num % 10 == num /10000 && num % 10000 / 1000 == num % 100 / 10) {
			System.out.println(num + "�ǻ�����");
		}else {
			System.out.println(num + "�����ǻ�����");
		}
		
	}
}
