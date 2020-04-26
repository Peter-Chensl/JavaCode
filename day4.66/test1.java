import java.util.Scanner;

//输入两个数n和a, 如n = 4,a = 3,求3 + 33 + 333 + 3333的和
public class test1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入n的值：");
		int n = input.nextInt();
		System.out.print("请输入a的值：");
		int a = input.nextInt();
		int sum = 0,x = a;
		for(int i = 1;i <= n;i++){
			sum += a;
			a = a*10 + x;
		}
		System.out.print("sum = " + sum);
	}
}

class test2{
	public static void main(String[] args){
		/*某公司采用公用电话传递数据，数据都是四位数，在传递过程中是加密的，加密规则如下：
		每位数字都加上5，然后用和除以10的余数代替该数字。再将第一位和第四位交换，第二位和第三位交换
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个四位数；");
		int num = input.nextInt();
		/*第一种方法
		int gewei = num % 10;
		int shiwei = num / 10 % 10;
		int baiwei = num / 100 % 10;
		int qianwei = num / 1000;
		gewei = (gewei + 5) % 10;
		shiwei = (shiwei + 5) % 10;
		baiwei = (baiwei + 5) % 10;
		qianwei = (qianwei + 5) % 10;
		System.out.print(gewei + "" + shiwei + "" + baiwei + "" + qianwei);
		*/
		//第二种方法
		int sum = 0;

		while(num != 0){
			int x = (num + 5) % 10;
			sum = sum * 10 + x;
			num /= 10;
		}
		System.out.print(sum);
	}

}
class test3{
	public static void main(String[] args){
		//依次输入5句话，逆序输出
		Scanner input = new Scanner(System.in);
		String[] infos = new String[5];
		for(int i = 0;i < 5;i++){
			System.out.print("请输入第" + (i+1) + "句话：");
			infos[i] = input.next();
		}
		System.out.println("-------逆序输出------------");
		for(int j = 4; j >= 0;j--){
			System.out.println(infos[j]);
		}
	}
}