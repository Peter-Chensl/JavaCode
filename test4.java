import java.util.Scanner;

public class test4{
	public static void main(String[] args){
		//求1-2+3-4+5.....n的和
		//第一种方法
		/*int sum = 0;
		System.out.print("请输入一个正整数：");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i = 1;i <= num;i++){
			if(i % 2 == 0){
				sum -= i;
			}else{
				sum += i;
			}
		}
		System.out.printf("sum = " + sum);*/
		//第二种方法
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int num = input.nextInt();
		int j = 1;
		int sum = 0;
		for(int i =1;i <= num;i++){
			sum += i*j;
			j = -j;
		}
		System.out.print("sum = " + sum);
	}
}
class test5	{
	public static void main(String[] args){
		//求任意两个数范围之间的起始位置
		Scanner input = new Scanner(System.in);
		System.out.print("请输入起始位置：");
		int start = input.nextInt();
		System.out.print("请输入结束位置：");
		int end = input.nextInt();
		int sum = 0;
		for(;start <= end;start++){
			if(start % 2 != 0){
				sum += start;
			}
		}
		System.out.print("sum = " + sum);
	}
}
class test6{
	public static void main(String[] args){
		//打印所有三位数的水仙花数
		int i = 100;
		for(;i < 1000;i++){
			int gewei = i % 10;
			int shiwei = i / 10 % 10;
			int baiwei = i / 100;
			int sum = gewei *gewei*gewei + shiwei * shiwei * shiwei + baiwei * baiwei * baiwei;
			if(i == sum){
				System.out.println(i);
			}
		}
		
	}
	
}
class test7{
	public static void main(String[] args){
		double sum = 0.0;
		for(double i = 1; i <= 97;i +=2){
			sum += i / (i + 2);
		}
		System.out.print("sum =" + String.format("%.2f",sum));
	}
}

class test8{
	public static void main(String[] args){
		//判断一个数是否为素数
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int num = input.nextInt();
		int i;
		for(i = 2;i < num;i++){
			if(num % i == 0){
				System.out.print(num + "不是素数");
				break;
			}
		}
		if(i == num){
			System.out.print(num + "是素数");
		}
	}
}