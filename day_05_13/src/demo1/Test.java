package demo1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankCard card = new BankCard();
		ATM atm = new ATM(card);
		boolean falg = true;
		while(falg) {
			System.out.println("请选择操作类型（ 1.存款  2.取款  3.查看余额     4.退出）");
			switch(input.nextInt()) {
			case 1:
				System.out.print("请输入存款金额：");
				atm.deposit(input.nextDouble());
				break;
			case 2:
				System.out.print("请输入取款金额：");
				atm.withDraw(input.nextDouble());
				break;
			case 3:
				atm.show();
				break;
			case 4:
				System.out.print("谢谢使用，请取卡!");
				falg = false;
				break;
			}
		}
	}
}
