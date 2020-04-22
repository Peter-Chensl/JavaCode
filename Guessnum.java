import java.util.Scanner;

//猜数游戏，生成一个【0，100）之间的随机数，提示用户输入猜测的数字；
public class Guessnum{
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