package demo;
//��������������Ϊ�������д���
public class trst {
	public static void change(int num1,int num2) {
		num1 = num1 + 10;
		num2 = num1 +num2;
		System.out.println("change�е�num1:" + num1);
		System.out.println("change�е�num2:" + num2);
	}
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		trst.change(num1, num2);
		System.out.println("main�е�num1:" + num1);
		System.out.println("main�е�num2:" + num2);
	}
}
