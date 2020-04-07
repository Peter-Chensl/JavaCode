import java.util.Scanner;

public class Sum{
	public static void main(String[] args){
	System.out.print("请输入一个四位数的整数：");
	Scanner info = new Scanner(System.in);
	int num = info.nextInt();
	int num1 = num/1000,num2 = (num % 1000)/100,num3 = (num % 100) / 10,num4 = (num % 10);
	System.out.println("各个数字之和为：" + (num1 + num2 + num3 + num4));
	}
}
