import java.util.Scanner;

//�Ӽ���¼��һ����n������n��
public class Factorial{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
		int num = input.nextInt();
		int sum = 1;
		for(int i = num;i>0;i--){
			sum *= i;
		}
		System.out.println("num! = " + sum);
	}
}