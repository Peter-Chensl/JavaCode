import java.util.Scanner;

//如果有三个班级，每个班级有四个学生，输入他们的成绩，计算其平均分
public class test1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			for(int i = 1; i <= 3 ;i++){
				double sum = 0;
				System.out.println("请输入第" + i + "个班级的成绩:");
				for(int j = 1;j <= 4;j++)
				{
					System.out.print("请输入第" + j + "个人等成绩:");
					double score = input.nextDouble();
					sum += score;
				}
				System.out.println("平均分为：" + sum/4);
			}
	}
}