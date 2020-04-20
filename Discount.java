import java.util.Scanner;

public class Discount{
	public static void main(String[] args){
		//普通用户购物满100元，打九折，会员用户购物打8.5折，会员购物满200元打7.5折，最后输出金额
		Scanner input = new Scanner(System.in);
		System.out.print("请输入是否是会员(Y/N):");
		char vip = input.next().charAt(0);

		System.out.print("\n请输入消费金额：");
		double money = input.nextDouble();
		double summoney = 0.0;
		if('Y' == vip){
			if(money >= 200){
				summoney = money*0.75;
			}
			else{
				summoney = money*0.85;
			}
		}
		else{
			if(money >= 100){
				summoney = money*0.95;
			}
			else{
				summoney = money;
			}
			
		}
		System.out.print("总金额为：" + summoney);
	
	}
} 