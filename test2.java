import java.util.Scanner;

//��ӡ������
public class test2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����������");
		int num = input.nextInt();
		for(int i = 1;i <=num ;i++){
			for(int j = 1;j <= num - i;j++){
				System.out.print(" ");
			}
			for(int k = 1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}