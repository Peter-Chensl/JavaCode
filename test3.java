import java.util.Scanner;

//去商场购物，规定只能去5家商店，每家只允许购买3件商品
public class test3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;//统计购买商品的数量
		for(int i = 1;i <= 5;i++){
			System.out.println("欢迎光临第" + i + "家商店");
			for(int j = 1;j <= 3;j++){
				System.out.println("是否购买该商品(y/n):");
				char info = input.next().charAt(0);
				if(info == 'n'){
					break;
				}
				count++;
			}
		}
		System.out.println("一共购买了" + count + "件商品");
	}
}