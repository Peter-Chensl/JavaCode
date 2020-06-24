package homework;

public class demo2 {
	public static void main(String[] args) {
		double money = 10000;
		for(int i = 1;i <= 5;i++) {
			money += money*0.003; 
		}
		System.out.println(money);
	}
}
