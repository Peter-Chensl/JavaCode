package homework;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		meau();
		boolean flag = true;
		do {
			System.out.println("��ѡ��");
			switch(input.nextInt()) {
			case 1:
				System.out.println("ʹ��Java�����������߼� ");
				break;
			case 2:
				System.out.println("ʹ��Html�����������߼�");
				break;
			case 3:
				System.out.println("ʹ��Sql Sever�����������߼�");
				break;
			case 4:
				System.out.println("ʹ��C#�����������߼� ");
				break;
			case 0:
				System.out.println("�˳�����");
				flag = false;
				break;
			default:
				System.out.println("ѡ�����������ѡ��");
				break;
				
			}
			
		}while(flag);
	}
	public static void meau() {
		System.out.println("|**�γ�����**              |**�γ̴���**|");
		System.out.println("------------------      |---------|");
		System.out.println("|ʹ��Java�����������߼�                      |    **1**|");
		System.out.println("|ʹ��Html�����������߼�                      |    **2**|");
		System.out.println("|ʹ��Sql Sever�����������߼�     |    **3**|");
		System.out.println("|ʹ��C#�����������߼�                              |    **4**|");
	}
}
