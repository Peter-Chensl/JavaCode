import java.util.Scanner;

//�Ӽ�������һ��������ӡ��Ӧ�ĳ˷�������������9�����ӡ�žų˷���
public class PrintTable{
	public static void main(String[] args){
		System.out.print("������һ��������");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i = 1;i <= num;i++){
			for(int j = 1;j <= i;j++){
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}