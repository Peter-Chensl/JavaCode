package homework;

import java.util.Scanner;

public class demo8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("���������");
			int year = input.nextInt();
			System.out.println("�������·�");
			int month = input.nextInt();
			switch(month) {
			case 0:
				System.out.println("���������");
				flag = false;
				break;
			case 1:
				System.out.println(year + "��" + month + "����31��");
				break;
			case 2:
				if(year%4 == 0 && year % 100 !=0 || year % 400==0) {
					System.out.println(year + "��" + month + "����29��");
				}else {
					System.out.println(year + "��" + month + "����28��");
				}
				break;
			case 3:
				System.out.println(year + "��" + month + "����31��");
				break;
			case 4:
				System.out.println(year + "��" + month + "����30��");
				break;
			case 5:
				System.out.println(year + "��" + month + "����31��");
				break;
			case 6:
				System.out.println(year + "��" + month + "����30��");
				break;
			case 7:
				System.out.println(year + "��" + month + "����31��");
				break;
			case 8:
				System.out.println(year + "��" + month + "����31��");
				break;
			case 9:
				System.out.println(year + "��" + month + "����30��");
				break;
			case 10:
				System.out.println(year + "��" + month + "����31��");
				break;
			case 11:
				System.out.println(year + "��" + month + "����30��");
				break;
			case 12:
				System.out.println(year + "��" + month + "����31��");
				break;
			default:
				System.out.println("��������·�����,����������");
				break;
			}
		}
	}
}
