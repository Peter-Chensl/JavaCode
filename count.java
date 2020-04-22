import java.util.Scanner;

//从键盘上输入正数和负数，分别统计正数的个数和负数的个数，并计算所有数的和，输入0表示结束
public class count{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count1 = 0;//统计正数个数
		int count2 = 0;//统计负数个数
		double sum = 0;
		while(true){
			System.out.print("请输入一个数：");
			double num = input.nextDouble();
			if(0 == num){
				break;
			}else if(num > 0){
				count1++;
			}else{
				count2++;
			}
			sum +=num;
		}
		System.out.print("正数的个数" + count1 );
		System.out.print("负数的个数" +count2  );
		System.out.print( "所有数字的和为：" +sum );
	}
}