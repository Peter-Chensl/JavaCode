import java.util.Scanner;

//�Ӽ�������һ�������������
public class Reverse{
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("������һ���ַ������͵���������");
			String num = input.next();
			System.out.println(num);
			System.out.println("�����Ϊ��");
			for(int i = num.length() - 1;i>= 0;i--){
				System.out.print(num.charAt(i));
			}
	}
}