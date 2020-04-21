import java.util.Scanner;

//从键盘录入五个人的成绩。统计成绩大于90分的人数
public class CountScore{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		for(int i = 1;i <= 5;i++)
		{
			System.out.print("请输入第"+i + "个人的成绩：");
			double score = input.nextDouble();
			if(score <= 90)
			{
				continue;
			}
			count++;
		}
		System.out.print("成绩在90分以上的人数为：" + count);
	}
}