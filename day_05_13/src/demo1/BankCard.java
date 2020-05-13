package demo1;

public class BankCard {
	//构造
	public BankCard() {
		
	}
	public BankCard(double blance) {
		this.blance = blance;
	}
	//属性
	private double blance;
	
	//方法
	public void setblance(double blance) {
		this.blance = blance;
	}
	public double getblance() {
		return blance;
	}
	//存款方法
	public void deposite(double money) {
		this.blance += money;
	}
	//取款方法
	public void withDarw(double money) {
		if(this.blance >= money) {
			this.blance -= money;
		}else {
			System.out.print("对不起，您的余额不足！");
		}
	}
}
