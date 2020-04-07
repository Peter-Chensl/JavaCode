import java.util.Scanner;

public class Nar{
	public static void main(String[] args){
		//判断一个数三位数是不是水仙花数，一个数等于等于各个位数的立方和的数为水仙花数
		System.out.print("请输入一个三位数：");
		Scanner info = new Scanner(System.in);
		int num = info.nextInt();
		int num1 = num / 100,num2 = (num % 100) /10,num3 = num % 10;
		int result = num1*num1*num1 + num2*num2*num2 + num3*num3*num3;
		String info1 = result != num ? "不是" : "是";
		System.out.println(num + "这个数" + info1 + "水仙花数");
	}
}