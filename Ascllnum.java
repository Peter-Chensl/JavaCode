import java.util.Scanner;

public class Ascllnum{
	public static void main(String[] args){
		//��ASCLL���Ӧ���ַ�
		System.out.print("������һ��������");
		Scanner info = new Scanner(System.in);
		int num = info.nextInt();

		char Ascll = (char)num;
		System.out.println(num + "��Ӧ��ASCLL���ַ�Ϊ��" + Ascll);
	}
}