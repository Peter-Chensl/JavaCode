package demo1;

public class ATM {
	public ATM() {
		
	}
	public ATM(BankCard card) {
		this.card = card;
	}
	private BankCard card;
	public void setCard(BankCard card) {
		this.card = card;
	}
	public BankCard getCard() {
		return card;
	}
	//显示余额
	public void show() {
		System.out.println("当前余额：" + card.getblance());
	}
	//存款方法
	public void deposit(double money) {
		card.deposite(money);
	}
	public void withDraw(double money) {
		card.withDarw(money);
	}
}
