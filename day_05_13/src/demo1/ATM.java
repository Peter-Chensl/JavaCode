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
	//��ʾ���
	public void show() {
		System.out.println("��ǰ��" + card.getblance());
	}
	//����
	public void deposit(double money) {
		card.deposite(money);
	}
	public void withDraw(double money) {
		card.withDarw(money);
	}
}
