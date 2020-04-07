import java.util.Scanner;

public class Ascllnum{
	public static void main(String[] args){
		//求ASCLL码对应的字符
		System.out.print("请输入一个整数：");
		Scanner info = new Scanner(System.in);
		int num = info.nextInt();

		char Ascll = (char)num;
		System.out.println(num + "对应的ASCLL码字符为：" + Ascll);
	}
}