import java.util.Scanner;

//从键盘输入一个数，逆序输出
public class Reverse{
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("请输入一个字符串类型的正整数：");
			String num = input.next();
			System.out.println(num);
			System.out.println("逆序后为：");
			for(int i = num.length() - 1;i>= 0;i--){
				System.out.print(num.charAt(i));
			}
	}
}