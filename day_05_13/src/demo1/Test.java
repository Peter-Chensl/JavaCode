package demo1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankCard card = new BankCard();
		ATM atm = new ATM(card);
		boolean falg = true;
		while(falg) {
			System.out.println("��ѡ��������ͣ� 1.���  2.ȡ��  3.�鿴���     4.�˳���");
			switch(input.nextInt()) {
			case 1:
				System.out.print("���������");
				atm.deposit(input.nextDouble());
				break;
			case 2:
				System.out.print("������ȡ���");
				atm.withDraw(input.nextDouble());
				break;
			case 3:
				atm.show();
				break;
			case 4:
				System.out.print("ллʹ�ã���ȡ��!");
				falg = false;
				break;
			}
		}
	}
}
