import java.util.Scanner;

public class Area{
	public static void main(String[] args){
	//double radius,area;//����뾶���������
	System.out.print("������뾶��");
	Scanner info = new Scanner(System.in);
	double radius = info.nextDouble();
	double area = 3.14*radius*radius;
	System.out.println("�뾶Ϊ" + radius + "��Բ�����Ϊ" + area);
	}
}