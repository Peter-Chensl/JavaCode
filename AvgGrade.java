import java.util.Scanner;

//键盘输入5个人的成绩，计算平均分当输入为负数时停止录入
public class AvgGrade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double sum = 0.0;
		int i;

		for(i = 1;i<=5;i++){
			System.out.print("请输入第" + i + "个人的成绩：");
			double score = input.nextInt();
			sum += score;
			if(score < 0){
				break;
			}
		}
		if(6 == i){
		System.out.print("平均分为：" + sum / 5);
		}
	}
}