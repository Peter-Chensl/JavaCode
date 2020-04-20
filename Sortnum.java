import java.util.Scanner;
//输入三个整数，按从小到大的顺序排序输出
public class Sortnum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个数: ");
		int num1 = input.nextInt();
		System.out.print("请输入第二个数：");
		int num2 = input.nextInt();
		System.out.print("请输入第三个数：");
		int num3 = input.nextInt();
		int temp = 0;
		if(num1 > num2){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num1 > num3){
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num2 > num3){
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.print(num1 + " "+ num2 + " " + num3);
	}
}