package demo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Teacher T = new Teacher();
		T.menu();
		boolean flag = true;
		while(flag) {
			System.out.println("��ѡ��Ҫʹ�õĴ�ӡ����");
			switch(input.nextInt()) {
			case 1:
				InkjetPrinter in = new InkjetPrinter();
				T.user(in);
				flag = false;
				break;
			case 2:
				LaserPrinter  L = new LaserPrinter();
				T.user(L);
				flag = false;
				break;
			default:
				System.out.println("ѡ�����������ѡ��!");
				break;
			}
		}
	}
}
