import java.util.Scanner;
//������������������С�����˳���������
public class Sortnum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ����: ");
		int num1 = input.nextInt();
		System.out.print("������ڶ�������");
		int num2 = input.nextInt();
		System.out.print("���������������");
		int num3 = input.nextInt();
		int temp = 0;
		if(num1 > num2){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num1 > num3){
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num2 > num3){
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.print(num1 + " "+ num2 + " " + num3);
	}
}