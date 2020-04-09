import java.util.Scanner;

public class Area{
	public static void main(String[] args){
	//double radius,area;//定义半径和面积变量
	System.out.print("请输入半径：");
	Scanner info = new Scanner(System.in);
	double radius = info.nextDouble();
	double area = 3.14*radius*radius;
	System.out.println("半径为" + radius + "的圆的面积为" + area);
	}
}