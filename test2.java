import java.util.Scanner;

//打印三角形
public class test2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
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