import java.util.Scanner;

public class Week{
	public static void main(String[] args){
		Scanner info= new Scanner(System.in);
		System.out.print("请输入1-7中的任一数字: ");
		int day1 = info.nextInt();
		System.out.print("请输入间隔的天数: ");
		int day2 = info.nextInt();
		int day3 = (day1+day2)%7;
		day3 = day3 == 0 ? 7 : day3;
		System.out.print("如果今天是星期" + day1 + "," + "那么间隔" + day2 + "天后是星期" + day3);
	}
}