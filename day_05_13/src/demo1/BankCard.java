package demo1;

public class BankCard {
	//����
	public BankCard() {
		
	}
	public BankCard(double blance) {
		this.blance = blance;
	}
	//����
	private double blance;
	
	//����
	public void setblance(double blance) {
		this.blance = blance;
	}
	public double getblance() {
		return blance;
	}
	//����
	public void deposite(double money) {
		this.blance += money;
	}
	//ȡ���
	public void withDarw(double money) {
		if(this.blance >= money) {
			this.blance -= money;
		}else {
			System.out.print("�Բ����������㣡");
		}
	}
}
