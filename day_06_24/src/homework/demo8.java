package homework;

import java.util.Scanner;

public class demo8 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		int random = (int)(Math.random()*100);//生成一个【0，100）的随机数
		while(true){
			System.out.print("请输入你猜测的数字：");
			int guess = input.nextInt();
			count++;
			if(guess == random){
				System.out.println("恭喜你！猜对了，你可真是个小天才呢！");
				switch(count) {
				case 1:
					System.out.println("你太有才了！");
					break;
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					System.out.println("这么快就才出来了，很聪明么！");
					break;
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
					System.out.println("猜了半天才猜出来，小同志，商需努力啊！");
					break;
				default:
					System.out.println("对不起您以达到最大猜测次数！");
					break;
				}
				System.out.print("游戏结束");
				break;
			}else if(guess > random){
				System.out.print("呀，你猜的数字有点大了！\n");
			}else{
				System.out.print("你猜小了！\n");
			}
		}
		System.out.print("你一共猜了" + count +"次");
	}

}
