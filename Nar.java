import java.util.Scanner;

public class Nar{
	public static void main(String[] args){
		//�ж�һ������λ���ǲ���ˮ�ɻ�����һ�������ڵ��ڸ���λ���������͵���Ϊˮ�ɻ���
		System.out.print("������һ����λ����");
		Scanner info = new Scanner(System.in);
		int num = info.nextInt();
		int num1 = num / 100,num2 = (num % 100) /10,num3 = num % 10;
		int result = num1*num1*num1 + num2*num2*num2 + num3*num3*num3;
		String info1 = result != num ? "����" : "��";
		System.out.println(num + "�����" + info1 + "ˮ�ɻ���");
	}
}