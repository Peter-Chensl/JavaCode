package demo;


public class People {
	int leg,hand;
	String name;
	People(String s){
		name = s;
		this.init();
	}
	void init() {
		leg = 2;
		hand = 2;
		System.out.println(name + "��" + hand + "ֻ��" + leg + "ֻ��");
	}
	public static void main(String[] args) {
		People p = new People("С��");
	}
}
