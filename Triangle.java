import java.util.Scanner;

public class Triangle{
	public static void main(String[] args){
		Scanner info = new Scanner(System.in);
		System.out.print("请输入三角形第一条边：");
		double side1 = info.nextDouble();
		System.out.print("请输入三角形第二条边：");
		double side2 = info.nextDouble();
		System.out.print("请输入三角形第三条边: ");
		double side3 = info.nextDouble();
		String result = side1 + side2 <= side3 ?"不能":side1 + side3 <= side2 ?"不能":side2 + side3 <= side1 ?"不能":"能";
		System.out.print("边长"+side1 +"," + side2 + "," + side3 +"," + result +"构成三角形");
	}
}