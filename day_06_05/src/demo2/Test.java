package demo2;

public class Test {
	public static void main(String[] args) {
		Jinli ji = new Jinli("С��", "���»�123465", 56421.25);
		ji.work();
		
		Fuwuyuan f1 = new Fuwuyuan("�仨","����001");
		Fuwuyuan f2 = new Fuwuyuan("���","����002");
		f1.services();
		f1.work();
		
		ChuShi c = new ChuShi("�ϸ���", "��001");
		c.work();
		c.services();
	}
}
