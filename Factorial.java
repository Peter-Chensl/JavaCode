import java.util.Scanner;

//从键盘录入一个数n，计算n！
public class Factorial{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = input.nextInt();
		int sum = 1;
		for(int i = num;i>0;i--){
			sum *= i;
		}
		System.out.println("num! = " + sum);
	}
}