import java.util.Scanner;

public class Triangle{
	public static void main(String[] args){
		Scanner info = new Scanner(System.in);
		System.out.print("�����������ε�һ���ߣ�");
		double side1 = info.nextDouble();
		System.out.print("�����������εڶ����ߣ�");
		double side2 = info.nextDouble();
		System.out.print("�����������ε�������: ");
		double side3 = info.nextDouble();
		String result = side1 + side2 <= side3 ?"����":side1 + side3 <= side2 ?"����":side2 + side3 <= side1 ?"����":"��";
		System.out.print("�߳�"+side1 +"," + side2 + "," + side3 +"," + result +"����������");
	}
}