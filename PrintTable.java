import java.util.Scanner;

//从键盘输入一个数，打印对应的乘法表格，例如输入9，则打印九九乘法表
public class PrintTable{
	public static void main(String[] args){
		System.out.print("请输入一个整数：");
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